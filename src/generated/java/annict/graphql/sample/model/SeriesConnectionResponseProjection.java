package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for SeriesConnection
 */
public class SeriesConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SeriesConnectionResponseProjection() {
    }

    public SeriesConnectionResponseProjection(SeriesConnectionResponseProjection projection) {
        super(projection);
    }

    public SeriesConnectionResponseProjection(List<SeriesConnectionResponseProjection> projections) {
        super(projections);
    }

    public SeriesConnectionResponseProjection all$() {
        return all$(3);
    }

    public SeriesConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("SeriesConnectionResponseProjection.SeriesEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("SeriesConnectionResponseProjection.SeriesEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("SeriesConnectionResponseProjection.SeriesEdgeResponseProjection.edges", 0) + 1);
            this.edges(new SeriesEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SeriesConnectionResponseProjection.SeriesEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SeriesConnectionResponseProjection.SeriesResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("SeriesConnectionResponseProjection.SeriesResponseProjection.nodes", projectionDepthOnFields.getOrDefault("SeriesConnectionResponseProjection.SeriesResponseProjection.nodes", 0) + 1);
            this.nodes(new SeriesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SeriesConnectionResponseProjection.SeriesResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SeriesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("SeriesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("SeriesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SeriesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public SeriesConnectionResponseProjection edges(SeriesEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public SeriesConnectionResponseProjection edges(String alias, SeriesEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public SeriesConnectionResponseProjection nodes(SeriesResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public SeriesConnectionResponseProjection nodes(String alias, SeriesResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public SeriesConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public SeriesConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public SeriesConnectionResponseProjection typename() {
        return typename(null);
    }

    public SeriesConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public SeriesConnectionResponseProjection deepCopy$() {
        return new SeriesConnectionResponseProjection(this);
    }


}
