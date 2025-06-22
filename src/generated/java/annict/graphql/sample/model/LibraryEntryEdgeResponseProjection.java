package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for LibraryEntryEdge
 */
public class LibraryEntryEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LibraryEntryEdgeResponseProjection() {
    }

    public LibraryEntryEdgeResponseProjection(LibraryEntryEdgeResponseProjection projection) {
        super(projection);
    }

    public LibraryEntryEdgeResponseProjection(List<LibraryEntryEdgeResponseProjection> projections) {
        super(projections);
    }

    public LibraryEntryEdgeResponseProjection all$() {
        return all$(3);
    }

    public LibraryEntryEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("LibraryEntryEdgeResponseProjection.LibraryEntryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("LibraryEntryEdgeResponseProjection.LibraryEntryResponseProjection.node", projectionDepthOnFields.getOrDefault("LibraryEntryEdgeResponseProjection.LibraryEntryResponseProjection.node", 0) + 1);
            this.node(new LibraryEntryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LibraryEntryEdgeResponseProjection.LibraryEntryResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public LibraryEntryEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public LibraryEntryEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public LibraryEntryEdgeResponseProjection node(LibraryEntryResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public LibraryEntryEdgeResponseProjection node(String alias, LibraryEntryResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public LibraryEntryEdgeResponseProjection typename() {
        return typename(null);
    }

    public LibraryEntryEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public LibraryEntryEdgeResponseProjection deepCopy$() {
        return new LibraryEntryEdgeResponseProjection(this);
    }


}
