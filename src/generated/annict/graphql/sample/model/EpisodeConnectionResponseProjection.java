package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for EpisodeConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class EpisodeConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EpisodeConnectionResponseProjection() {
    }

    public EpisodeConnectionResponseProjection(EpisodeConnectionResponseProjection projection) {
        super(projection);
    }

    public EpisodeConnectionResponseProjection(List<EpisodeConnectionResponseProjection> projections) {
        super(projections);
    }

    public EpisodeConnectionResponseProjection all$() {
        return all$(3);
    }

    public EpisodeConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EpisodeConnectionResponseProjection.EpisodeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("EpisodeConnectionResponseProjection.EpisodeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("EpisodeConnectionResponseProjection.EpisodeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new EpisodeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EpisodeConnectionResponseProjection.EpisodeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EpisodeConnectionResponseProjection.EpisodeResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("EpisodeConnectionResponseProjection.EpisodeResponseProjection.nodes", projectionDepthOnFields.getOrDefault("EpisodeConnectionResponseProjection.EpisodeResponseProjection.nodes", 0) + 1);
            this.nodes(new EpisodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EpisodeConnectionResponseProjection.EpisodeResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EpisodeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("EpisodeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("EpisodeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EpisodeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public EpisodeConnectionResponseProjection edges(EpisodeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EpisodeConnectionResponseProjection edges(String alias, EpisodeEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EpisodeConnectionResponseProjection nodes(EpisodeResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public EpisodeConnectionResponseProjection nodes(String alias, EpisodeResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public EpisodeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EpisodeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public EpisodeConnectionResponseProjection typename() {
        return typename(null);
    }

    public EpisodeConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public EpisodeConnectionResponseProjection deepCopy$() {
        return new EpisodeConnectionResponseProjection(this);
    }


}
