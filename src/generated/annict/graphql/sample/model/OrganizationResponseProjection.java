package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Organization
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class OrganizationResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public OrganizationResponseProjection() {
    }

    public OrganizationResponseProjection(OrganizationResponseProjection projection) {
        super(projection);
    }

    public OrganizationResponseProjection(List<OrganizationResponseProjection> projections) {
        super(projections);
    }

    public OrganizationResponseProjection all$() {
        return all$(3);
    }

    public OrganizationResponseProjection all$(int maxDepth) {
        this.annictId();
        this.favoriteOrganizationsCount();
        this.id();
        this.name();
        this.nameEn();
        this.nameKana();
        this.staffsCount();
        this.twitterUsername();
        this.twitterUsernameEn();
        this.url();
        this.urlEn();
        this.wikipediaUrl();
        this.wikipediaUrlEn();
        this.typename();
        return this;
    }

    public OrganizationResponseProjection annictId() {
        return annictId(null);
    }

    public OrganizationResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public OrganizationResponseProjection favoriteOrganizationsCount() {
        return favoriteOrganizationsCount(null);
    }

    public OrganizationResponseProjection favoriteOrganizationsCount(String alias) {
        add$(new GraphQLResponseField("favoriteOrganizationsCount").alias(alias));
        return this;
    }

    public OrganizationResponseProjection id() {
        return id(null);
    }

    public OrganizationResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public OrganizationResponseProjection name() {
        return name(null);
    }

    public OrganizationResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public OrganizationResponseProjection nameEn() {
        return nameEn(null);
    }

    public OrganizationResponseProjection nameEn(String alias) {
        add$(new GraphQLResponseField("nameEn").alias(alias));
        return this;
    }

    public OrganizationResponseProjection nameKana() {
        return nameKana(null);
    }

    public OrganizationResponseProjection nameKana(String alias) {
        add$(new GraphQLResponseField("nameKana").alias(alias));
        return this;
    }

    public OrganizationResponseProjection staffsCount() {
        return staffsCount(null);
    }

    public OrganizationResponseProjection staffsCount(String alias) {
        add$(new GraphQLResponseField("staffsCount").alias(alias));
        return this;
    }

    public OrganizationResponseProjection twitterUsername() {
        return twitterUsername(null);
    }

    public OrganizationResponseProjection twitterUsername(String alias) {
        add$(new GraphQLResponseField("twitterUsername").alias(alias));
        return this;
    }

    public OrganizationResponseProjection twitterUsernameEn() {
        return twitterUsernameEn(null);
    }

    public OrganizationResponseProjection twitterUsernameEn(String alias) {
        add$(new GraphQLResponseField("twitterUsernameEn").alias(alias));
        return this;
    }

    public OrganizationResponseProjection url() {
        return url(null);
    }

    public OrganizationResponseProjection url(String alias) {
        add$(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public OrganizationResponseProjection urlEn() {
        return urlEn(null);
    }

    public OrganizationResponseProjection urlEn(String alias) {
        add$(new GraphQLResponseField("urlEn").alias(alias));
        return this;
    }

    public OrganizationResponseProjection wikipediaUrl() {
        return wikipediaUrl(null);
    }

    public OrganizationResponseProjection wikipediaUrl(String alias) {
        add$(new GraphQLResponseField("wikipediaUrl").alias(alias));
        return this;
    }

    public OrganizationResponseProjection wikipediaUrlEn() {
        return wikipediaUrlEn(null);
    }

    public OrganizationResponseProjection wikipediaUrlEn(String alias) {
        add$(new GraphQLResponseField("wikipediaUrlEn").alias(alias));
        return this;
    }

    public OrganizationResponseProjection typename() {
        return typename(null);
    }

    public OrganizationResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public OrganizationResponseProjection deepCopy$() {
        return new OrganizationResponseProjection(this);
    }


}
