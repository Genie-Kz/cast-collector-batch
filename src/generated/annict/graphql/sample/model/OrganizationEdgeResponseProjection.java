package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for OrganizationEdge
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class OrganizationEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public OrganizationEdgeResponseProjection() {
    }

    public OrganizationEdgeResponseProjection(OrganizationEdgeResponseProjection projection) {
        super(projection);
    }

    public OrganizationEdgeResponseProjection(List<OrganizationEdgeResponseProjection> projections) {
        super(projections);
    }

    public OrganizationEdgeResponseProjection all$() {
        return all$(3);
    }

    public OrganizationEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0) + 1);
            this.node(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public OrganizationEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public OrganizationEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public OrganizationEdgeResponseProjection node(OrganizationResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public OrganizationEdgeResponseProjection node(String alias, OrganizationResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationEdgeResponseProjection typename() {
        return typename(null);
    }

    public OrganizationEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public OrganizationEdgeResponseProjection deepCopy$() {
        return new OrganizationEdgeResponseProjection(this);
    }


}
