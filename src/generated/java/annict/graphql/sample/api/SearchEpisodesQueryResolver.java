package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface SearchEpisodesQueryResolver {

    EpisodeConnection searchEpisodes(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, EpisodeOrder orderBy) throws Exception;

}
