package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for PageInfo
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:01+0900"
)
public class PageInfoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PageInfoResponseProjection() {
    }

    public PageInfoResponseProjection(PageInfoResponseProjection projection) {
        super(projection);
    }

    public PageInfoResponseProjection(List<PageInfoResponseProjection> projections) {
        super(projections);
    }

    public PageInfoResponseProjection all$() {
        return all$(3);
    }

    public PageInfoResponseProjection all$(int maxDepth) {
        this.endCursor();
        this.hasNextPage();
        this.hasPreviousPage();
        this.startCursor();
        this.typename();
        return this;
    }

    public PageInfoResponseProjection endCursor() {
        return endCursor(null);
    }

    public PageInfoResponseProjection endCursor(String alias) {
        add$(new GraphQLResponseField("endCursor").alias(alias));
        return this;
    }

    public PageInfoResponseProjection hasNextPage() {
        return hasNextPage(null);
    }

    public PageInfoResponseProjection hasNextPage(String alias) {
        add$(new GraphQLResponseField("hasNextPage").alias(alias));
        return this;
    }

    public PageInfoResponseProjection hasPreviousPage() {
        return hasPreviousPage(null);
    }

    public PageInfoResponseProjection hasPreviousPage(String alias) {
        add$(new GraphQLResponseField("hasPreviousPage").alias(alias));
        return this;
    }

    public PageInfoResponseProjection startCursor() {
        return startCursor(null);
    }

    public PageInfoResponseProjection startCursor(String alias) {
        add$(new GraphQLResponseField("startCursor").alias(alias));
        return this;
    }

    public PageInfoResponseProjection typename() {
        return typename(null);
    }

    public PageInfoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PageInfoResponseProjection deepCopy$() {
        return new PageInfoResponseProjection(this);
    }


}
