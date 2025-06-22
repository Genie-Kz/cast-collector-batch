package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ActivityEdge
 */
public class ActivityEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActivityEdgeResponseProjection() {
    }

    public ActivityEdgeResponseProjection(ActivityEdgeResponseProjection projection) {
        super(projection);
    }

    public ActivityEdgeResponseProjection(List<ActivityEdgeResponseProjection> projections) {
        super(projections);
    }

    public ActivityEdgeResponseProjection all$() {
        return all$(3);
    }

    public ActivityEdgeResponseProjection all$(int maxDepth) {
        this.action();
        this.annictId();
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ActivityEdgeResponseProjection.ActivityItemResponseProjection.item", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityEdgeResponseProjection.ActivityItemResponseProjection.item", projectionDepthOnFields.getOrDefault("ActivityEdgeResponseProjection.ActivityItemResponseProjection.item", 0) + 1);
            this.item(new ActivityItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityEdgeResponseProjection.ActivityItemResponseProjection.item", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActivityEdgeResponseProjection.ActivityResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityEdgeResponseProjection.ActivityResponseProjection.node", projectionDepthOnFields.getOrDefault("ActivityEdgeResponseProjection.ActivityResponseProjection.node", 0) + 1);
            this.node(new ActivityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityEdgeResponseProjection.ActivityResponseProjection.node", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActivityEdgeResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityEdgeResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ActivityEdgeResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityEdgeResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public ActivityEdgeResponseProjection action() {
        return action(null);
    }

    public ActivityEdgeResponseProjection action(String alias) {
        add$(new GraphQLResponseField("action").alias(alias));
        return this;
    }

    public ActivityEdgeResponseProjection annictId() {
        return annictId(null);
    }

    public ActivityEdgeResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public ActivityEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ActivityEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ActivityEdgeResponseProjection item(ActivityItemResponseProjection subProjection) {
        return item(null, subProjection);
    }

    public ActivityEdgeResponseProjection item(String alias, ActivityItemResponseProjection subProjection) {
        add$(new GraphQLResponseField("item").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityEdgeResponseProjection node(ActivityResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ActivityEdgeResponseProjection node(String alias, ActivityResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityEdgeResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public ActivityEdgeResponseProjection user(String alias, UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityEdgeResponseProjection typename() {
        return typename(null);
    }

    public ActivityEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ActivityEdgeResponseProjection deepCopy$() {
        return new ActivityEdgeResponseProjection(this);
    }


}
