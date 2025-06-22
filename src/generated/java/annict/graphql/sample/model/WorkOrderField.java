package annict.graphql.sample.model;

public enum WorkOrderField {

    /**
     * 
     */
    CREATED_AT("CREATED_AT"),
    /**
     * 
     */
    SEASON("SEASON"),
    /**
     * 
     */
    WATCHERS_COUNT("WATCHERS_COUNT");

    private final String graphqlName;

    private WorkOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
