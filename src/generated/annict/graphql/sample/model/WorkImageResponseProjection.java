package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for WorkImage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class WorkImageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkImageResponseProjection() {
    }

    public WorkImageResponseProjection(WorkImageResponseProjection projection) {
        super(projection);
    }

    public WorkImageResponseProjection(List<WorkImageResponseProjection> projections) {
        super(projections);
    }

    public WorkImageResponseProjection all$() {
        return all$(3);
    }

    public WorkImageResponseProjection all$(int maxDepth) {
        this.annictId();
        this.copyright();
        this.facebookOgImageUrl();
        this.id();
        this.internalUrl();
        this.recommendedImageUrl();
        this.twitterAvatarUrl();
        this.twitterBiggerAvatarUrl();
        this.twitterMiniAvatarUrl();
        this.twitterNormalAvatarUrl();
        if (projectionDepthOnFields.getOrDefault("WorkImageResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkImageResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("WorkImageResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkImageResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public WorkImageResponseProjection annictId() {
        return annictId(null);
    }

    public WorkImageResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public WorkImageResponseProjection copyright() {
        return copyright(null);
    }

    public WorkImageResponseProjection copyright(String alias) {
        add$(new GraphQLResponseField("copyright").alias(alias));
        return this;
    }

    public WorkImageResponseProjection facebookOgImageUrl() {
        return facebookOgImageUrl(null);
    }

    public WorkImageResponseProjection facebookOgImageUrl(String alias) {
        add$(new GraphQLResponseField("facebookOgImageUrl").alias(alias));
        return this;
    }

    public WorkImageResponseProjection id() {
        return id(null);
    }

    public WorkImageResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public WorkImageResponseProjection internalUrl() {
        return internalUrl((String)null);
    }

    public WorkImageResponseProjection internalUrl(String alias) {
        add$(new GraphQLResponseField("internalUrl").alias(alias));
        return this;
    }

    public WorkImageResponseProjection internalUrl(WorkImageInternalUrlParametrizedInput input) {
        return internalUrl(null, input);
    }

    public WorkImageResponseProjection internalUrl(String alias, WorkImageInternalUrlParametrizedInput input) {
        add$(new GraphQLResponseField("internalUrl").alias(alias).parameters(input));
        return this;
    }

    public WorkImageResponseProjection recommendedImageUrl() {
        return recommendedImageUrl(null);
    }

    public WorkImageResponseProjection recommendedImageUrl(String alias) {
        add$(new GraphQLResponseField("recommendedImageUrl").alias(alias));
        return this;
    }

    public WorkImageResponseProjection twitterAvatarUrl() {
        return twitterAvatarUrl(null);
    }

    public WorkImageResponseProjection twitterAvatarUrl(String alias) {
        add$(new GraphQLResponseField("twitterAvatarUrl").alias(alias));
        return this;
    }

    public WorkImageResponseProjection twitterBiggerAvatarUrl() {
        return twitterBiggerAvatarUrl(null);
    }

    public WorkImageResponseProjection twitterBiggerAvatarUrl(String alias) {
        add$(new GraphQLResponseField("twitterBiggerAvatarUrl").alias(alias));
        return this;
    }

    public WorkImageResponseProjection twitterMiniAvatarUrl() {
        return twitterMiniAvatarUrl(null);
    }

    public WorkImageResponseProjection twitterMiniAvatarUrl(String alias) {
        add$(new GraphQLResponseField("twitterMiniAvatarUrl").alias(alias));
        return this;
    }

    public WorkImageResponseProjection twitterNormalAvatarUrl() {
        return twitterNormalAvatarUrl(null);
    }

    public WorkImageResponseProjection twitterNormalAvatarUrl(String alias) {
        add$(new GraphQLResponseField("twitterNormalAvatarUrl").alias(alias));
        return this;
    }

    public WorkImageResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public WorkImageResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public WorkImageResponseProjection typename() {
        return typename(null);
    }

    public WorkImageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public WorkImageResponseProjection deepCopy$() {
        return new WorkImageResponseProjection(this);
    }


}
