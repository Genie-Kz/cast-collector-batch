package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class SearchWorksQueryResponse extends GraphQLResult<Map<String, WorkConnection>> {

    private static final String OPERATION_NAME = "searchWorks";

    public SearchWorksQueryResponse() {
    }

    public WorkConnection searchWorks() {
        Map<String, WorkConnection> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
