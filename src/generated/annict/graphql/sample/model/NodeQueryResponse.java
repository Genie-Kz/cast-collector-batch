package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Fetches an object given its ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class NodeQueryResponse extends GraphQLResult<Map<String, Node>> {

    private static final String OPERATION_NAME = "node";

    public NodeQueryResponse() {
    }

    /**
     * Fetches an object given its ID.
     */
    public Node node() {
        Map<String, Node> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
