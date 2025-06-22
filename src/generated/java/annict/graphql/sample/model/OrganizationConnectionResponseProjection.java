package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for OrganizationConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:01+0900"
)
public class OrganizationConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public OrganizationConnectionResponseProjection() {
    }

    public OrganizationConnectionResponseProjection(OrganizationConnectionResponseProjection projection) {
        super(projection);
    }

    public OrganizationConnectionResponseProjection(List<OrganizationConnectionResponseProjection> projections) {
        super(projections);
    }

    public OrganizationConnectionResponseProjection all$() {
        return all$(3);
    }

    public OrganizationConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0) + 1);
            this.edges(new OrganizationEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0) + 1);
            this.nodes(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public OrganizationConnectionResponseProjection edges(OrganizationEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public OrganizationConnectionResponseProjection edges(String alias, OrganizationEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationConnectionResponseProjection nodes(OrganizationResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public OrganizationConnectionResponseProjection nodes(String alias, OrganizationResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public OrganizationConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationConnectionResponseProjection typename() {
        return typename(null);
    }

    public OrganizationConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public OrganizationConnectionResponseProjection deepCopy$() {
        return new OrganizationConnectionResponseProjection(this);
    }


}
