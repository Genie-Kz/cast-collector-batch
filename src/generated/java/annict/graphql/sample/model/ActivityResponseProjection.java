package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Activity
 */
public class ActivityResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActivityResponseProjection() {
    }

    public ActivityResponseProjection(ActivityResponseProjection projection) {
        super(projection);
    }

    public ActivityResponseProjection(List<ActivityResponseProjection> projections) {
        super(projections);
    }

    public ActivityResponseProjection all$() {
        return all$(3);
    }

    public ActivityResponseProjection all$(int maxDepth) {
        this.annictId();
        this.id();
        if (projectionDepthOnFields.getOrDefault("ActivityResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ActivityResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public ActivityResponseProjection annictId() {
        return annictId(null);
    }

    public ActivityResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public ActivityResponseProjection id() {
        return id(null);
    }

    public ActivityResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ActivityResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public ActivityResponseProjection user(String alias, UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityResponseProjection typename() {
        return typename(null);
    }

    public ActivityResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ActivityResponseProjection deepCopy$() {
        return new ActivityResponseProjection(this);
    }


}
