package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:39+0900"
)
public interface SearchPeopleQueryResolver {

    PersonConnection searchPeople(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, java.util.List<String> names, PersonOrder orderBy) throws Exception;

}
