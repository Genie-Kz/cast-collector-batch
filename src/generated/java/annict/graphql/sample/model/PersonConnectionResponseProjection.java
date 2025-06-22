package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for PersonConnection
 */
public class PersonConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PersonConnectionResponseProjection() {
    }

    public PersonConnectionResponseProjection(PersonConnectionResponseProjection projection) {
        super(projection);
    }

    public PersonConnectionResponseProjection(List<PersonConnectionResponseProjection> projections) {
        super(projections);
    }

    public PersonConnectionResponseProjection all$() {
        return all$(3);
    }

    public PersonConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PersonConnectionResponseProjection.PersonEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PersonConnectionResponseProjection.PersonEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PersonConnectionResponseProjection.PersonEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PersonEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PersonConnectionResponseProjection.PersonEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PersonConnectionResponseProjection.PersonResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PersonConnectionResponseProjection.PersonResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PersonConnectionResponseProjection.PersonResponseProjection.nodes", 0) + 1);
            this.nodes(new PersonResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PersonConnectionResponseProjection.PersonResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PersonConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PersonConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PersonConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PersonConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public PersonConnectionResponseProjection edges(PersonEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PersonConnectionResponseProjection edges(String alias, PersonEdgeResponseProjection subProjection) {
        add$(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PersonConnectionResponseProjection nodes(PersonResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PersonConnectionResponseProjection nodes(String alias, PersonResponseProjection subProjection) {
        add$(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PersonConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PersonConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PersonConnectionResponseProjection typename() {
        return typename(null);
    }

    public PersonConnectionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PersonConnectionResponseProjection deepCopy$() {
        return new PersonConnectionResponseProjection(this);
    }


}
