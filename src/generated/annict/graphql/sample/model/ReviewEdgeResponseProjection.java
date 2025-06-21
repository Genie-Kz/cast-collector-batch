package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ReviewEdge
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class ReviewEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ReviewEdgeResponseProjection() {
    }

    public ReviewEdgeResponseProjection(ReviewEdgeResponseProjection projection) {
        super(projection);
    }

    public ReviewEdgeResponseProjection(List<ReviewEdgeResponseProjection> projections) {
        super(projections);
    }

    public ReviewEdgeResponseProjection all$() {
        return all$(3);
    }

    public ReviewEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ReviewEdgeResponseProjection.ReviewResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewEdgeResponseProjection.ReviewResponseProjection.node", projectionDepthOnFields.getOrDefault("ReviewEdgeResponseProjection.ReviewResponseProjection.node", 0) + 1);
            this.node(new ReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewEdgeResponseProjection.ReviewResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ReviewEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ReviewEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ReviewEdgeResponseProjection node(ReviewResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ReviewEdgeResponseProjection node(String alias, ReviewResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewEdgeResponseProjection typename() {
        return typename(null);
    }

    public ReviewEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ReviewEdgeResponseProjection deepCopy$() {
        return new ReviewEdgeResponseProjection(this);
    }


}
