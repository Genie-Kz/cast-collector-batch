package annict.graphql.sample.model;

public enum ReviewOrderField {

    /**
     * 
     */
    CREATED_AT("CREATED_AT"),
    /**
     * 
     */
    LIKES_COUNT("LIKES_COUNT");

    private final String graphqlName;

    private ReviewOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
