package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for MultipleRecord
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class MultipleRecordResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public MultipleRecordResponseProjection() {
    }

    public MultipleRecordResponseProjection(MultipleRecordResponseProjection projection) {
        super(projection);
    }

    public MultipleRecordResponseProjection(List<MultipleRecordResponseProjection> projections) {
        super(projections);
    }

    public MultipleRecordResponseProjection all$() {
        return all$(3);
    }

    public MultipleRecordResponseProjection all$(int maxDepth) {
        this.annictId();
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("MultipleRecordResponseProjection.RecordConnectionResponseProjection.records", 0) <= maxDepth) {
            projectionDepthOnFields.put("MultipleRecordResponseProjection.RecordConnectionResponseProjection.records", projectionDepthOnFields.getOrDefault("MultipleRecordResponseProjection.RecordConnectionResponseProjection.records", 0) + 1);
            this.records(new RecordConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MultipleRecordResponseProjection.RecordConnectionResponseProjection.records", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MultipleRecordResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("MultipleRecordResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("MultipleRecordResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MultipleRecordResponseProjection.UserResponseProjection.user", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MultipleRecordResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("MultipleRecordResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("MultipleRecordResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MultipleRecordResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public MultipleRecordResponseProjection annictId() {
        return annictId(null);
    }

    public MultipleRecordResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public MultipleRecordResponseProjection createdAt() {
        return createdAt(null);
    }

    public MultipleRecordResponseProjection createdAt(String alias) {
        add$(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public MultipleRecordResponseProjection id() {
        return id(null);
    }

    public MultipleRecordResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MultipleRecordResponseProjection records(RecordConnectionResponseProjection subProjection) {
        return records((String)null, subProjection);
    }

    public MultipleRecordResponseProjection records(String alias, RecordConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("records").alias(alias).projection(subProjection));
        return this;
    }

    public MultipleRecordResponseProjection records(MultipleRecordRecordsParametrizedInput input, RecordConnectionResponseProjection subProjection) {
        return records(null, input, subProjection);
    }

    public MultipleRecordResponseProjection records(String alias, MultipleRecordRecordsParametrizedInput input, RecordConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("records").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MultipleRecordResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public MultipleRecordResponseProjection user(String alias, UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public MultipleRecordResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public MultipleRecordResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public MultipleRecordResponseProjection typename() {
        return typename(null);
    }

    public MultipleRecordResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public MultipleRecordResponseProjection deepCopy$() {
        return new MultipleRecordResponseProjection(this);
    }


}
