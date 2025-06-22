package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class SearchEpisodesQueryResponse extends GraphQLResult<Map<String, EpisodeConnection>> {

    private static final String OPERATION_NAME = "searchEpisodes";

    public SearchEpisodesQueryResponse() {
    }

    public EpisodeConnection searchEpisodes() {
        Map<String, EpisodeConnection> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
