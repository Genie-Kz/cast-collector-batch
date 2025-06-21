package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for SeriesWorkEdge
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class SeriesWorkEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SeriesWorkEdgeResponseProjection() {
    }

    public SeriesWorkEdgeResponseProjection(SeriesWorkEdgeResponseProjection projection) {
        super(projection);
    }

    public SeriesWorkEdgeResponseProjection(List<SeriesWorkEdgeResponseProjection> projections) {
        super(projections);
    }

    public SeriesWorkEdgeResponseProjection all$() {
        return all$(3);
    }

    public SeriesWorkEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("SeriesWorkEdgeResponseProjection.WorkResponseProjection.item", 0) <= maxDepth) {
            projectionDepthOnFields.put("SeriesWorkEdgeResponseProjection.WorkResponseProjection.item", projectionDepthOnFields.getOrDefault("SeriesWorkEdgeResponseProjection.WorkResponseProjection.item", 0) + 1);
            this.item(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SeriesWorkEdgeResponseProjection.WorkResponseProjection.item", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SeriesWorkEdgeResponseProjection.WorkResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("SeriesWorkEdgeResponseProjection.WorkResponseProjection.node", projectionDepthOnFields.getOrDefault("SeriesWorkEdgeResponseProjection.WorkResponseProjection.node", 0) + 1);
            this.node(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SeriesWorkEdgeResponseProjection.WorkResponseProjection.node", 0)));
        }
        this.summary();
        this.summaryEn();
        this.typename();
        return this;
    }

    public SeriesWorkEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public SeriesWorkEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public SeriesWorkEdgeResponseProjection item(WorkResponseProjection subProjection) {
        return item(null, subProjection);
    }

    public SeriesWorkEdgeResponseProjection item(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("item").alias(alias).projection(subProjection));
        return this;
    }

    public SeriesWorkEdgeResponseProjection node(WorkResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public SeriesWorkEdgeResponseProjection node(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public SeriesWorkEdgeResponseProjection summary() {
        return summary(null);
    }

    public SeriesWorkEdgeResponseProjection summary(String alias) {
        add$(new GraphQLResponseField("summary").alias(alias));
        return this;
    }

    public SeriesWorkEdgeResponseProjection summaryEn() {
        return summaryEn(null);
    }

    public SeriesWorkEdgeResponseProjection summaryEn(String alias) {
        add$(new GraphQLResponseField("summaryEn").alias(alias));
        return this;
    }

    public SeriesWorkEdgeResponseProjection typename() {
        return typename(null);
    }

    public SeriesWorkEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public SeriesWorkEdgeResponseProjection deepCopy$() {
        return new SeriesWorkEdgeResponseProjection(this);
    }


}
