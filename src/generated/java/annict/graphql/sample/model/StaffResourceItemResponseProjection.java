package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for StaffResourceItem
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class StaffResourceItemResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public StaffResourceItemResponseProjection() {
    }

    public StaffResourceItemResponseProjection(StaffResourceItemResponseProjection projection) {
        super(projection);
    }

    public StaffResourceItemResponseProjection(List<StaffResourceItemResponseProjection> projections) {
        super(projections);
    }

    public StaffResourceItemResponseProjection all$() {
        return all$(3);
    }

    public StaffResourceItemResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("StaffResourceItemResponseProjection.OrganizationResponseProjection.onOrganization", 0) <= maxDepth) {
            projectionDepthOnFields.put("StaffResourceItemResponseProjection.OrganizationResponseProjection.onOrganization", projectionDepthOnFields.getOrDefault("StaffResourceItemResponseProjection.OrganizationResponseProjection.onOrganization", 0) + 1);
            this.onOrganization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StaffResourceItemResponseProjection.OrganizationResponseProjection.onOrganization", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("StaffResourceItemResponseProjection.PersonResponseProjection.onPerson", 0) <= maxDepth) {
            projectionDepthOnFields.put("StaffResourceItemResponseProjection.PersonResponseProjection.onPerson", projectionDepthOnFields.getOrDefault("StaffResourceItemResponseProjection.PersonResponseProjection.onPerson", 0) + 1);
            this.onPerson(new PersonResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StaffResourceItemResponseProjection.PersonResponseProjection.onPerson", 0)));
        }
        this.typename();
        return this;
    }

    public StaffResourceItemResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public StaffResourceItemResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public StaffResourceItemResponseProjection onPerson(PersonResponseProjection subProjection) {
        return onPerson(null, subProjection);
    }

    public StaffResourceItemResponseProjection onPerson(String alias, PersonResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Person").alias(alias).projection(subProjection));
        return this;
    }

    public StaffResourceItemResponseProjection typename() {
        return typename(null);
    }

    public StaffResourceItemResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public StaffResourceItemResponseProjection deepCopy$() {
        return new StaffResourceItemResponseProjection(this);
    }


}
