import annict.graphql.sample.model.*;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public interface SearchEpisodesQueryResolver {

    EpisodeConnection searchEpisodes(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, EpisodeOrder orderBy) throws Exception;

}
