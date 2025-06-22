package annict.sample.batch.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import annict.graphql.sample.model.Cast;
import annict.graphql.sample.model.CastConnection;
import annict.graphql.sample.model.CastConnectionResponseProjection;
import annict.graphql.sample.model.CastEdge;
import annict.graphql.sample.model.CastEdgeResponseProjection;
import annict.graphql.sample.model.CastResponseProjection;
import annict.graphql.sample.model.SearchWorksQueryRequest;
import annict.graphql.sample.model.SearchWorksQueryResponse;
import annict.graphql.sample.model.Work;
import annict.graphql.sample.model.WorkConnectionResponseProjection;
import annict.graphql.sample.model.WorkEdgeResponseProjection;
import annict.graphql.sample.model.WorkResponseProjection;
import annict.sample.batch.model.CastModel;
import annict.sample.batch.model.WorkModel;
import annict.sample.batch.util.GraphQLUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class AnnictService {
    private final GraphQLUtils graphQLUtils;

    public List<WorkWithCasts> fetchWorksWithCasts(String season) {
        if (season == null || season.isBlank()) {
            log.warn("Season parameter is null or blank.");
            return List.of();
        }
        try {
            var castProjection = new CastResponseProjection().annictId().name().nameEn();
            var castEdgeProjection = new CastEdgeResponseProjection().node(castProjection);
            var castConnectionProjection = new CastConnectionResponseProjection().edges(castEdgeProjection);
            var workProjection = new WorkResponseProjection()
                    .annictId().title().watchersCount()
                    .casts(castConnectionProjection);
            var workEdgeProjection = new WorkEdgeResponseProjection().node(workProjection);
            var workConnectionProjection = new WorkConnectionResponseProjection().edges(workEdgeProjection);
            var searchWorksQueryRequest = SearchWorksQueryRequest.builder()
                    .setSeasons(List.of(season))
                    .setFirst(100)
                    .build();
            var request = new GraphQLRequest(searchWorksQueryRequest, workConnectionProjection);
            var response = graphQLUtils.sendRequest(request, SearchWorksQueryResponse.class);
            if (response == null || response.getData() == null) {
                log.warn("No response or data from GraphQL for season: {}", season);
                return List.of();
            }
            return response.searchWorks().getEdges().stream()
                    .map(edge -> {
                        var work = edge.getNode();
                        var casts = Optional.ofNullable(work.getCasts())
                                .map(CastConnection::getEdges)
                                .stream().flatMap(List::stream)
                                .map(CastEdge::getNode)
                                .filter(Objects::nonNull)
                                .toList();
                        return new WorkWithCasts(work, casts);
                    })
                    .toList();
        } catch (Exception e) {
            log.error("Failed to fetch works with casts for season {}", season, e);
            throw new RuntimeException("GraphQL fetch failed", e);
        }
    }

    public List<WorkWithCastsModel> fetchWorksWithCastsModel(String season) {
        var worksWithCasts = fetchWorksWithCasts(season);
        return worksWithCasts.stream()
            .map(wc -> new WorkWithCastsModel(
                new WorkModel(
                    wc.work().getAnnictId(),
                    wc.work().getTitle(),
                    wc.work().getWatchersCount()
                ),
                wc.casts().stream()
                    .map(c -> new CastModel(
                        c.getAnnictId(),
                        c.getName(),
                        c.getNameEn(),
                        wc.work().getAnnictId()
                    ))
                    .toList()
            ))
            .toList();
    }

    public record WorkWithCasts(Work work, List<Cast> casts) {}
    public record WorkWithCastsModel(WorkModel work, List<CastModel> casts) {}
}