package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for CreateRecordPayload
 */
public class CreateRecordPayloadResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CreateRecordPayloadResponseProjection() {
    }

    public CreateRecordPayloadResponseProjection(CreateRecordPayloadResponseProjection projection) {
        super(projection);
    }

    public CreateRecordPayloadResponseProjection(List<CreateRecordPayloadResponseProjection> projections) {
        super(projections);
    }

    public CreateRecordPayloadResponseProjection all$() {
        return all$(3);
    }

    public CreateRecordPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("CreateRecordPayloadResponseProjection.RecordResponseProjection.record", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateRecordPayloadResponseProjection.RecordResponseProjection.record", projectionDepthOnFields.getOrDefault("CreateRecordPayloadResponseProjection.RecordResponseProjection.record", 0) + 1);
            this.record(new RecordResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateRecordPayloadResponseProjection.RecordResponseProjection.record", 0)));
        }
        this.typename();
        return this;
    }

    public CreateRecordPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public CreateRecordPayloadResponseProjection clientMutationId(String alias) {
        add$(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public CreateRecordPayloadResponseProjection record(RecordResponseProjection subProjection) {
        return record(null, subProjection);
    }

    public CreateRecordPayloadResponseProjection record(String alias, RecordResponseProjection subProjection) {
        add$(new GraphQLResponseField("record").alias(alias).projection(subProjection));
        return this;
    }

    public CreateRecordPayloadResponseProjection typename() {
        return typename(null);
    }

    public CreateRecordPayloadResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public CreateRecordPayloadResponseProjection deepCopy$() {
        return new CreateRecordPayloadResponseProjection(this);
    }


}
