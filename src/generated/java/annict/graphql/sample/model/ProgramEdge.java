package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * An edge in a connection.
 */
public class ProgramEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String cursor;
    private Program node;

    public ProgramEdge() {
    }

    public ProgramEdge(String cursor, Program node) {
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
    public Program getNode() {
        return node;
    }
    /**
     * The item at the end of the edge.
     */
    public void setNode(Program node) {
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

    public static ProgramEdge.Builder builder() {
        return new ProgramEdge.Builder();
    }

    public static class Builder {

        private String cursor;
        private Program node;

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
        public Builder setNode(Program node) {
            this.node = node;
            return this;
        }


        public ProgramEdge build() {
            return new ProgramEdge(cursor, node);
        }

    }
}
