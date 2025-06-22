package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class CreateRecordMutationResponse extends GraphQLResult<Map<String, CreateRecordPayload>> {

    private static final String OPERATION_NAME = "createRecord";

    public CreateRecordMutationResponse() {
    }

    public CreateRecordPayload createRecord() {
        Map<String, CreateRecordPayload> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
