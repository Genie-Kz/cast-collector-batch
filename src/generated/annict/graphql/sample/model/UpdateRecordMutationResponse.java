package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class UpdateRecordMutationResponse extends GraphQLResult<Map<String, UpdateRecordPayload>> {

    private static final String OPERATION_NAME = "updateRecord";

    public UpdateRecordMutationResponse() {
    }

    public UpdateRecordPayload updateRecord() {
        Map<String, UpdateRecordPayload> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
