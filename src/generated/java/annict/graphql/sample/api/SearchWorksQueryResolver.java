package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:39+0900"
)
public interface SearchWorksQueryResolver {

    WorkConnection searchWorks(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, WorkOrder orderBy, java.util.List<String> seasons, java.util.List<String> titles) throws Exception;

}
