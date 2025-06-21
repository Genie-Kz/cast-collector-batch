package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Status
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class StatusResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public StatusResponseProjection() {
    }

    public StatusResponseProjection(StatusResponseProjection projection) {
        super(projection);
    }

    public StatusResponseProjection(List<StatusResponseProjection> projections) {
        super(projections);
    }

    public StatusResponseProjection all$() {
        return all$(3);
    }

    public StatusResponseProjection all$(int maxDepth) {
        this.annictId();
        this.createdAt();
        this.id();
        this.likesCount();
        this.state();
        if (projectionDepthOnFields.getOrDefault("StatusResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("StatusResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusResponseProjection.UserResponseProjection.user", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("StatusResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("StatusResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public StatusResponseProjection annictId() {
        return annictId(null);
    }

    public StatusResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public StatusResponseProjection createdAt() {
        return createdAt(null);
    }

    public StatusResponseProjection createdAt(String alias) {
        add$(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public StatusResponseProjection id() {
        return id(null);
    }

    public StatusResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public StatusResponseProjection likesCount() {
        return likesCount(null);
    }

    public StatusResponseProjection likesCount(String alias) {
        add$(new GraphQLResponseField("likesCount").alias(alias));
        return this;
    }

    public StatusResponseProjection state() {
        return state(null);
    }

    public StatusResponseProjection state(String alias) {
        add$(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public StatusResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public StatusResponseProjection user(String alias, UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public StatusResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public StatusResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public StatusResponseProjection typename() {
        return typename(null);
    }

    public StatusResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public StatusResponseProjection deepCopy$() {
        return new StatusResponseProjection(this);
    }


}
