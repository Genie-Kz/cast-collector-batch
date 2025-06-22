package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for WorkEdge
 */
public class WorkEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkEdgeResponseProjection() {
    }

    public WorkEdgeResponseProjection(WorkEdgeResponseProjection projection) {
        super(projection);
    }

    public WorkEdgeResponseProjection(List<WorkEdgeResponseProjection> projections) {
        super(projections);
    }

    public WorkEdgeResponseProjection all$() {
        return all$(3);
    }

    public WorkEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("WorkEdgeResponseProjection.WorkResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkEdgeResponseProjection.WorkResponseProjection.node", projectionDepthOnFields.getOrDefault("WorkEdgeResponseProjection.WorkResponseProjection.node", 0) + 1);
            this.node(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkEdgeResponseProjection.WorkResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public WorkEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public WorkEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public WorkEdgeResponseProjection node(WorkResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public WorkEdgeResponseProjection node(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public WorkEdgeResponseProjection typename() {
        return typename(null);
    }

    public WorkEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public WorkEdgeResponseProjection deepCopy$() {
        return new WorkEdgeResponseProjection(this);
    }


}
