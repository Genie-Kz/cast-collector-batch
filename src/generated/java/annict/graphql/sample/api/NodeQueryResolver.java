package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Fetches an object given its ID.
 */
public interface NodeQueryResolver {

    /**
     * Fetches an object given its ID.
     */
    Node node(@jakarta.validation.constraints.NotNull String id) throws Exception;

}
