package annict.graphql.sample.model;

public enum SeriesWorkOrderField {

    /**
     * 
     */
    SEASON("SEASON");

    private final String graphqlName;

    private SeriesWorkOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
