package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class DeleteRecordMutationResponse extends GraphQLResult<Map<String, DeleteRecordPayload>> {

    private static final String OPERATION_NAME = "deleteRecord";

    public DeleteRecordMutationResponse() {
    }

    public DeleteRecordPayload deleteRecord() {
        Map<String, DeleteRecordPayload> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
