package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Person
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:01+0900"
)
public class PersonResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PersonResponseProjection() {
    }

    public PersonResponseProjection(PersonResponseProjection projection) {
        super(projection);
    }

    public PersonResponseProjection(List<PersonResponseProjection> projections) {
        super(projections);
    }

    public PersonResponseProjection all$() {
        return all$(3);
    }

    public PersonResponseProjection all$(int maxDepth) {
        this.annictId();
        this.birthday();
        this.bloodType();
        this.castsCount();
        this.favoritePeopleCount();
        this.genderText();
        this.height();
        this.id();
        this.name();
        this.nameEn();
        this.nameKana();
        this.nickname();
        this.nicknameEn();
        if (projectionDepthOnFields.getOrDefault("PersonResponseProjection.PrefectureResponseProjection.prefecture", 0) <= maxDepth) {
            projectionDepthOnFields.put("PersonResponseProjection.PrefectureResponseProjection.prefecture", projectionDepthOnFields.getOrDefault("PersonResponseProjection.PrefectureResponseProjection.prefecture", 0) + 1);
            this.prefecture(new PrefectureResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PersonResponseProjection.PrefectureResponseProjection.prefecture", 0)));
        }
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

    public PersonResponseProjection annictId() {
        return annictId(null);
    }

    public PersonResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public PersonResponseProjection birthday() {
        return birthday(null);
    }

    public PersonResponseProjection birthday(String alias) {
        add$(new GraphQLResponseField("birthday").alias(alias));
        return this;
    }

    public PersonResponseProjection bloodType() {
        return bloodType(null);
    }

    public PersonResponseProjection bloodType(String alias) {
        add$(new GraphQLResponseField("bloodType").alias(alias));
        return this;
    }

    public PersonResponseProjection castsCount() {
        return castsCount(null);
    }

    public PersonResponseProjection castsCount(String alias) {
        add$(new GraphQLResponseField("castsCount").alias(alias));
        return this;
    }

    public PersonResponseProjection favoritePeopleCount() {
        return favoritePeopleCount(null);
    }

    public PersonResponseProjection favoritePeopleCount(String alias) {
        add$(new GraphQLResponseField("favoritePeopleCount").alias(alias));
        return this;
    }

    public PersonResponseProjection genderText() {
        return genderText(null);
    }

    public PersonResponseProjection genderText(String alias) {
        add$(new GraphQLResponseField("genderText").alias(alias));
        return this;
    }

    public PersonResponseProjection height() {
        return height(null);
    }

    public PersonResponseProjection height(String alias) {
        add$(new GraphQLResponseField("height").alias(alias));
        return this;
    }

    public PersonResponseProjection id() {
        return id(null);
    }

    public PersonResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PersonResponseProjection name() {
        return name(null);
    }

    public PersonResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PersonResponseProjection nameEn() {
        return nameEn(null);
    }

    public PersonResponseProjection nameEn(String alias) {
        add$(new GraphQLResponseField("nameEn").alias(alias));
        return this;
    }

    public PersonResponseProjection nameKana() {
        return nameKana(null);
    }

    public PersonResponseProjection nameKana(String alias) {
        add$(new GraphQLResponseField("nameKana").alias(alias));
        return this;
    }

    public PersonResponseProjection nickname() {
        return nickname(null);
    }

    public PersonResponseProjection nickname(String alias) {
        add$(new GraphQLResponseField("nickname").alias(alias));
        return this;
    }

    public PersonResponseProjection nicknameEn() {
        return nicknameEn(null);
    }

    public PersonResponseProjection nicknameEn(String alias) {
        add$(new GraphQLResponseField("nicknameEn").alias(alias));
        return this;
    }

    public PersonResponseProjection prefecture(PrefectureResponseProjection subProjection) {
        return prefecture(null, subProjection);
    }

    public PersonResponseProjection prefecture(String alias, PrefectureResponseProjection subProjection) {
        add$(new GraphQLResponseField("prefecture").alias(alias).projection(subProjection));
        return this;
    }

    public PersonResponseProjection staffsCount() {
        return staffsCount(null);
    }

    public PersonResponseProjection staffsCount(String alias) {
        add$(new GraphQLResponseField("staffsCount").alias(alias));
        return this;
    }

    public PersonResponseProjection twitterUsername() {
        return twitterUsername(null);
    }

    public PersonResponseProjection twitterUsername(String alias) {
        add$(new GraphQLResponseField("twitterUsername").alias(alias));
        return this;
    }

    public PersonResponseProjection twitterUsernameEn() {
        return twitterUsernameEn(null);
    }

    public PersonResponseProjection twitterUsernameEn(String alias) {
        add$(new GraphQLResponseField("twitterUsernameEn").alias(alias));
        return this;
    }

    public PersonResponseProjection url() {
        return url(null);
    }

    public PersonResponseProjection url(String alias) {
        add$(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public PersonResponseProjection urlEn() {
        return urlEn(null);
    }

    public PersonResponseProjection urlEn(String alias) {
        add$(new GraphQLResponseField("urlEn").alias(alias));
        return this;
    }

    public PersonResponseProjection wikipediaUrl() {
        return wikipediaUrl(null);
    }

    public PersonResponseProjection wikipediaUrl(String alias) {
        add$(new GraphQLResponseField("wikipediaUrl").alias(alias));
        return this;
    }

    public PersonResponseProjection wikipediaUrlEn() {
        return wikipediaUrlEn(null);
    }

    public PersonResponseProjection wikipediaUrlEn(String alias) {
        add$(new GraphQLResponseField("wikipediaUrlEn").alias(alias));
        return this;
    }

    public PersonResponseProjection typename() {
        return typename(null);
    }

    public PersonResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PersonResponseProjection deepCopy$() {
        return new PersonResponseProjection(this);
    }


}
