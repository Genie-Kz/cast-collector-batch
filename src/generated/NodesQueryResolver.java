import annict.graphql.sample.model.*;

/**
 * Fetches a list of objects given a list of IDs.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public interface NodesQueryResolver {

    /**
     * Fetches a list of objects given a list of IDs.
     */
    @jakarta.validation.constraints.NotNull
    java.util.List<Node> nodes(@jakarta.validation.constraints.NotNull java.util.List<String> ids) throws Exception;

}
