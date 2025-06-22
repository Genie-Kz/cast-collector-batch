package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface SearchPeopleQueryResolver {

    PersonConnection searchPeople(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, java.util.List<String> names, PersonOrder orderBy) throws Exception;

}
