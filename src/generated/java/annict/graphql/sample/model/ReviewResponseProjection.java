package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Review
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class ReviewResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ReviewResponseProjection() {
    }

    public ReviewResponseProjection(ReviewResponseProjection projection) {
        super(projection);
    }

    public ReviewResponseProjection(List<ReviewResponseProjection> projections) {
        super(projections);
    }

    public ReviewResponseProjection all$() {
        return all$(3);
    }

    public ReviewResponseProjection all$(int maxDepth) {
        this.annictId();
        this.body();
        this.createdAt();
        this.id();
        this.impressionsCount();
        this.likesCount();
        this.modifiedAt();
        this.ratingAnimationState();
        this.ratingCharacterState();
        this.ratingMusicState();
        this.ratingOverallState();
        this.ratingStoryState();
        this.title();
        this.updatedAt();
        if (projectionDepthOnFields.getOrDefault("ReviewResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ReviewResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewResponseProjection.UserResponseProjection.user", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("ReviewResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public ReviewResponseProjection annictId() {
        return annictId(null);
    }

    public ReviewResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public ReviewResponseProjection body() {
        return body(null);
    }

    public ReviewResponseProjection body(String alias) {
        add$(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public ReviewResponseProjection createdAt() {
        return createdAt(null);
    }

    public ReviewResponseProjection createdAt(String alias) {
        add$(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ReviewResponseProjection id() {
        return id(null);
    }

    public ReviewResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReviewResponseProjection impressionsCount() {
        return impressionsCount(null);
    }

    public ReviewResponseProjection impressionsCount(String alias) {
        add$(new GraphQLResponseField("impressionsCount").alias(alias));
        return this;
    }

    public ReviewResponseProjection likesCount() {
        return likesCount(null);
    }

    public ReviewResponseProjection likesCount(String alias) {
        add$(new GraphQLResponseField("likesCount").alias(alias));
        return this;
    }

    public ReviewResponseProjection modifiedAt() {
        return modifiedAt(null);
    }

    public ReviewResponseProjection modifiedAt(String alias) {
        add$(new GraphQLResponseField("modifiedAt").alias(alias));
        return this;
    }

    public ReviewResponseProjection ratingAnimationState() {
        return ratingAnimationState(null);
    }

    public ReviewResponseProjection ratingAnimationState(String alias) {
        add$(new GraphQLResponseField("ratingAnimationState").alias(alias));
        return this;
    }

    public ReviewResponseProjection ratingCharacterState() {
        return ratingCharacterState(null);
    }

    public ReviewResponseProjection ratingCharacterState(String alias) {
        add$(new GraphQLResponseField("ratingCharacterState").alias(alias));
        return this;
    }

    public ReviewResponseProjection ratingMusicState() {
        return ratingMusicState(null);
    }

    public ReviewResponseProjection ratingMusicState(String alias) {
        add$(new GraphQLResponseField("ratingMusicState").alias(alias));
        return this;
    }

    public ReviewResponseProjection ratingOverallState() {
        return ratingOverallState(null);
    }

    public ReviewResponseProjection ratingOverallState(String alias) {
        add$(new GraphQLResponseField("ratingOverallState").alias(alias));
        return this;
    }

    public ReviewResponseProjection ratingStoryState() {
        return ratingStoryState(null);
    }

    public ReviewResponseProjection ratingStoryState(String alias) {
        add$(new GraphQLResponseField("ratingStoryState").alias(alias));
        return this;
    }

    public ReviewResponseProjection title() {
        return title(null);
    }

    public ReviewResponseProjection title(String alias) {
        add$(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public ReviewResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public ReviewResponseProjection updatedAt(String alias) {
        add$(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public ReviewResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public ReviewResponseProjection user(String alias, UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public ReviewResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewResponseProjection typename() {
        return typename(null);
    }

    public ReviewResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ReviewResponseProjection deepCopy$() {
        return new ReviewResponseProjection(this);
    }


}
