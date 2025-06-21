package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class CreateReviewMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "createReview";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public CreateReviewMutationRequest() {
    }

    public CreateReviewMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setInput(CreateReviewInput input) {
        this.input.put("input", input);
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

    public static CreateReviewMutationRequest.Builder builder() {
        return new CreateReviewMutationRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T01:49:37+0900"
    )
    public static class Builder {

        private String $alias;
        private CreateReviewInput input;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setInput(CreateReviewInput input) {
            this.input = input;
            return this;
        }


        public CreateReviewMutationRequest build() {
            CreateReviewMutationRequest obj = new CreateReviewMutationRequest($alias);
            obj.setInput(input);
            return obj;
        }

    }
}
