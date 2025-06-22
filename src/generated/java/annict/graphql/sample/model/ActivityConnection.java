package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The connection type for Activity.
 */
public class ActivityConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<ActivityEdge> edges;
    private java.util.List<Activity> nodes;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;

    public ActivityConnection() {
    }

    public ActivityConnection(java.util.List<ActivityEdge> edges, java.util.List<Activity> nodes, PageInfo pageInfo) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
    }

    /**
     * A list of edges.
     */
    public java.util.List<ActivityEdge> getEdges() {
        return edges;
    }
    /**
     * A list of edges.
     */
    public void setEdges(java.util.List<ActivityEdge> edges) {
        this.edges = edges;
    }

    /**
     * A list of nodes.
     */
    public java.util.List<Activity> getNodes() {
        return nodes;
    }
    /**
     * A list of nodes.
     */
    public void setNodes(java.util.List<Activity> nodes) {
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

    public static ActivityConnection.Builder builder() {
        return new ActivityConnection.Builder();
    }

    public static class Builder {

        private java.util.List<ActivityEdge> edges;
        private java.util.List<Activity> nodes;
        private PageInfo pageInfo;

        public Builder() {
        }

        /**
         * A list of edges.
         */
        public Builder setEdges(java.util.List<ActivityEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * A list of nodes.
         */
        public Builder setNodes(java.util.List<Activity> nodes) {
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


        public ActivityConnection build() {
            return new ActivityConnection(edges, nodes, pageInfo);
        }

    }
}
