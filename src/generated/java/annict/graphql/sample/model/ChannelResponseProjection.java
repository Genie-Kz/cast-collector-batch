package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Channel
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class ChannelResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ChannelResponseProjection() {
    }

    public ChannelResponseProjection(ChannelResponseProjection projection) {
        super(projection);
    }

    public ChannelResponseProjection(List<ChannelResponseProjection> projections) {
        super(projections);
    }

    public ChannelResponseProjection all$() {
        return all$(3);
    }

    public ChannelResponseProjection all$(int maxDepth) {
        this.annictId();
        if (projectionDepthOnFields.getOrDefault("ChannelResponseProjection.ChannelGroupResponseProjection.channelGroup", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChannelResponseProjection.ChannelGroupResponseProjection.channelGroup", projectionDepthOnFields.getOrDefault("ChannelResponseProjection.ChannelGroupResponseProjection.channelGroup", 0) + 1);
            this.channelGroup(new ChannelGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChannelResponseProjection.ChannelGroupResponseProjection.channelGroup", 0)));
        }
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("ChannelResponseProjection.ProgramConnectionResponseProjection.programs", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChannelResponseProjection.ProgramConnectionResponseProjection.programs", projectionDepthOnFields.getOrDefault("ChannelResponseProjection.ProgramConnectionResponseProjection.programs", 0) + 1);
            this.programs(new ProgramConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChannelResponseProjection.ProgramConnectionResponseProjection.programs", 0)));
        }
        this.published();
        this.scChid();
        this.typename();
        return this;
    }

    public ChannelResponseProjection annictId() {
        return annictId(null);
    }

    public ChannelResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public ChannelResponseProjection channelGroup(ChannelGroupResponseProjection subProjection) {
        return channelGroup(null, subProjection);
    }

    public ChannelResponseProjection channelGroup(String alias, ChannelGroupResponseProjection subProjection) {
        add$(new GraphQLResponseField("channelGroup").alias(alias).projection(subProjection));
        return this;
    }

    public ChannelResponseProjection id() {
        return id(null);
    }

    public ChannelResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ChannelResponseProjection name() {
        return name(null);
    }

    public ChannelResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ChannelResponseProjection programs(ProgramConnectionResponseProjection subProjection) {
        return programs((String)null, subProjection);
    }

    public ChannelResponseProjection programs(String alias, ProgramConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("programs").alias(alias).projection(subProjection));
        return this;
    }

    public ChannelResponseProjection programs(ChannelProgramsParametrizedInput input, ProgramConnectionResponseProjection subProjection) {
        return programs(null, input, subProjection);
    }

    public ChannelResponseProjection programs(String alias, ChannelProgramsParametrizedInput input, ProgramConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("programs").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ChannelResponseProjection published() {
        return published(null);
    }

    public ChannelResponseProjection published(String alias) {
        add$(new GraphQLResponseField("published").alias(alias));
        return this;
    }

    public ChannelResponseProjection scChid() {
        return scChid(null);
    }

    public ChannelResponseProjection scChid(String alias) {
        add$(new GraphQLResponseField("scChid").alias(alias));
        return this;
    }

    public ChannelResponseProjection typename() {
        return typename(null);
    }

    public ChannelResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ChannelResponseProjection deepCopy$() {
        return new ChannelResponseProjection(this);
    }


}
