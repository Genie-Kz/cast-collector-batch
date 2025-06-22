package annict.graphql.sample.model;

public enum ProgramState {

    /**
     * 
     */
    HIDDEN("HIDDEN"),
    /**
     * 
     */
    PUBLISHED("PUBLISHED");

    private final String graphqlName;

    private ProgramState(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
