package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ChannelConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class ChannelConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ChannelConnectionResponseProjection() {
    }

    public ChannelConnectionResponseProjection(ChannelConnectionResponseProjection projection) {
        super(projection);
    }

    public ChannelConnectionResponseProjection(List<ChannelConnectionResponseProjection> projections) {
        super(projections);
    }

    public ChannelConnectionResponseProjection all$() {
        return all$(3);
    }

    public ChannelConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ChannelConnectionResponseProjection.ChannelEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChannelConnectionResponseProjection.ChannelEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ChannelConnectionResponseProjection.ChannelEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ChannelEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChannelConnectionResponseProjection.ChannelEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ChannelConnectionResponseProjection.ChannelResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChannelConnectionResponseProjection.ChannelResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ChannelConnectionResponseProjection.ChannelResponseProjection.nodes", 0) + 1);
            this.nodes(new ChannelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChannelConnectionResponseProjection.ChannelResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ChannelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChannelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ChannelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChannelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ChannelConnectionResponseProjection edges(ChannelEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ChannelConnectionResponseProjection edges(String alias, ChannelEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ChannelConnectionResponseProjection nodes(ChannelResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ChannelConnectionResponseProjection nodes(String alias, ChannelResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ChannelConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ChannelConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ChannelConnectionResponseProjection typename() {
        return typename(null);
    }

    public ChannelConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ChannelConnectionResponseProjection deepCopy$() {
        return new ChannelConnectionResponseProjection(this);
    }


}
