import annict.graphql.sample.model.*;

/**
 * Resolver for Series
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public interface SeriesResolver {

    SeriesWorkConnection works(Series series, String after, String before, Integer first, Integer last, SeriesWorkOrder orderBy) throws Exception;

}
