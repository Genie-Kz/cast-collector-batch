package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface SearchCharactersQueryResolver {

    CharacterConnection searchCharacters(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, java.util.List<String> names, CharacterOrder orderBy) throws Exception;

}
