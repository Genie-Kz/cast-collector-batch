package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface CreateRecordMutationResolver {

    CreateRecordPayload createRecord(@jakarta.validation.constraints.NotNull CreateRecordInput input) throws Exception;

}
