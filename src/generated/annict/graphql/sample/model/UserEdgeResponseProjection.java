package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for UserEdge
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class UserEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UserEdgeResponseProjection() {
    }

    public UserEdgeResponseProjection(UserEdgeResponseProjection projection) {
        super(projection);
    }

    public UserEdgeResponseProjection(List<UserEdgeResponseProjection> projections) {
        super(projections);
    }

    public UserEdgeResponseProjection all$() {
        return all$(3);
    }

    public UserEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0) + 1);
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public UserEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public UserEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public UserEdgeResponseProjection node(UserResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public UserEdgeResponseProjection node(String alias, UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public UserEdgeResponseProjection typename() {
        return typename(null);
    }

    public UserEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public UserEdgeResponseProjection deepCopy$() {
        return new UserEdgeResponseProjection(this);
    }


}
