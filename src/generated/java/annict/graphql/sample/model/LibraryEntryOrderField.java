package annict.graphql.sample.model;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:58:59+0900"
)
public enum LibraryEntryOrderField {

    /**
     * �?後に記録また�?�スキ�?プした日�?
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
