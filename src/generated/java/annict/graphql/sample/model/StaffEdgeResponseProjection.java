package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for StaffEdge
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class StaffEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public StaffEdgeResponseProjection() {
    }

    public StaffEdgeResponseProjection(StaffEdgeResponseProjection projection) {
        super(projection);
    }

    public StaffEdgeResponseProjection(List<StaffEdgeResponseProjection> projections) {
        super(projections);
    }

    public StaffEdgeResponseProjection all$() {
        return all$(3);
    }

    public StaffEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("StaffEdgeResponseProjection.StaffResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("StaffEdgeResponseProjection.StaffResponseProjection.node", projectionDepthOnFields.getOrDefault("StaffEdgeResponseProjection.StaffResponseProjection.node", 0) + 1);
            this.node(new StaffResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StaffEdgeResponseProjection.StaffResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public StaffEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public StaffEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public StaffEdgeResponseProjection node(StaffResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public StaffEdgeResponseProjection node(String alias, StaffResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public StaffEdgeResponseProjection typename() {
        return typename(null);
    }

    public StaffEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public StaffEdgeResponseProjection deepCopy$() {
        return new StaffEdgeResponseProjection(this);
    }


}
