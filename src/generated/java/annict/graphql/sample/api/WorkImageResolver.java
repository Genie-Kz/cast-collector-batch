package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Resolver for WorkImage
 */
public interface WorkImageResolver {

    String internalUrl(WorkImage workImage, @jakarta.validation.constraints.NotNull String size) throws Exception;

}
