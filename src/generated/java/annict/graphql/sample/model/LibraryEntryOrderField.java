package annict.graphql.sample.model;

public enum LibraryEntryOrderField {

    /**
     * 最後に記録またはスキップした日時
     */
    LAST_TRACKED_AT("LAST_TRACKED_AT");

    private final String graphqlName;

    private LibraryEntryOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
