package annict.graphql.sample.model;

public enum EpisodeOrderField {

    /**
     * 
     */
    CREATED_AT("CREATED_AT"),
    /**
     * 
     */
    SORT_NUMBER("SORT_NUMBER");

    private final String graphqlName;

    private EpisodeOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
