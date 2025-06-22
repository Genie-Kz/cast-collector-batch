package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Resolver for Channel
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:01+0900"
)
public interface ChannelResolver {

    ProgramConnection programs(Channel channel, String after, String before, Integer first, Integer last) throws Exception;

}
