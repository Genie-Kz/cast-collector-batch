package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ChannelEdge
 */
public class ChannelEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ChannelEdgeResponseProjection() {
    }

    public ChannelEdgeResponseProjection(ChannelEdgeResponseProjection projection) {
        super(projection);
    }

    public ChannelEdgeResponseProjection(List<ChannelEdgeResponseProjection> projections) {
        super(projections);
    }

    public ChannelEdgeResponseProjection all$() {
        return all$(3);
    }

    public ChannelEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ChannelEdgeResponseProjection.ChannelResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChannelEdgeResponseProjection.ChannelResponseProjection.node", projectionDepthOnFields.getOrDefault("ChannelEdgeResponseProjection.ChannelResponseProjection.node", 0) + 1);
            this.node(new ChannelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChannelEdgeResponseProjection.ChannelResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ChannelEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ChannelEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ChannelEdgeResponseProjection node(ChannelResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ChannelEdgeResponseProjection node(String alias, ChannelResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ChannelEdgeResponseProjection typename() {
        return typename(null);
    }

    public ChannelEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ChannelEdgeResponseProjection deepCopy$() {
        return new ChannelEdgeResponseProjection(this);
    }


}
