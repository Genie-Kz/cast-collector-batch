package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Fetches a list of objects given a list of IDs.
 */
public interface NodesQueryResolver {

    /**
     * Fetches a list of objects given a list of IDs.
     */
    @jakarta.validation.constraints.NotNull
    java.util.List<Node> nodes(@jakarta.validation.constraints.NotNull java.util.List<String> ids) throws Exception;

}
