package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ActivityItem
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class ActivityItemResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActivityItemResponseProjection() {
    }

    public ActivityItemResponseProjection(ActivityItemResponseProjection projection) {
        super(projection);
    }

    public ActivityItemResponseProjection(List<ActivityItemResponseProjection> projections) {
        super(projections);
    }

    public ActivityItemResponseProjection all$() {
        return all$(3);
    }

    public ActivityItemResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.StatusResponseProjection.onStatus", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityItemResponseProjection.StatusResponseProjection.onStatus", projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.StatusResponseProjection.onStatus", 0) + 1);
            this.onStatus(new StatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.StatusResponseProjection.onStatus", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.MultipleRecordResponseProjection.onMultipleRecord", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityItemResponseProjection.MultipleRecordResponseProjection.onMultipleRecord", projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.MultipleRecordResponseProjection.onMultipleRecord", 0) + 1);
            this.onMultipleRecord(new MultipleRecordResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.MultipleRecordResponseProjection.onMultipleRecord", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.RecordResponseProjection.onRecord", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityItemResponseProjection.RecordResponseProjection.onRecord", projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.RecordResponseProjection.onRecord", 0) + 1);
            this.onRecord(new RecordResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.RecordResponseProjection.onRecord", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.ReviewResponseProjection.onReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityItemResponseProjection.ReviewResponseProjection.onReview", projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.ReviewResponseProjection.onReview", 0) + 1);
            this.onReview(new ReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityItemResponseProjection.ReviewResponseProjection.onReview", 0)));
        }
        this.typename();
        return this;
    }

    public ActivityItemResponseProjection onStatus(StatusResponseProjection subProjection) {
        return onStatus(null, subProjection);
    }

    public ActivityItemResponseProjection onStatus(String alias, StatusResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Status").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityItemResponseProjection onMultipleRecord(MultipleRecordResponseProjection subProjection) {
        return onMultipleRecord(null, subProjection);
    }

    public ActivityItemResponseProjection onMultipleRecord(String alias, MultipleRecordResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on MultipleRecord").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityItemResponseProjection onRecord(RecordResponseProjection subProjection) {
        return onRecord(null, subProjection);
    }

    public ActivityItemResponseProjection onRecord(String alias, RecordResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Record").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityItemResponseProjection onReview(ReviewResponseProjection subProjection) {
        return onReview(null, subProjection);
    }

    public ActivityItemResponseProjection onReview(String alias, ReviewResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Review").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityItemResponseProjection typename() {
        return typename(null);
    }

    public ActivityItemResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ActivityItemResponseProjection deepCopy$() {
        return new ActivityItemResponseProjection(this);
    }


}
