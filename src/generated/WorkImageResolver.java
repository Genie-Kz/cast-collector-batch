import annict.graphql.sample.model.*;

/**
 * Resolver for WorkImage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public interface WorkImageResolver {

    String internalUrl(WorkImage workImage, @jakarta.validation.constraints.NotNull String size) throws Exception;

}
