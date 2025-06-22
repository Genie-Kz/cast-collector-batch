package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class UpdateReviewMutationResponse extends GraphQLResult<Map<String, UpdateReviewPayload>> {

    private static final String OPERATION_NAME = "updateReview";

    public UpdateReviewMutationResponse() {
    }

    public UpdateReviewPayload updateReview() {
        Map<String, UpdateReviewPayload> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
