package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class UpdateStatusMutationResponse extends GraphQLResult<Map<String, UpdateStatusPayload>> {

    private static final String OPERATION_NAME = "updateStatus";

    public UpdateStatusMutationResponse() {
    }

    public UpdateStatusPayload updateStatus() {
        Map<String, UpdateStatusPayload> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
