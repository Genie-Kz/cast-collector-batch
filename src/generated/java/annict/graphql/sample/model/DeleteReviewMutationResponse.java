package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class DeleteReviewMutationResponse extends GraphQLResult<Map<String, DeleteReviewPayload>> {

    private static final String OPERATION_NAME = "deleteReview";

    public DeleteReviewMutationResponse() {
    }

    public DeleteReviewPayload deleteReview() {
        Map<String, DeleteReviewPayload> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
