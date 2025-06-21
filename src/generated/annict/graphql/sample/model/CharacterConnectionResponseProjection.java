package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for CharacterConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class CharacterConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CharacterConnectionResponseProjection() {
    }

    public CharacterConnectionResponseProjection(CharacterConnectionResponseProjection projection) {
        super(projection);
    }

    public CharacterConnectionResponseProjection(List<CharacterConnectionResponseProjection> projections) {
        super(projections);
    }

    public CharacterConnectionResponseProjection all$() {
        return all$(3);
    }

    public CharacterConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CharacterConnectionResponseProjection.CharacterEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CharacterConnectionResponseProjection.CharacterEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CharacterConnectionResponseProjection.CharacterEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CharacterEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CharacterConnectionResponseProjection.CharacterEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CharacterConnectionResponseProjection.CharacterResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CharacterConnectionResponseProjection.CharacterResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CharacterConnectionResponseProjection.CharacterResponseProjection.nodes", 0) + 1);
            this.nodes(new CharacterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CharacterConnectionResponseProjection.CharacterResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CharacterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CharacterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CharacterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CharacterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public CharacterConnectionResponseProjection edges(CharacterEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CharacterConnectionResponseProjection edges(String alias, CharacterEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CharacterConnectionResponseProjection nodes(CharacterResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public CharacterConnectionResponseProjection nodes(String alias, CharacterResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public CharacterConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CharacterConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CharacterConnectionResponseProjection typename() {
        return typename(null);
    }

    public CharacterConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public CharacterConnectionResponseProjection deepCopy$() {
        return new CharacterConnectionResponseProjection(this);
    }


}
