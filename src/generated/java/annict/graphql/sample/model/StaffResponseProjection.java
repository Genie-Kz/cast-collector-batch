package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Staff
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class StaffResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public StaffResponseProjection() {
    }

    public StaffResponseProjection(StaffResponseProjection projection) {
        super(projection);
    }

    public StaffResponseProjection(List<StaffResponseProjection> projections) {
        super(projections);
    }

    public StaffResponseProjection all$() {
        return all$(3);
    }

    public StaffResponseProjection all$(int maxDepth) {
        this.annictId();
        this.id();
        this.name();
        this.nameEn();
        if (projectionDepthOnFields.getOrDefault("StaffResponseProjection.StaffResourceItemResponseProjection.resource", 0) <= maxDepth) {
            projectionDepthOnFields.put("StaffResponseProjection.StaffResourceItemResponseProjection.resource", projectionDepthOnFields.getOrDefault("StaffResponseProjection.StaffResourceItemResponseProjection.resource", 0) + 1);
            this.resource(new StaffResourceItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StaffResponseProjection.StaffResourceItemResponseProjection.resource", 0)));
        }
        this.roleOther();
        this.roleOtherEn();
        this.roleText();
        this.sortNumber();
        if (projectionDepthOnFields.getOrDefault("StaffResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("StaffResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("StaffResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StaffResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public StaffResponseProjection annictId() {
        return annictId(null);
    }

    public StaffResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public StaffResponseProjection id() {
        return id(null);
    }

    public StaffResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public StaffResponseProjection name() {
        return name(null);
    }

    public StaffResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public StaffResponseProjection nameEn() {
        return nameEn(null);
    }

    public StaffResponseProjection nameEn(String alias) {
        add$(new GraphQLResponseField("nameEn").alias(alias));
        return this;
    }

    public StaffResponseProjection resource(StaffResourceItemResponseProjection subProjection) {
        return resource(null, subProjection);
    }

    public StaffResponseProjection resource(String alias, StaffResourceItemResponseProjection subProjection) {
        add$(new GraphQLResponseField("resource").alias(alias).projection(subProjection));
        return this;
    }

    public StaffResponseProjection roleOther() {
        return roleOther(null);
    }

    public StaffResponseProjection roleOther(String alias) {
        add$(new GraphQLResponseField("roleOther").alias(alias));
        return this;
    }

    public StaffResponseProjection roleOtherEn() {
        return roleOtherEn(null);
    }

    public StaffResponseProjection roleOtherEn(String alias) {
        add$(new GraphQLResponseField("roleOtherEn").alias(alias));
        return this;
    }

    public StaffResponseProjection roleText() {
        return roleText(null);
    }

    public StaffResponseProjection roleText(String alias) {
        add$(new GraphQLResponseField("roleText").alias(alias));
        return this;
    }

    public StaffResponseProjection sortNumber() {
        return sortNumber(null);
    }

    public StaffResponseProjection sortNumber(String alias) {
        add$(new GraphQLResponseField("sortNumber").alias(alias));
        return this;
    }

    public StaffResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public StaffResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public StaffResponseProjection typename() {
        return typename(null);
    }

    public StaffResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public StaffResponseProjection deepCopy$() {
        return new StaffResponseProjection(this);
    }


}
