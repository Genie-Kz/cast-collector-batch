package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:39+0900"
)
public class UpdateReviewMutationResponse extends GraphQLResult<Map<String, UpdateReviewPayload>> {

    private static final String OPERATION_NAME = "updateReview";

    public UpdateReviewMutationResponse() {
    }

    public UpdateReviewPayload updateReview() {
        Map<String, UpdateReviewPayload> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
