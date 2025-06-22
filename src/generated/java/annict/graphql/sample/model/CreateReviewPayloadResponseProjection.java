package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for CreateReviewPayload
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:00+0900"
)
public class CreateReviewPayloadResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CreateReviewPayloadResponseProjection() {
    }

    public CreateReviewPayloadResponseProjection(CreateReviewPayloadResponseProjection projection) {
        super(projection);
    }

    public CreateReviewPayloadResponseProjection(List<CreateReviewPayloadResponseProjection> projections) {
        super(projections);
    }

    public CreateReviewPayloadResponseProjection all$() {
        return all$(3);
    }

    public CreateReviewPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("CreateReviewPayloadResponseProjection.ReviewResponseProjection.review", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateReviewPayloadResponseProjection.ReviewResponseProjection.review", projectionDepthOnFields.getOrDefault("CreateReviewPayloadResponseProjection.ReviewResponseProjection.review", 0) + 1);
            this.review(new ReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateReviewPayloadResponseProjection.ReviewResponseProjection.review", 0)));
        }
        this.typename();
        return this;
    }

    public CreateReviewPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public CreateReviewPayloadResponseProjection clientMutationId(String alias) {
        add$(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public CreateReviewPayloadResponseProjection review(ReviewResponseProjection subProjection) {
        return review(null, subProjection);
    }

    public CreateReviewPayloadResponseProjection review(String alias, ReviewResponseProjection subProjection) {
        add$(new GraphQLResponseField("review").alias(alias).projection(subProjection));
        return this;
    }

    public CreateReviewPayloadResponseProjection typename() {
        return typename(null);
    }

    public CreateReviewPayloadResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public CreateReviewPayloadResponseProjection deepCopy$() {
        return new CreateReviewPayloadResponseProjection(this);
    }


}
