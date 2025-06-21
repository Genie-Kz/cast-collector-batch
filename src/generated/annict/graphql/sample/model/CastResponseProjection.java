package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Cast
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class CastResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CastResponseProjection() {
    }

    public CastResponseProjection(CastResponseProjection projection) {
        super(projection);
    }

    public CastResponseProjection(List<CastResponseProjection> projections) {
        super(projections);
    }

    public CastResponseProjection all$() {
        return all$(3);
    }

    public CastResponseProjection all$(int maxDepth) {
        this.annictId();
        if (projectionDepthOnFields.getOrDefault("CastResponseProjection.CharacterResponseProjection.character", 0) <= maxDepth) {
            projectionDepthOnFields.put("CastResponseProjection.CharacterResponseProjection.character", projectionDepthOnFields.getOrDefault("CastResponseProjection.CharacterResponseProjection.character", 0) + 1);
            this.character(new CharacterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CastResponseProjection.CharacterResponseProjection.character", 0)));
        }
        this.id();
        this.name();
        this.nameEn();
        if (projectionDepthOnFields.getOrDefault("CastResponseProjection.PersonResponseProjection.person", 0) <= maxDepth) {
            projectionDepthOnFields.put("CastResponseProjection.PersonResponseProjection.person", projectionDepthOnFields.getOrDefault("CastResponseProjection.PersonResponseProjection.person", 0) + 1);
            this.person(new PersonResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CastResponseProjection.PersonResponseProjection.person", 0)));
        }
        this.sortNumber();
        if (projectionDepthOnFields.getOrDefault("CastResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("CastResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("CastResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CastResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public CastResponseProjection annictId() {
        return annictId(null);
    }

    public CastResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public CastResponseProjection character(CharacterResponseProjection subProjection) {
        return character(null, subProjection);
    }

    public CastResponseProjection character(String alias, CharacterResponseProjection subProjection) {
        add$(new GraphQLResponseField("character").alias(alias).projection(subProjection));
        return this;
    }

    public CastResponseProjection id() {
        return id(null);
    }

    public CastResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CastResponseProjection name() {
        return name(null);
    }

    public CastResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CastResponseProjection nameEn() {
        return nameEn(null);
    }

    public CastResponseProjection nameEn(String alias) {
        add$(new GraphQLResponseField("nameEn").alias(alias));
        return this;
    }

    public CastResponseProjection person(PersonResponseProjection subProjection) {
        return person(null, subProjection);
    }

    public CastResponseProjection person(String alias, PersonResponseProjection subProjection) {
        add$(new GraphQLResponseField("person").alias(alias).projection(subProjection));
        return this;
    }

    public CastResponseProjection sortNumber() {
        return sortNumber(null);
    }

    public CastResponseProjection sortNumber(String alias) {
        add$(new GraphQLResponseField("sortNumber").alias(alias));
        return this;
    }

    public CastResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public CastResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public CastResponseProjection typename() {
        return typename(null);
    }

    public CastResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public CastResponseProjection deepCopy$() {
        return new CastResponseProjection(this);
    }


}
