package annict.graphql.sample.model;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:00+0900"
)
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
