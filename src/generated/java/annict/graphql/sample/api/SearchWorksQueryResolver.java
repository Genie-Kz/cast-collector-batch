package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface SearchWorksQueryResolver {

    WorkConnection searchWorks(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, WorkOrder orderBy, java.util.List<String> seasons, java.util.List<String> titles) throws Exception;

}
