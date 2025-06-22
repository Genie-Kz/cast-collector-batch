package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for SeriesWorkConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:01+0900"
)
public class SeriesWorkConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SeriesWorkConnectionResponseProjection() {
    }

    public SeriesWorkConnectionResponseProjection(SeriesWorkConnectionResponseProjection projection) {
        super(projection);
    }

    public SeriesWorkConnectionResponseProjection(List<SeriesWorkConnectionResponseProjection> projections) {
        super(projections);
    }

    public SeriesWorkConnectionResponseProjection all$() {
        return all$(3);
    }

    public SeriesWorkConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("SeriesWorkConnectionResponseProjection.SeriesWorkEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("SeriesWorkConnectionResponseProjection.SeriesWorkEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("SeriesWorkConnectionResponseProjection.SeriesWorkEdgeResponseProjection.edges", 0) + 1);
            this.edges(new SeriesWorkEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SeriesWorkConnectionResponseProjection.SeriesWorkEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SeriesWorkConnectionResponseProjection.WorkResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("SeriesWorkConnectionResponseProjection.WorkResponseProjection.nodes", projectionDepthOnFields.getOrDefault("SeriesWorkConnectionResponseProjection.WorkResponseProjection.nodes", 0) + 1);
            this.nodes(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SeriesWorkConnectionResponseProjection.WorkResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SeriesWorkConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("SeriesWorkConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("SeriesWorkConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SeriesWorkConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public SeriesWorkConnectionResponseProjection edges(SeriesWorkEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public SeriesWorkConnectionResponseProjection edges(String alias, SeriesWorkEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public SeriesWorkConnectionResponseProjection nodes(WorkResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public SeriesWorkConnectionResponseProjection nodes(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public SeriesWorkConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public SeriesWorkConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public SeriesWorkConnectionResponseProjection typename() {
        return typename(null);
    }

    public SeriesWorkConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public SeriesWorkConnectionResponseProjection deepCopy$() {
        return new SeriesWorkConnectionResponseProjection(this);
    }


}
