package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Resolver for Series
 */
public interface SeriesResolver {

    SeriesWorkConnection works(Series series, String after, String before, Integer first, Integer last, SeriesWorkOrder orderBy) throws Exception;

}
