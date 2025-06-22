package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class SearchPeopleQueryResponse extends GraphQLResult<Map<String, PersonConnection>> {

    private static final String OPERATION_NAME = "searchPeople";

    public SearchPeopleQueryResponse() {
    }

    public PersonConnection searchPeople() {
        Map<String, PersonConnection> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
