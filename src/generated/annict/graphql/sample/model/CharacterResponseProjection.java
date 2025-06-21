package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Character
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class CharacterResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CharacterResponseProjection() {
    }

    public CharacterResponseProjection(CharacterResponseProjection projection) {
        super(projection);
    }

    public CharacterResponseProjection(List<CharacterResponseProjection> projections) {
        super(projections);
    }

    public CharacterResponseProjection all$() {
        return all$(3);
    }

    public CharacterResponseProjection all$(int maxDepth) {
        this.age();
        this.ageEn();
        this.annictId();
        this.birthday();
        this.birthdayEn();
        this.bloodType();
        this.bloodTypeEn();
        this.description();
        this.descriptionEn();
        this.descriptionSource();
        this.descriptionSourceEn();
        this.favoriteCharactersCount();
        this.height();
        this.heightEn();
        this.id();
        this.name();
        this.nameEn();
        this.nameKana();
        this.nationality();
        this.nationalityEn();
        this.nickname();
        this.nicknameEn();
        this.occupation();
        this.occupationEn();
        if (projectionDepthOnFields.getOrDefault("CharacterResponseProjection.SeriesResponseProjection.series", 0) <= maxDepth) {
            projectionDepthOnFields.put("CharacterResponseProjection.SeriesResponseProjection.series", projectionDepthOnFields.getOrDefault("CharacterResponseProjection.SeriesResponseProjection.series", 0) + 1);
            this.series(new SeriesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CharacterResponseProjection.SeriesResponseProjection.series", 0)));
        }
        this.weight();
        this.weightEn();
        this.typename();
        return this;
    }

    public CharacterResponseProjection age() {
        return age(null);
    }

    public CharacterResponseProjection age(String alias) {
        add$(new GraphQLResponseField("age").alias(alias));
        return this;
    }

    public CharacterResponseProjection ageEn() {
        return ageEn(null);
    }

    public CharacterResponseProjection ageEn(String alias) {
        add$(new GraphQLResponseField("ageEn").alias(alias));
        return this;
    }

    public CharacterResponseProjection annictId() {
        return annictId(null);
    }

    public CharacterResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public CharacterResponseProjection birthday() {
        return birthday(null);
    }

    public CharacterResponseProjection birthday(String alias) {
        add$(new GraphQLResponseField("birthday").alias(alias));
        return this;
    }

    public CharacterResponseProjection birthdayEn() {
        return birthdayEn(null);
    }

    public CharacterResponseProjection birthdayEn(String alias) {
        add$(new GraphQLResponseField("birthdayEn").alias(alias));
        return this;
    }

    public CharacterResponseProjection bloodType() {
        return bloodType(null);
    }

    public CharacterResponseProjection bloodType(String alias) {
        add$(new GraphQLResponseField("bloodType").alias(alias));
        return this;
    }

    public CharacterResponseProjection bloodTypeEn() {
        return bloodTypeEn(null);
    }

    public CharacterResponseProjection bloodTypeEn(String alias) {
        add$(new GraphQLResponseField("bloodTypeEn").alias(alias));
        return this;
    }

    public CharacterResponseProjection description() {
        return description(null);
    }

    public CharacterResponseProjection description(String alias) {
        add$(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public CharacterResponseProjection descriptionEn() {
        return descriptionEn(null);
    }

    public CharacterResponseProjection descriptionEn(String alias) {
        add$(new GraphQLResponseField("descriptionEn").alias(alias));
        return this;
    }

    public CharacterResponseProjection descriptionSource() {
        return descriptionSource(null);
    }

    public CharacterResponseProjection descriptionSource(String alias) {
        add$(new GraphQLResponseField("descriptionSource").alias(alias));
        return this;
    }

    public CharacterResponseProjection descriptionSourceEn() {
        return descriptionSourceEn(null);
    }

    public CharacterResponseProjection descriptionSourceEn(String alias) {
        add$(new GraphQLResponseField("descriptionSourceEn").alias(alias));
        return this;
    }

    public CharacterResponseProjection favoriteCharactersCount() {
        return favoriteCharactersCount(null);
    }

    public CharacterResponseProjection favoriteCharactersCount(String alias) {
        add$(new GraphQLResponseField("favoriteCharactersCount").alias(alias));
        return this;
    }

    public CharacterResponseProjection height() {
        return height(null);
    }

    public CharacterResponseProjection height(String alias) {
        add$(new GraphQLResponseField("height").alias(alias));
        return this;
    }

    public CharacterResponseProjection heightEn() {
        return heightEn(null);
    }

    public CharacterResponseProjection heightEn(String alias) {
        add$(new GraphQLResponseField("heightEn").alias(alias));
        return this;
    }

    public CharacterResponseProjection id() {
        return id(null);
    }

    public CharacterResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CharacterResponseProjection name() {
        return name(null);
    }

    public CharacterResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CharacterResponseProjection nameEn() {
        return nameEn(null);
    }

    public CharacterResponseProjection nameEn(String alias) {
        add$(new GraphQLResponseField("nameEn").alias(alias));
        return this;
    }

    public CharacterResponseProjection nameKana() {
        return nameKana(null);
    }

    public CharacterResponseProjection nameKana(String alias) {
        add$(new GraphQLResponseField("nameKana").alias(alias));
        return this;
    }

    public CharacterResponseProjection nationality() {
        return nationality(null);
    }

    public CharacterResponseProjection nationality(String alias) {
        add$(new GraphQLResponseField("nationality").alias(alias));
        return this;
    }

    public CharacterResponseProjection nationalityEn() {
        return nationalityEn(null);
    }

    public CharacterResponseProjection nationalityEn(String alias) {
        add$(new GraphQLResponseField("nationalityEn").alias(alias));
        return this;
    }

    public CharacterResponseProjection nickname() {
        return nickname(null);
    }

    public CharacterResponseProjection nickname(String alias) {
        add$(new GraphQLResponseField("nickname").alias(alias));
        return this;
    }

    public CharacterResponseProjection nicknameEn() {
        return nicknameEn(null);
    }

    public CharacterResponseProjection nicknameEn(String alias) {
        add$(new GraphQLResponseField("nicknameEn").alias(alias));
        return this;
    }

    public CharacterResponseProjection occupation() {
        return occupation(null);
    }

    public CharacterResponseProjection occupation(String alias) {
        add$(new GraphQLResponseField("occupation").alias(alias));
        return this;
    }

    public CharacterResponseProjection occupationEn() {
        return occupationEn(null);
    }

    public CharacterResponseProjection occupationEn(String alias) {
        add$(new GraphQLResponseField("occupationEn").alias(alias));
        return this;
    }

    public CharacterResponseProjection series(SeriesResponseProjection subProjection) {
        return series(null, subProjection);
    }

    public CharacterResponseProjection series(String alias, SeriesResponseProjection subProjection) {
        add$(new GraphQLResponseField("series").alias(alias).projection(subProjection));
        return this;
    }

    public CharacterResponseProjection weight() {
        return weight(null);
    }

    public CharacterResponseProjection weight(String alias) {
        add$(new GraphQLResponseField("weight").alias(alias));
        return this;
    }

    public CharacterResponseProjection weightEn() {
        return weightEn(null);
    }

    public CharacterResponseProjection weightEn(String alias) {
        add$(new GraphQLResponseField("weightEn").alias(alias));
        return this;
    }

    public CharacterResponseProjection typename() {
        return typename(null);
    }

    public CharacterResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public CharacterResponseProjection deepCopy$() {
        return new CharacterResponseProjection(this);
    }


}
