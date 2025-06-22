package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Record
 */
public class RecordResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecordResponseProjection() {
    }

    public RecordResponseProjection(RecordResponseProjection projection) {
        super(projection);
    }

    public RecordResponseProjection(List<RecordResponseProjection> projections) {
        super(projections);
    }

    public RecordResponseProjection all$() {
        return all$(3);
    }

    public RecordResponseProjection all$(int maxDepth) {
        this.annictId();
        this.comment();
        this.commentsCount();
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("RecordResponseProjection.EpisodeResponseProjection.episode", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecordResponseProjection.EpisodeResponseProjection.episode", projectionDepthOnFields.getOrDefault("RecordResponseProjection.EpisodeResponseProjection.episode", 0) + 1);
            this.episode(new EpisodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecordResponseProjection.EpisodeResponseProjection.episode", 0)));
        }
        this.facebookClickCount();
        this.id();
        this.likesCount();
        this.modified();
        this.rating();
        this.ratingState();
        this.twitterClickCount();
        this.updatedAt();
        if (projectionDepthOnFields.getOrDefault("RecordResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecordResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("RecordResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecordResponseProjection.UserResponseProjection.user", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RecordResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecordResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("RecordResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecordResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public RecordResponseProjection annictId() {
        return annictId(null);
    }

    public RecordResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public RecordResponseProjection comment() {
        return comment(null);
    }

    public RecordResponseProjection comment(String alias) {
        add$(new GraphQLResponseField("comment").alias(alias));
        return this;
    }

    public RecordResponseProjection commentsCount() {
        return commentsCount(null);
    }

    public RecordResponseProjection commentsCount(String alias) {
        add$(new GraphQLResponseField("commentsCount").alias(alias));
        return this;
    }

    public RecordResponseProjection createdAt() {
        return createdAt(null);
    }

    public RecordResponseProjection createdAt(String alias) {
        add$(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public RecordResponseProjection episode(EpisodeResponseProjection subProjection) {
        return episode(null, subProjection);
    }

    public RecordResponseProjection episode(String alias, EpisodeResponseProjection subProjection) {
        add$(new GraphQLResponseField("episode").alias(alias).projection(subProjection));
        return this;
    }

    public RecordResponseProjection facebookClickCount() {
        return facebookClickCount(null);
    }

    public RecordResponseProjection facebookClickCount(String alias) {
        add$(new GraphQLResponseField("facebookClickCount").alias(alias));
        return this;
    }

    public RecordResponseProjection id() {
        return id(null);
    }

    public RecordResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RecordResponseProjection likesCount() {
        return likesCount(null);
    }

    public RecordResponseProjection likesCount(String alias) {
        add$(new GraphQLResponseField("likesCount").alias(alias));
        return this;
    }

    public RecordResponseProjection modified() {
        return modified(null);
    }

    public RecordResponseProjection modified(String alias) {
        add$(new GraphQLResponseField("modified").alias(alias));
        return this;
    }

    public RecordResponseProjection rating() {
        return rating(null);
    }

    public RecordResponseProjection rating(String alias) {
        add$(new GraphQLResponseField("rating").alias(alias));
        return this;
    }

    public RecordResponseProjection ratingState() {
        return ratingState(null);
    }

    public RecordResponseProjection ratingState(String alias) {
        add$(new GraphQLResponseField("ratingState").alias(alias));
        return this;
    }

    public RecordResponseProjection twitterClickCount() {
        return twitterClickCount(null);
    }

    public RecordResponseProjection twitterClickCount(String alias) {
        add$(new GraphQLResponseField("twitterClickCount").alias(alias));
        return this;
    }

    public RecordResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public RecordResponseProjection updatedAt(String alias) {
        add$(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public RecordResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public RecordResponseProjection user(String alias, UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public RecordResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public RecordResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public RecordResponseProjection typename() {
        return typename(null);
    }

    public RecordResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public RecordResponseProjection deepCopy$() {
        return new RecordResponseProjection(this);
    }


}
