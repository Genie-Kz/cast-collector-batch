package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface UpdateRecordMutationResolver {

    UpdateRecordPayload updateRecord(@jakarta.validation.constraints.NotNull UpdateRecordInput input) throws Exception;

}
