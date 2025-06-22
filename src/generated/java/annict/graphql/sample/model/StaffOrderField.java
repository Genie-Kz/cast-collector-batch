package annict.graphql.sample.model;

public enum StaffOrderField {

    /**
     * 
     */
    CREATED_AT("CREATED_AT"),
    /**
     * 
     */
    SORT_NUMBER("SORT_NUMBER");

    private final String graphqlName;

    private StaffOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
