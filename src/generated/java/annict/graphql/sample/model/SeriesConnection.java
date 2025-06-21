package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The connection type for Series.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class SeriesConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<SeriesEdge> edges;
    private java.util.List<Series> nodes;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;

    public SeriesConnection() {
    }

    public SeriesConnection(java.util.List<SeriesEdge> edges, java.util.List<Series> nodes, PageInfo pageInfo) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
    }

    /**
     * A list of edges.
     */
    public java.util.List<SeriesEdge> getEdges() {
        return edges;
    }
    /**
     * A list of edges.
     */
    public void setEdges(java.util.List<SeriesEdge> edges) {
        this.edges = edges;
    }

    /**
     * A list of nodes.
     */
    public java.util.List<Series> getNodes() {
        return nodes;
    }
    /**
     * A list of nodes.
     */
    public void setNodes(java.util.List<Series> nodes) {
        this.nodes = nodes;
    }

    /**
     * Information to aid in pagination.
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }
    /**
     * Information to aid in pagination.
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges));
        }
        if (nodes != null) {
            joiner.add("nodes: " + GraphQLRequestSerializer.getEntry(nodes));
        }
        if (pageInfo != null) {
            joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo));
        }
        return joiner.toString();
    }

    public static SeriesConnection.Builder builder() {
        return new SeriesConnection.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T02:10:38+0900"
    )
    public static class Builder {

        private java.util.List<SeriesEdge> edges;
        private java.util.List<Series> nodes;
        private PageInfo pageInfo;

        public Builder() {
        }

        /**
         * A list of edges.
         */
        public Builder setEdges(java.util.List<SeriesEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * A list of nodes.
         */
        public Builder setNodes(java.util.List<Series> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * Information to aid in pagination.
         */
        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public SeriesConnection build() {
            return new SeriesConnection(edges, nodes, pageInfo);
        }

    }
}
