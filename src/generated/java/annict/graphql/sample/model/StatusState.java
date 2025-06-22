package annict.graphql.sample.model;

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
