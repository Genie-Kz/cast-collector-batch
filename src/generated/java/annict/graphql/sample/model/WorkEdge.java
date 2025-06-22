package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * An edge in a connection.
 */
public class WorkEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String cursor;
    private Work node;

    public WorkEdge() {
    }

    public WorkEdge(String cursor, Work node) {
        this.cursor = cursor;
        this.node = node;
    }

    /**
     * A cursor for use in pagination.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * A cursor for use in pagination.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    /**
     * The item at the end of the edge.
     */
    public Work getNode() {
        return node;
    }
    /**
     * The item at the end of the edge.
     */
    public void setNode(Work node) {
        this.node = node;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        return joiner.toString();
    }

    public static WorkEdge.Builder builder() {
        return new WorkEdge.Builder();
    }

    public static class Builder {

        private String cursor;
        private Work node;

        public Builder() {
        }

        /**
         * A cursor for use in pagination.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * The item at the end of the edge.
         */
        public Builder setNode(Work node) {
            this.node = node;
            return this;
        }


        public WorkEdge build() {
            return new WorkEdge(cursor, node);
        }

    }
}
