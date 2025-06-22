package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface DeleteReviewMutationResolver {

    DeleteReviewPayload deleteReview(@jakarta.validation.constraints.NotNull DeleteReviewInput input) throws Exception;

}
