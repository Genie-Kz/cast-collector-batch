package annict.graphql.sample.model;

public enum ProgramOrderField {

    /**
     * 
     */
    STARTED_AT("STARTED_AT");

    private final String graphqlName;

    private ProgramOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
