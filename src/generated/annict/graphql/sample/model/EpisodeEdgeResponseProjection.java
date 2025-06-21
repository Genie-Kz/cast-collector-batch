package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for EpisodeEdge
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class EpisodeEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EpisodeEdgeResponseProjection() {
    }

    public EpisodeEdgeResponseProjection(EpisodeEdgeResponseProjection projection) {
        super(projection);
    }

    public EpisodeEdgeResponseProjection(List<EpisodeEdgeResponseProjection> projections) {
        super(projections);
    }

    public EpisodeEdgeResponseProjection all$() {
        return all$(3);
    }

    public EpisodeEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("EpisodeEdgeResponseProjection.EpisodeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("EpisodeEdgeResponseProjection.EpisodeResponseProjection.node", projectionDepthOnFields.getOrDefault("EpisodeEdgeResponseProjection.EpisodeResponseProjection.node", 0) + 1);
            this.node(new EpisodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EpisodeEdgeResponseProjection.EpisodeResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public EpisodeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EpisodeEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public EpisodeEdgeResponseProjection node(EpisodeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EpisodeEdgeResponseProjection node(String alias, EpisodeResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EpisodeEdgeResponseProjection typename() {
        return typename(null);
    }

    public EpisodeEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public EpisodeEdgeResponseProjection deepCopy$() {
        return new EpisodeEdgeResponseProjection(this);
    }


}
