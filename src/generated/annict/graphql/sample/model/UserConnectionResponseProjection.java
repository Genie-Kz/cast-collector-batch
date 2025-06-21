package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for UserConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class UserConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UserConnectionResponseProjection() {
    }

    public UserConnectionResponseProjection(UserConnectionResponseProjection projection) {
        super(projection);
    }

    public UserConnectionResponseProjection(List<UserConnectionResponseProjection> projections) {
        super(projections);
    }

    public UserConnectionResponseProjection all$() {
        return all$(3);
    }

    public UserConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) + 1);
            this.edges(new UserEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1);
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public UserConnectionResponseProjection edges(UserEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public UserConnectionResponseProjection edges(String alias, UserEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public UserConnectionResponseProjection nodes(UserResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public UserConnectionResponseProjection nodes(String alias, UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public UserConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public UserConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public UserConnectionResponseProjection typename() {
        return typename(null);
    }

    public UserConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public UserConnectionResponseProjection deepCopy$() {
        return new UserConnectionResponseProjection(this);
    }


}
