package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface DeleteRecordMutationResolver {

    DeleteRecordPayload deleteRecord(@jakarta.validation.constraints.NotNull DeleteRecordInput input) throws Exception;

}
