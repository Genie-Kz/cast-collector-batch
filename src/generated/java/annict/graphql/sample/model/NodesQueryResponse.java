package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Fetches a list of objects given a list of IDs.
 */
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
