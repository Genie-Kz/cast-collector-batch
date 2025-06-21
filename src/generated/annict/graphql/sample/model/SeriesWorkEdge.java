package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * An edge in a connection.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class SeriesWorkEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String cursor;
    @jakarta.validation.constraints.NotNull
    private Work item;
    private Work node;
    private String summary;
    private String summaryEn;

    public SeriesWorkEdge() {
    }

    public SeriesWorkEdge(String cursor, Work item, Work node, String summary, String summaryEn) {
        this.cursor = cursor;
        this.item = item;
        this.node = node;
        this.summary = summary;
        this.summaryEn = summaryEn;
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

    public Work getItem() {
        return item;
    }
    public void setItem(Work item) {
        this.item = item;
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

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummaryEn() {
        return summaryEn;
    }
    public void setSummaryEn(String summaryEn) {
        this.summaryEn = summaryEn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        if (item != null) {
            joiner.add("item: " + GraphQLRequestSerializer.getEntry(item));
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        if (summary != null) {
            joiner.add("summary: " + GraphQLRequestSerializer.getEntry(summary));
        }
        if (summaryEn != null) {
            joiner.add("summaryEn: " + GraphQLRequestSerializer.getEntry(summaryEn));
        }
        return joiner.toString();
    }

    public static SeriesWorkEdge.Builder builder() {
        return new SeriesWorkEdge.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T01:49:37+0900"
    )
    public static class Builder {

        private String cursor;
        private Work item;
        private Work node;
        private String summary;
        private String summaryEn;

        public Builder() {
        }

        /**
         * A cursor for use in pagination.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setItem(Work item) {
            this.item = item;
            return this;
        }

        /**
         * The item at the end of the edge.
         */
        public Builder setNode(Work node) {
            this.node = node;
            return this;
        }

        public Builder setSummary(String summary) {
            this.summary = summary;
            return this;
        }

        public Builder setSummaryEn(String summaryEn) {
            this.summaryEn = summaryEn;
            return this;
        }


        public SeriesWorkEdge build() {
            return new SeriesWorkEdge(cursor, item, node, summary, summaryEn);
        }

    }
}
