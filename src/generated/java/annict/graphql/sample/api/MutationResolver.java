package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface MutationResolver {

    CreateRecordPayload createRecord(@jakarta.validation.constraints.NotNull CreateRecordInput input) throws Exception;

    CreateReviewPayload createReview(@jakarta.validation.constraints.NotNull CreateReviewInput input) throws Exception;

    DeleteRecordPayload deleteRecord(@jakarta.validation.constraints.NotNull DeleteRecordInput input) throws Exception;

    DeleteReviewPayload deleteReview(@jakarta.validation.constraints.NotNull DeleteReviewInput input) throws Exception;

    UpdateRecordPayload updateRecord(@jakarta.validation.constraints.NotNull UpdateRecordInput input) throws Exception;

    UpdateReviewPayload updateReview(@jakarta.validation.constraints.NotNull UpdateReviewInput input) throws Exception;

    UpdateStatusPayload updateStatus(@jakarta.validation.constraints.NotNull UpdateStatusInput input) throws Exception;

}
