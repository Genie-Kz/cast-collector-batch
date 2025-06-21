package annict.graphql.sample.model;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public enum StatusState {

    /**
     * 
     */
    NO_STATE("NO_STATE"),
    /**
     * 
     */
    ON_HOLD("ON_HOLD"),
    /**
     * 
     */
    STOP_WATCHING("STOP_WATCHING"),
    /**
     * 
     */
    WANNA_WATCH("WANNA_WATCH"),
    /**
     * 
     */
    WATCHED("WATCHED"),
    /**
     * 
     */
    WATCHING("WATCHING");

    private final String graphqlName;

    private StatusState(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
