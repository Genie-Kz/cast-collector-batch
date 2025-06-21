package annict.graphql.sample.model;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public enum RatingState {

    AVERAGE("AVERAGE"),
    BAD("BAD"),
    GOOD("GOOD"),
    GREAT("GREAT");

    private final String graphqlName;

    private RatingState(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
