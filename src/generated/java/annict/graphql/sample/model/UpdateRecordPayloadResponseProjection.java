package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for UpdateRecordPayload
 */
public class UpdateRecordPayloadResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UpdateRecordPayloadResponseProjection() {
    }

    public UpdateRecordPayloadResponseProjection(UpdateRecordPayloadResponseProjection projection) {
        super(projection);
    }

    public UpdateRecordPayloadResponseProjection(List<UpdateRecordPayloadResponseProjection> projections) {
        super(projections);
    }

    public UpdateRecordPayloadResponseProjection all$() {
        return all$(3);
    }

    public UpdateRecordPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdateRecordPayloadResponseProjection.RecordResponseProjection.record", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateRecordPayloadResponseProjection.RecordResponseProjection.record", projectionDepthOnFields.getOrDefault("UpdateRecordPayloadResponseProjection.RecordResponseProjection.record", 0) + 1);
            this.record(new RecordResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateRecordPayloadResponseProjection.RecordResponseProjection.record", 0)));
        }
        this.typename();
        return this;
    }

    public UpdateRecordPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateRecordPayloadResponseProjection clientMutationId(String alias) {
        add$(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateRecordPayloadResponseProjection record(RecordResponseProjection subProjection) {
        return record(null, subProjection);
    }

    public UpdateRecordPayloadResponseProjection record(String alias, RecordResponseProjection subProjection) {
        add$(new GraphQLResponseField("record").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateRecordPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateRecordPayloadResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public UpdateRecordPayloadResponseProjection deepCopy$() {
        return new UpdateRecordPayloadResponseProjection(this);
    }


}
