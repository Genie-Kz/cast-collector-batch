package annict.graphql.sample.model;

/**
 * Season name
 */
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
