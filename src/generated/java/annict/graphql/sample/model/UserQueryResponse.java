package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class UserQueryResponse extends GraphQLResult<Map<String, User>> {

    private static final String OPERATION_NAME = "user";

    public UserQueryResponse() {
    }

    public User user() {
        Map<String, User> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
