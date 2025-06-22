package annict.graphql.sample.model;

/**
 * Season name
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:58:59+0900"
)
public enum SeasonName {

    /**
     * 
     */
    AUTUMN("AUTUMN"),
    /**
     * 
     */
    SPRING("SPRING"),
    /**
     * 
     */
    SUMMER("SUMMER"),
    /**
     * 
     */
    WINTER("WINTER");

    private final String graphqlName;

    private SeasonName(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
