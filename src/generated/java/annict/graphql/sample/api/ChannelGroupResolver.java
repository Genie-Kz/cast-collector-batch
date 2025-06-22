package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Resolver for ChannelGroup
 */
public interface ChannelGroupResolver {

    ChannelConnection channels(ChannelGroup channelGroup, String after, String before, Integer first, Integer last) throws Exception;

}
