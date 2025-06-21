package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for SeriesEdge
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class SeriesEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SeriesEdgeResponseProjection() {
    }

    public SeriesEdgeResponseProjection(SeriesEdgeResponseProjection projection) {
        super(projection);
    }

    public SeriesEdgeResponseProjection(List<SeriesEdgeResponseProjection> projections) {
        super(projections);
    }

    public SeriesEdgeResponseProjection all$() {
        return all$(3);
    }

    public SeriesEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("SeriesEdgeResponseProjection.SeriesResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("SeriesEdgeResponseProjection.SeriesResponseProjection.node", projectionDepthOnFields.getOrDefault("SeriesEdgeResponseProjection.SeriesResponseProjection.node", 0) + 1);
            this.node(new SeriesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SeriesEdgeResponseProjection.SeriesResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public SeriesEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public SeriesEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public SeriesEdgeResponseProjection node(SeriesResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public SeriesEdgeResponseProjection node(String alias, SeriesResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public SeriesEdgeResponseProjection typename() {
        return typename(null);
    }

    public SeriesEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public SeriesEdgeResponseProjection deepCopy$() {
        return new SeriesEdgeResponseProjection(this);
    }


}
