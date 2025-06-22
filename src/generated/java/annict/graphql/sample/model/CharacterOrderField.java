package annict.graphql.sample.model;

public enum CharacterOrderField {

    /**
     * 
     */
    CREATED_AT("CREATED_AT"),
    /**
     * 
     */
    FAVORITE_CHARACTERS_COUNT("FAVORITE_CHARACTERS_COUNT");

    private final String graphqlName;

    private CharacterOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
