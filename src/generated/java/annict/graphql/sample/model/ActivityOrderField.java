package annict.graphql.sample.model;

public enum ActivityOrderField {

    /**
     * 
     */
    CREATED_AT("CREATED_AT");

    private final String graphqlName;

    private ActivityOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
