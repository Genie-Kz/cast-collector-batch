import annict.graphql.sample.model.*;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public interface SearchOrganizationsQueryResolver {

    OrganizationConnection searchOrganizations(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, java.util.List<String> names, OrganizationOrder orderBy) throws Exception;

}
