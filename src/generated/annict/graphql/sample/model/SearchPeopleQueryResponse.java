package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class SearchPeopleQueryResponse extends GraphQLResult<Map<String, PersonConnection>> {

    private static final String OPERATION_NAME = "searchPeople";

    public SearchPeopleQueryResponse() {
    }

    public PersonConnection searchPeople() {
        Map<String, PersonConnection> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
