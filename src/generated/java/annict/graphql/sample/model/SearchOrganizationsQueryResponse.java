package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class SearchOrganizationsQueryResponse extends GraphQLResult<Map<String, OrganizationConnection>> {

    private static final String OPERATION_NAME = "searchOrganizations";

    public SearchOrganizationsQueryResponse() {
    }

    public OrganizationConnection searchOrganizations() {
        Map<String, OrganizationConnection> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
