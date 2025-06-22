package annict.sample.batch.tasklet;

import java.util.List;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import annict.graphql.sample.model.OrderDirection;
import annict.graphql.sample.model.SearchWorksQueryRequest;
import annict.graphql.sample.model.SearchWorksQueryResponse;
import annict.graphql.sample.model.WorkConnectionResponseProjection;
import annict.graphql.sample.model.WorkEdgeResponseProjection;
import annict.graphql.sample.model.WorkOrder;
import annict.graphql.sample.model.WorkOrderField;
import annict.graphql.sample.model.WorkResponseProjection;
import annict.sample.batch.util.GraphQLUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Component
@StepScope
@Slf4j
public class AnnictDataProcessTasklet implements Tasklet {
    private final GraphQLUtils graphQLUtils;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext)
            throws Exception {

        var workResponseProjection =
                new WorkResponseProjection()
                        .id()
                        .title()
                        .annictId()
                        .watchersCount();

        var workEdgeResponseProjection =
                new WorkEdgeResponseProjection()
                        .node(workResponseProjection);

        var workConnectionResponseProjection =
                new WorkConnectionResponseProjection()
                        .edges(workEdgeResponseProjection);

        var searchWorksQueryRequest = SearchWorksQueryRequest
                .builder()
                .setSeasons(List.of("2025-spring"))
                .setOrderBy(WorkOrder.builder()
                        .setDirection(OrderDirection.DESC)
                        .setField(WorkOrderField.WATCHERS_COUNT)
                        .build())
                .setFirst(10)
                .build();

        var request =
                new GraphQLRequest(searchWorksQueryRequest, workConnectionResponseProjection);

        var response =
                graphQLUtils.sendRequest(request, SearchWorksQueryResponse.class);

//        if (Objects.isNull(response)
//                || Objects.isNull(response.getData())) {
//            log.error("No data received from GraphQL request");
//            return RepeatStatus.FINISHED;
//        }
        
        response.searchWorks()
            .getEdges()
            .stream()
            .map(edge -> edge.getNode())
            .forEach(work -> {
                log.info("annictId: {} , title: {}, watchersCount: {}",
                        work.getAnnictId(),
                        work.getTitle(),
                        work.getWatchersCount());
            });
        ;

        return RepeatStatus.FINISHED;
    }
}
