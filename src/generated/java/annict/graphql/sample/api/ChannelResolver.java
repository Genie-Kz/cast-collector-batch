package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Resolver for Channel
 */
public interface ChannelResolver {

    ProgramConnection programs(Channel channel, String after, String before, Integer first, Integer last) throws Exception;

}
