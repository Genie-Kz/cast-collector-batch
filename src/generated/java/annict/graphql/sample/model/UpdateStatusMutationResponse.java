package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:02+0900"
)
public class UpdateStatusMutationResponse extends GraphQLResult<Map<String, UpdateStatusPayload>> {

    private static final String OPERATION_NAME = "updateStatus";

    public UpdateStatusMutationResponse() {
    }

    public UpdateStatusPayload updateStatus() {
        Map<String, UpdateStatusPayload> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
