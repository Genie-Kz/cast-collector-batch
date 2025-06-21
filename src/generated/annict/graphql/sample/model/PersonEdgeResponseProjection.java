package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for PersonEdge
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class PersonEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PersonEdgeResponseProjection() {
    }

    public PersonEdgeResponseProjection(PersonEdgeResponseProjection projection) {
        super(projection);
    }

    public PersonEdgeResponseProjection(List<PersonEdgeResponseProjection> projections) {
        super(projections);
    }

    public PersonEdgeResponseProjection all$() {
        return all$(3);
    }

    public PersonEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PersonEdgeResponseProjection.PersonResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PersonEdgeResponseProjection.PersonResponseProjection.node", projectionDepthOnFields.getOrDefault("PersonEdgeResponseProjection.PersonResponseProjection.node", 0) + 1);
            this.node(new PersonResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PersonEdgeResponseProjection.PersonResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PersonEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PersonEdgeResponseProjection cursor(String alias) {
        add$(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PersonEdgeResponseProjection node(PersonResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PersonEdgeResponseProjection node(String alias, PersonResponseProjection subProjection) {
        add$(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PersonEdgeResponseProjection typename() {
        return typename(null);
    }

    public PersonEdgeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PersonEdgeResponseProjection deepCopy$() {
        return new PersonEdgeResponseProjection(this);
    }


}
