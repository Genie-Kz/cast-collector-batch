package annict.graphql.sample.model;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
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
