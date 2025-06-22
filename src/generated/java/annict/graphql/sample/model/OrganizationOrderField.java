package annict.graphql.sample.model;

public enum OrganizationOrderField {

    /**
     * 
     */
    CREATED_AT("CREATED_AT"),
    /**
     * 
     */
    FAVORITE_ORGANIZATIONS_COUNT("FAVORITE_ORGANIZATIONS_COUNT");

    private final String graphqlName;

    private OrganizationOrderField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
