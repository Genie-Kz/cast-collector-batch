package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for UpdateReviewPayload
 */
public class UpdateReviewPayloadResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UpdateReviewPayloadResponseProjection() {
    }

    public UpdateReviewPayloadResponseProjection(UpdateReviewPayloadResponseProjection projection) {
        super(projection);
    }

    public UpdateReviewPayloadResponseProjection(List<UpdateReviewPayloadResponseProjection> projections) {
        super(projections);
    }

    public UpdateReviewPayloadResponseProjection all$() {
        return all$(3);
    }

    public UpdateReviewPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdateReviewPayloadResponseProjection.ReviewResponseProjection.review", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateReviewPayloadResponseProjection.ReviewResponseProjection.review", projectionDepthOnFields.getOrDefault("UpdateReviewPayloadResponseProjection.ReviewResponseProjection.review", 0) + 1);
            this.review(new ReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateReviewPayloadResponseProjection.ReviewResponseProjection.review", 0)));
        }
        this.typename();
        return this;
    }

    public UpdateReviewPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateReviewPayloadResponseProjection clientMutationId(String alias) {
        add$(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateReviewPayloadResponseProjection review(ReviewResponseProjection subProjection) {
        return review(null, subProjection);
    }

    public UpdateReviewPayloadResponseProjection review(String alias, ReviewResponseProjection subProjection) {
        add$(new GraphQLResponseField("review").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateReviewPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateReviewPayloadResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public UpdateReviewPayloadResponseProjection deepCopy$() {
        return new UpdateReviewPayloadResponseProjection(this);
    }


}
