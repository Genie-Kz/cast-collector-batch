package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Resolver for WorkImage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:01+0900"
)
public interface WorkImageResolver {

    String internalUrl(WorkImage workImage, @jakarta.validation.constraints.NotNull String size) throws Exception;

}
