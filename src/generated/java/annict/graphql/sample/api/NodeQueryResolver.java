package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Fetches an object given its ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:39+0900"
)
public interface NodeQueryResolver {

    /**
     * Fetches an object given its ID.
     */
    Node node(@jakarta.validation.constraints.NotNull String id) throws Exception;

}
