package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Fetches a list of objects given a list of IDs.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class NodesQueryResponse extends GraphQLResult<Map<String, java.util.List<Node>>> {

    private static final String OPERATION_NAME = "nodes";

    public NodesQueryResponse() {
    }

    /**
     * Fetches a list of objects given a list of IDs.
     */
    public java.util.List<Node> nodes() {
        Map<String, java.util.List<Node>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
