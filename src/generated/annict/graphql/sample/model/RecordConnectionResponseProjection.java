package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for RecordConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class RecordConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecordConnectionResponseProjection() {
    }

    public RecordConnectionResponseProjection(RecordConnectionResponseProjection projection) {
        super(projection);
    }

    public RecordConnectionResponseProjection(List<RecordConnectionResponseProjection> projections) {
        super(projections);
    }

    public RecordConnectionResponseProjection all$() {
        return all$(3);
    }

    public RecordConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RecordConnectionResponseProjection.RecordEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecordConnectionResponseProjection.RecordEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RecordConnectionResponseProjection.RecordEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RecordEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecordConnectionResponseProjection.RecordEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RecordConnectionResponseProjection.RecordResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecordConnectionResponseProjection.RecordResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RecordConnectionResponseProjection.RecordResponseProjection.nodes", 0) + 1);
            this.nodes(new RecordResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecordConnectionResponseProjection.RecordResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RecordConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecordConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RecordConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecordConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public RecordConnectionResponseProjection edges(RecordEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RecordConnectionResponseProjection edges(String alias, RecordEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RecordConnectionResponseProjection nodes(RecordResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public RecordConnectionResponseProjection nodes(String alias, RecordResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public RecordConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RecordConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RecordConnectionResponseProjection typename() {
        return typename(null);
    }

    public RecordConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public RecordConnectionResponseProjection deepCopy$() {
        return new RecordConnectionResponseProjection(this);
    }


}
