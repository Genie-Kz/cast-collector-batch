package annict.graphql.sample.model;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:58:59+0900"
)
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
