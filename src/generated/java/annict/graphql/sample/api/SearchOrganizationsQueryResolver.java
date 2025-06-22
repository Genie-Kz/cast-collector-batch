package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface SearchOrganizationsQueryResolver {

    OrganizationConnection searchOrganizations(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, java.util.List<String> names, OrganizationOrder orderBy) throws Exception;

}
