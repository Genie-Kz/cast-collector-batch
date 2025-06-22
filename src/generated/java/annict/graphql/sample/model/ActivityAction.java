package annict.graphql.sample.model;

public enum ActivityAction {

    /**
     * 
     */
    CREATE("CREATE");

    private final String graphqlName;

    private ActivityAction(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
