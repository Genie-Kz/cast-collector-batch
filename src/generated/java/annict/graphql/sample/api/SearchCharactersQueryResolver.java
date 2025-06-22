package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:02+0900"
)
public interface SearchCharactersQueryResolver {

    CharacterConnection searchCharacters(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, java.util.List<String> names, CharacterOrder orderBy) throws Exception;

}
