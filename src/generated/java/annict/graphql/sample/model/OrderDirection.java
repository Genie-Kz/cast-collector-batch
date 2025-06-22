package annict.graphql.sample.model;

public enum OrderDirection {

    /**
     * 
     */
    ASC("ASC"),
    /**
     * 
     */
    DESC("DESC");

    private final String graphqlName;

    private OrderDirection(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
