package annict.graphql.sample.model;

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
