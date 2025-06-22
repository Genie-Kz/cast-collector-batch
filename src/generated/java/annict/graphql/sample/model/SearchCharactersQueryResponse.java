package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class SearchCharactersQueryResponse extends GraphQLResult<Map<String, CharacterConnection>> {

    private static final String OPERATION_NAME = "searchCharacters";

    public SearchCharactersQueryResponse() {
    }

    public CharacterConnection searchCharacters() {
        Map<String, CharacterConnection> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
