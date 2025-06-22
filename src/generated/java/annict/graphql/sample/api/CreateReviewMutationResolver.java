package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface CreateReviewMutationResolver {

    CreateReviewPayload createReview(@jakarta.validation.constraints.NotNull CreateReviewInput input) throws Exception;

}
