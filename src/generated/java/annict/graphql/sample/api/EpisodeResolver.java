package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Resolver for Episode
 */
public interface EpisodeResolver {

    RecordConnection records(Episode episode, String after, String before, Integer first, Boolean hasComment, Integer last, RecordOrder orderBy) throws Exception;

}
