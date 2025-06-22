package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for CastEdge
 */
public class CastEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CastEdgeResponseProjection() {
    }

    public CastEdgeResponseProjection(CastEdgeResponseProjection projection) {
        super(projection);
    }

    public CastEdgeResponseProjection(List<CastEdgeResponseProjection> projections) {
        super(projections);
    }

    public CastEdgeResponseProjection all$() {
        return all$(3);
    }

    public CastEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CastEdgeResponseProjection.CastResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CastEdgeResponseProjection.CastResponseProjection.node", projectionDepthOnFields.getOrDefault("CastEdgeResponseProjection.CastResponseProjection.node", 0) + 1);
            this.node(new CastResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CastEdgeResponseProjection.CastResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CastEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CastEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CastEdgeResponseProjection node(CastResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CastEdgeResponseProjection node(String alias, CastResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CastEdgeResponseProjection typename() {
        return typename(null);
    }

    public CastEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public CastEdgeResponseProjection deepCopy$() {
        return new CastEdgeResponseProjection(this);
    }


}
