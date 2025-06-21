package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for CharacterEdge
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class CharacterEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CharacterEdgeResponseProjection() {
    }

    public CharacterEdgeResponseProjection(CharacterEdgeResponseProjection projection) {
        super(projection);
    }

    public CharacterEdgeResponseProjection(List<CharacterEdgeResponseProjection> projections) {
        super(projections);
    }

    public CharacterEdgeResponseProjection all$() {
        return all$(3);
    }

    public CharacterEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CharacterEdgeResponseProjection.CharacterResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CharacterEdgeResponseProjection.CharacterResponseProjection.node", projectionDepthOnFields.getOrDefault("CharacterEdgeResponseProjection.CharacterResponseProjection.node", 0) + 1);
            this.node(new CharacterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CharacterEdgeResponseProjection.CharacterResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CharacterEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CharacterEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CharacterEdgeResponseProjection node(CharacterResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CharacterEdgeResponseProjection node(String alias, CharacterResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CharacterEdgeResponseProjection typename() {
        return typename(null);
    }

    public CharacterEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public CharacterEdgeResponseProjection deepCopy$() {
        return new CharacterEdgeResponseProjection(this);
    }


}
