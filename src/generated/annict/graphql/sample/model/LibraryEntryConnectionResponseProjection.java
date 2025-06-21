package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for LibraryEntryConnection
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class LibraryEntryConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LibraryEntryConnectionResponseProjection() {
    }

    public LibraryEntryConnectionResponseProjection(LibraryEntryConnectionResponseProjection projection) {
        super(projection);
    }

    public LibraryEntryConnectionResponseProjection(List<LibraryEntryConnectionResponseProjection> projections) {
        super(projections);
    }

    public LibraryEntryConnectionResponseProjection all$() {
        return all$(3);
    }

    public LibraryEntryConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LibraryEntryConnectionResponseProjection.LibraryEntryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("LibraryEntryConnectionResponseProjection.LibraryEntryEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("LibraryEntryConnectionResponseProjection.LibraryEntryEdgeResponseProjection.edges", 0) + 1);
            this.edges(new LibraryEntryEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LibraryEntryConnectionResponseProjection.LibraryEntryEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LibraryEntryConnectionResponseProjection.LibraryEntryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("LibraryEntryConnectionResponseProjection.LibraryEntryResponseProjection.nodes", projectionDepthOnFields.getOrDefault("LibraryEntryConnectionResponseProjection.LibraryEntryResponseProjection.nodes", 0) + 1);
            this.nodes(new LibraryEntryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LibraryEntryConnectionResponseProjection.LibraryEntryResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LibraryEntryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("LibraryEntryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("LibraryEntryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LibraryEntryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public LibraryEntryConnectionResponseProjection edges(LibraryEntryEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public LibraryEntryConnectionResponseProjection edges(String alias, LibraryEntryEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public LibraryEntryConnectionResponseProjection nodes(LibraryEntryResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public LibraryEntryConnectionResponseProjection nodes(String alias, LibraryEntryResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public LibraryEntryConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public LibraryEntryConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public LibraryEntryConnectionResponseProjection typename() {
        return typename(null);
    }

    public LibraryEntryConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public LibraryEntryConnectionResponseProjection deepCopy$() {
        return new LibraryEntryConnectionResponseProjection(this);
    }


}
