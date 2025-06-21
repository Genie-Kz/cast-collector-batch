package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Series
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class SeriesResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SeriesResponseProjection() {
    }

    public SeriesResponseProjection(SeriesResponseProjection projection) {
        super(projection);
    }

    public SeriesResponseProjection(List<SeriesResponseProjection> projections) {
        super(projections);
    }

    public SeriesResponseProjection all$() {
        return all$(3);
    }

    public SeriesResponseProjection all$(int maxDepth) {
        this.annictId();
        this.id();
        this.name();
        this.nameEn();
        this.nameRo();
        if (projectionDepthOnFields.getOrDefault("SeriesResponseProjection.SeriesWorkConnectionResponseProjection.works", 0) <= maxDepth) {
            projectionDepthOnFields.put("SeriesResponseProjection.SeriesWorkConnectionResponseProjection.works", projectionDepthOnFields.getOrDefault("SeriesResponseProjection.SeriesWorkConnectionResponseProjection.works", 0) + 1);
            this.works(new SeriesWorkConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SeriesResponseProjection.SeriesWorkConnectionResponseProjection.works", 0)));
        }
        this.typename();
        return this;
    }

    public SeriesResponseProjection annictId() {
        return annictId(null);
    }

    public SeriesResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public SeriesResponseProjection id() {
        return id(null);
    }

    public SeriesResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SeriesResponseProjection name() {
        return name(null);
    }

    public SeriesResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public SeriesResponseProjection nameEn() {
        return nameEn(null);
    }

    public SeriesResponseProjection nameEn(String alias) {
        add$(new GraphQLResponseField("nameEn").alias(alias));
        return this;
    }

    public SeriesResponseProjection nameRo() {
        return nameRo(null);
    }

    public SeriesResponseProjection nameRo(String alias) {
        add$(new GraphQLResponseField("nameRo").alias(alias));
        return this;
    }

    public SeriesResponseProjection works(SeriesWorkConnectionResponseProjection subProjection) {
        return works((String)null, subProjection);
    }

    public SeriesResponseProjection works(String alias, SeriesWorkConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("works").alias(alias).projection(subProjection));
        return this;
    }

    public SeriesResponseProjection works(SeriesWorksParametrizedInput input, SeriesWorkConnectionResponseProjection subProjection) {
        return works(null, input, subProjection);
    }

    public SeriesResponseProjection works(String alias, SeriesWorksParametrizedInput input, SeriesWorkConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("works").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public SeriesResponseProjection typename() {
        return typename(null);
    }

    public SeriesResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public SeriesResponseProjection deepCopy$() {
        return new SeriesResponseProjection(this);
    }


}
