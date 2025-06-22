package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface UpdateReviewMutationResolver {

    UpdateReviewPayload updateReview(@jakarta.validation.constraints.NotNull UpdateReviewInput input) throws Exception;

}
