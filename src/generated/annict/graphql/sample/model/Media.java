package annict.graphql.sample.model;

/**
 * Media of anime
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public enum Media {

    /**
     * 
     */
    MOVIE("MOVIE"),
    /**
     * 
     */
    OTHER("OTHER"),
    /**
     * 
     */
    OVA("OVA"),
    /**
     * 
     */
    TV("TV"),
    /**
     * 
     */
    WEB("WEB");

    private final String graphqlName;

    private Media(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
