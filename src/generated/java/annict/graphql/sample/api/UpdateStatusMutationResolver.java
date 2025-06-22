package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface UpdateStatusMutationResolver {

    UpdateStatusPayload updateStatus(@jakarta.validation.constraints.NotNull UpdateStatusInput input) throws Exception;

}
