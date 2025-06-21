package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for RecordEdge
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class RecordEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecordEdgeResponseProjection() {
    }

    public RecordEdgeResponseProjection(RecordEdgeResponseProjection projection) {
        super(projection);
    }

    public RecordEdgeResponseProjection(List<RecordEdgeResponseProjection> projections) {
        super(projections);
    }

    public RecordEdgeResponseProjection all$() {
        return all$(3);
    }

    public RecordEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RecordEdgeResponseProjection.RecordResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecordEdgeResponseProjection.RecordResponseProjection.node", projectionDepthOnFields.getOrDefault("RecordEdgeResponseProjection.RecordResponseProjection.node", 0) + 1);
            this.node(new RecordResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecordEdgeResponseProjection.RecordResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public RecordEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RecordEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RecordEdgeResponseProjection node(RecordResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RecordEdgeResponseProjection node(String alias, RecordResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RecordEdgeResponseProjection typename() {
        return typename(null);
    }

    public RecordEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public RecordEdgeResponseProjection deepCopy$() {
        return new RecordEdgeResponseProjection(this);
    }


}
