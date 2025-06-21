package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Resolver for Episode
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public interface EpisodeResolver {

    RecordConnection records(Episode episode, String after, String before, Integer first, Boolean hasComment, Integer last, RecordOrder orderBy) throws Exception;

}
