package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ProgramConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class ProgramConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProgramConnectionResponseProjection() {
    }

    public ProgramConnectionResponseProjection(ProgramConnectionResponseProjection projection) {
        super(projection);
    }

    public ProgramConnectionResponseProjection(List<ProgramConnectionResponseProjection> projections) {
        super(projections);
    }

    public ProgramConnectionResponseProjection all$() {
        return all$(3);
    }

    public ProgramConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProgramConnectionResponseProjection.ProgramEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProgramConnectionResponseProjection.ProgramEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ProgramConnectionResponseProjection.ProgramEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ProgramEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProgramConnectionResponseProjection.ProgramEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProgramConnectionResponseProjection.ProgramResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProgramConnectionResponseProjection.ProgramResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ProgramConnectionResponseProjection.ProgramResponseProjection.nodes", 0) + 1);
            this.nodes(new ProgramResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProgramConnectionResponseProjection.ProgramResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProgramConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProgramConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ProgramConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProgramConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ProgramConnectionResponseProjection edges(ProgramEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ProgramConnectionResponseProjection edges(String alias, ProgramEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ProgramConnectionResponseProjection nodes(ProgramResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ProgramConnectionResponseProjection nodes(String alias, ProgramResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ProgramConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ProgramConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ProgramConnectionResponseProjection typename() {
        return typename(null);
    }

    public ProgramConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ProgramConnectionResponseProjection deepCopy$() {
        return new ProgramConnectionResponseProjection(this);
    }


}
