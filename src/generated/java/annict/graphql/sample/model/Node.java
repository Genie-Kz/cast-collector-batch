package annict.graphql.sample.model;


/**
 * An object with an ID.
 */
public interface Node {

    /**
     * ID of the object.
     */
    @jakarta.validation.constraints.NotNull
    String getId();

}
