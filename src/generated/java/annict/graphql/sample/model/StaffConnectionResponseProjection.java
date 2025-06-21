package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for StaffConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class StaffConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public StaffConnectionResponseProjection() {
    }

    public StaffConnectionResponseProjection(StaffConnectionResponseProjection projection) {
        super(projection);
    }

    public StaffConnectionResponseProjection(List<StaffConnectionResponseProjection> projections) {
        super(projections);
    }

    public StaffConnectionResponseProjection all$() {
        return all$(3);
    }

    public StaffConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("StaffConnectionResponseProjection.StaffEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("StaffConnectionResponseProjection.StaffEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("StaffConnectionResponseProjection.StaffEdgeResponseProjection.edges", 0) + 1);
            this.edges(new StaffEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StaffConnectionResponseProjection.StaffEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("StaffConnectionResponseProjection.StaffResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("StaffConnectionResponseProjection.StaffResponseProjection.nodes", projectionDepthOnFields.getOrDefault("StaffConnectionResponseProjection.StaffResponseProjection.nodes", 0) + 1);
            this.nodes(new StaffResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StaffConnectionResponseProjection.StaffResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("StaffConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("StaffConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("StaffConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StaffConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public StaffConnectionResponseProjection edges(StaffEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public StaffConnectionResponseProjection edges(String alias, StaffEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public StaffConnectionResponseProjection nodes(StaffResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public StaffConnectionResponseProjection nodes(String alias, StaffResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public StaffConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public StaffConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public StaffConnectionResponseProjection typename() {
        return typename(null);
    }

    public StaffConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public StaffConnectionResponseProjection deepCopy$() {
        return new StaffConnectionResponseProjection(this);
    }


}
