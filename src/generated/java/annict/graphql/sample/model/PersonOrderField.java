package annict.graphql.sample.model;

public enum PersonOrderField {

    /**
     * 
     */
    CREATED_AT("CREATED_AT"),
    /**
     * 
     */
    FAVORITE_PEOPLE_COUNT("FAVORITE_PEOPLE_COUNT");

    private final String graphqlName;

    private PersonOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
