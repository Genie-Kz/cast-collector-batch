package annict.graphql.sample.model;

/**
 * Media of anime
 */
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
