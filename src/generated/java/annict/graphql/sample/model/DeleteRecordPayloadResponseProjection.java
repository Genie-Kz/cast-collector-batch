package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for DeleteRecordPayload
 */
public class DeleteRecordPayloadResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DeleteRecordPayloadResponseProjection() {
    }

    public DeleteRecordPayloadResponseProjection(DeleteRecordPayloadResponseProjection projection) {
        super(projection);
    }

    public DeleteRecordPayloadResponseProjection(List<DeleteRecordPayloadResponseProjection> projections) {
        super(projections);
    }

    public DeleteRecordPayloadResponseProjection all$() {
        return all$(3);
    }

    public DeleteRecordPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("DeleteRecordPayloadResponseProjection.EpisodeResponseProjection.episode", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeleteRecordPayloadResponseProjection.EpisodeResponseProjection.episode", projectionDepthOnFields.getOrDefault("DeleteRecordPayloadResponseProjection.EpisodeResponseProjection.episode", 0) + 1);
            this.episode(new EpisodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeleteRecordPayloadResponseProjection.EpisodeResponseProjection.episode", 0)));
        }
        this.typename();
        return this;
    }

    public DeleteRecordPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public DeleteRecordPayloadResponseProjection clientMutationId(String alias) {
        add$(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public DeleteRecordPayloadResponseProjection episode(EpisodeResponseProjection subProjection) {
        return episode(null, subProjection);
    }

    public DeleteRecordPayloadResponseProjection episode(String alias, EpisodeResponseProjection subProjection) {
        add$(new GraphQLResponseField("episode").alias(alias).projection(subProjection));
        return this;
    }

    public DeleteRecordPayloadResponseProjection typename() {
        return typename(null);
    }

    public DeleteRecordPayloadResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public DeleteRecordPayloadResponseProjection deepCopy$() {
        return new DeleteRecordPayloadResponseProjection(this);
    }


}
