package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Prefecture
 */
public class PrefectureResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PrefectureResponseProjection() {
    }

    public PrefectureResponseProjection(PrefectureResponseProjection projection) {
        super(projection);
    }

    public PrefectureResponseProjection(List<PrefectureResponseProjection> projections) {
        super(projections);
    }

    public PrefectureResponseProjection all$() {
        return all$(3);
    }

    public PrefectureResponseProjection all$(int maxDepth) {
        this.annictId();
        this.id();
        this.name();
        this.typename();
        return this;
    }

    public PrefectureResponseProjection annictId() {
        return annictId(null);
    }

    public PrefectureResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public PrefectureResponseProjection id() {
        return id(null);
    }

    public PrefectureResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PrefectureResponseProjection name() {
        return name(null);
    }

    public PrefectureResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PrefectureResponseProjection typename() {
        return typename(null);
    }

    public PrefectureResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PrefectureResponseProjection deepCopy$() {
        return new PrefectureResponseProjection(this);
    }


}
