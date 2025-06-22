package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class ViewerQueryResponse extends GraphQLResult<Map<String, User>> {

    private static final String OPERATION_NAME = "viewer";

    public ViewerQueryResponse() {
    }

    public User viewer() {
        Map<String, User> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
