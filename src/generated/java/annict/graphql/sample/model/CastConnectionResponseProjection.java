package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for CastConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:00+0900"
)
public class CastConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CastConnectionResponseProjection() {
    }

    public CastConnectionResponseProjection(CastConnectionResponseProjection projection) {
        super(projection);
    }

    public CastConnectionResponseProjection(List<CastConnectionResponseProjection> projections) {
        super(projections);
    }

    public CastConnectionResponseProjection all$() {
        return all$(3);
    }

    public CastConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CastConnectionResponseProjection.CastEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CastConnectionResponseProjection.CastEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CastConnectionResponseProjection.CastEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CastEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CastConnectionResponseProjection.CastEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CastConnectionResponseProjection.CastResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CastConnectionResponseProjection.CastResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CastConnectionResponseProjection.CastResponseProjection.nodes", 0) + 1);
            this.nodes(new CastResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CastConnectionResponseProjection.CastResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CastConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CastConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CastConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CastConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public CastConnectionResponseProjection edges(CastEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CastConnectionResponseProjection edges(String alias, CastEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CastConnectionResponseProjection nodes(CastResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public CastConnectionResponseProjection nodes(String alias, CastResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public CastConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CastConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CastConnectionResponseProjection typename() {
        return typename(null);
    }

    public CastConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public CastConnectionResponseProjection deepCopy$() {
        return new CastConnectionResponseProjection(this);
    }


}
