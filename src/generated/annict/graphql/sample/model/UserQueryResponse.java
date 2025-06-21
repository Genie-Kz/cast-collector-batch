package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class UserQueryResponse extends GraphQLResult<Map<String, User>> {

    private static final String OPERATION_NAME = "user";

    public UserQueryResponse() {
    }

    public User user() {
        Map<String, User> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
