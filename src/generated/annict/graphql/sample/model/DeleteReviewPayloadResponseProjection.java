package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for DeleteReviewPayload
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class DeleteReviewPayloadResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DeleteReviewPayloadResponseProjection() {
    }

    public DeleteReviewPayloadResponseProjection(DeleteReviewPayloadResponseProjection projection) {
        super(projection);
    }

    public DeleteReviewPayloadResponseProjection(List<DeleteReviewPayloadResponseProjection> projections) {
        super(projections);
    }

    public DeleteReviewPayloadResponseProjection all$() {
        return all$(3);
    }

    public DeleteReviewPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("DeleteReviewPayloadResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeleteReviewPayloadResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("DeleteReviewPayloadResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeleteReviewPayloadResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public DeleteReviewPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public DeleteReviewPayloadResponseProjection clientMutationId(String alias) {
        add$(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public DeleteReviewPayloadResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public DeleteReviewPayloadResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public DeleteReviewPayloadResponseProjection typename() {
        return typename(null);
    }

    public DeleteReviewPayloadResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public DeleteReviewPayloadResponseProjection deepCopy$() {
        return new DeleteReviewPayloadResponseProjection(this);
    }


}
