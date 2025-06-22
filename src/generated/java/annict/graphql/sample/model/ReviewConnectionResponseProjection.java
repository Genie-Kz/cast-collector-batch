package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ReviewConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:01+0900"
)
public class ReviewConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ReviewConnectionResponseProjection() {
    }

    public ReviewConnectionResponseProjection(ReviewConnectionResponseProjection projection) {
        super(projection);
    }

    public ReviewConnectionResponseProjection(List<ReviewConnectionResponseProjection> projections) {
        super(projections);
    }

    public ReviewConnectionResponseProjection all$() {
        return all$(3);
    }

    public ReviewConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReviewConnectionResponseProjection.ReviewEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewConnectionResponseProjection.ReviewEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReviewConnectionResponseProjection.ReviewEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ReviewEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewConnectionResponseProjection.ReviewEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewConnectionResponseProjection.ReviewResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewConnectionResponseProjection.ReviewResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReviewConnectionResponseProjection.ReviewResponseProjection.nodes", 0) + 1);
            this.nodes(new ReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewConnectionResponseProjection.ReviewResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ReviewConnectionResponseProjection edges(ReviewEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ReviewConnectionResponseProjection edges(String alias, ReviewEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewConnectionResponseProjection nodes(ReviewResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ReviewConnectionResponseProjection nodes(String alias, ReviewResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ReviewConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewConnectionResponseProjection typename() {
        return typename(null);
    }

    public ReviewConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ReviewConnectionResponseProjection deepCopy$() {
        return new ReviewConnectionResponseProjection(this);
    }


}
