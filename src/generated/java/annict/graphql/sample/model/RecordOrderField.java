package annict.graphql.sample.model;

public enum RecordOrderField {

    /**
     * 
     */
    CREATED_AT("CREATED_AT"),
    /**
     * 
     */
    LIKES_COUNT("LIKES_COUNT");

    private final String graphqlName;

    private RecordOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
