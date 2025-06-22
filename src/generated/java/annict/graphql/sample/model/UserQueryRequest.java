package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class UserQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "user";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public UserQueryRequest() {
    }

    public UserQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setUsername(String username) {
        this.input.put("username", username);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static UserQueryRequest.Builder builder() {
        return new UserQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private String username;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }


        public UserQueryRequest build() {
            UserQueryRequest obj = new UserQueryRequest($alias);
            obj.setUsername(username);
            return obj;
        }

    }
}
