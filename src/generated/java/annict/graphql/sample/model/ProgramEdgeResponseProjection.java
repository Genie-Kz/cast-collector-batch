package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ProgramEdge
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class ProgramEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProgramEdgeResponseProjection() {
    }

    public ProgramEdgeResponseProjection(ProgramEdgeResponseProjection projection) {
        super(projection);
    }

    public ProgramEdgeResponseProjection(List<ProgramEdgeResponseProjection> projections) {
        super(projections);
    }

    public ProgramEdgeResponseProjection all$() {
        return all$(3);
    }

    public ProgramEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ProgramEdgeResponseProjection.ProgramResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProgramEdgeResponseProjection.ProgramResponseProjection.node", projectionDepthOnFields.getOrDefault("ProgramEdgeResponseProjection.ProgramResponseProjection.node", 0) + 1);
            this.node(new ProgramResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProgramEdgeResponseProjection.ProgramResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ProgramEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ProgramEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ProgramEdgeResponseProjection node(ProgramResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ProgramEdgeResponseProjection node(String alias, ProgramResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ProgramEdgeResponseProjection typename() {
        return typename(null);
    }

    public ProgramEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ProgramEdgeResponseProjection deepCopy$() {
        return new ProgramEdgeResponseProjection(this);
    }


}
