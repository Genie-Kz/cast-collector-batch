package annict.graphql.sample.model;


/**
 * An object with an ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public interface Node {

    /**
     * ID of the object.
     */
    @jakarta.validation.constraints.NotNull
    String getId();

}
