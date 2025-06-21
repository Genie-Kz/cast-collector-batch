package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ActivityConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class ActivityConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActivityConnectionResponseProjection() {
    }

    public ActivityConnectionResponseProjection(ActivityConnectionResponseProjection projection) {
        super(projection);
    }

    public ActivityConnectionResponseProjection(List<ActivityConnectionResponseProjection> projections) {
        super(projections);
    }

    public ActivityConnectionResponseProjection all$() {
        return all$(3);
    }

    public ActivityConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ActivityConnectionResponseProjection.ActivityEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityConnectionResponseProjection.ActivityEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ActivityConnectionResponseProjection.ActivityEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ActivityEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityConnectionResponseProjection.ActivityEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActivityConnectionResponseProjection.ActivityResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityConnectionResponseProjection.ActivityResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ActivityConnectionResponseProjection.ActivityResponseProjection.nodes", 0) + 1);
            this.nodes(new ActivityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityConnectionResponseProjection.ActivityResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActivityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ActivityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ActivityConnectionResponseProjection edges(ActivityEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ActivityConnectionResponseProjection edges(String alias, ActivityEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityConnectionResponseProjection nodes(ActivityResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ActivityConnectionResponseProjection nodes(String alias, ActivityResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ActivityConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityConnectionResponseProjection typename() {
        return typename(null);
    }

    public ActivityConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ActivityConnectionResponseProjection deepCopy$() {
        return new ActivityConnectionResponseProjection(this);
    }


}
