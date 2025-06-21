package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for UpdateStatusPayload
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class UpdateStatusPayloadResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UpdateStatusPayloadResponseProjection() {
    }

    public UpdateStatusPayloadResponseProjection(UpdateStatusPayloadResponseProjection projection) {
        super(projection);
    }

    public UpdateStatusPayloadResponseProjection(List<UpdateStatusPayloadResponseProjection> projections) {
        super(projections);
    }

    public UpdateStatusPayloadResponseProjection all$() {
        return all$(3);
    }

    public UpdateStatusPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdateStatusPayloadResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateStatusPayloadResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("UpdateStatusPayloadResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateStatusPayloadResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public UpdateStatusPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateStatusPayloadResponseProjection clientMutationId(String alias) {
        add$(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateStatusPayloadResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public UpdateStatusPayloadResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateStatusPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateStatusPayloadResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public UpdateStatusPayloadResponseProjection deepCopy$() {
        return new UpdateStatusPayloadResponseProjection(this);
    }


}
