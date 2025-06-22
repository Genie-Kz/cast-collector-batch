package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:01+0900"
)
public class ViewerQueryResponse extends GraphQLResult<Map<String, User>> {

    private static final String OPERATION_NAME = "viewer";

    public ViewerQueryResponse() {
    }

    public User viewer() {
        Map<String, User> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
