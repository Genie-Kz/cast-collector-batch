package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ChannelGroup
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class ChannelGroupResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ChannelGroupResponseProjection() {
    }

    public ChannelGroupResponseProjection(ChannelGroupResponseProjection projection) {
        super(projection);
    }

    public ChannelGroupResponseProjection(List<ChannelGroupResponseProjection> projections) {
        super(projections);
    }

    public ChannelGroupResponseProjection all$() {
        return all$(3);
    }

    public ChannelGroupResponseProjection all$(int maxDepth) {
        this.annictId();
        if (projectionDepthOnFields.getOrDefault("ChannelGroupResponseProjection.ChannelConnectionResponseProjection.channels", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChannelGroupResponseProjection.ChannelConnectionResponseProjection.channels", projectionDepthOnFields.getOrDefault("ChannelGroupResponseProjection.ChannelConnectionResponseProjection.channels", 0) + 1);
            this.channels(new ChannelConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChannelGroupResponseProjection.ChannelConnectionResponseProjection.channels", 0)));
        }
        this.id();
        this.name();
        this.sortNumber();
        this.typename();
        return this;
    }

    public ChannelGroupResponseProjection annictId() {
        return annictId(null);
    }

    public ChannelGroupResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public ChannelGroupResponseProjection channels(ChannelConnectionResponseProjection subProjection) {
        return channels((String)null, subProjection);
    }

    public ChannelGroupResponseProjection channels(String alias, ChannelConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("channels").alias(alias).projection(subProjection));
        return this;
    }

    public ChannelGroupResponseProjection channels(ChannelGroupChannelsParametrizedInput input, ChannelConnectionResponseProjection subProjection) {
        return channels(null, input, subProjection);
    }

    public ChannelGroupResponseProjection channels(String alias, ChannelGroupChannelsParametrizedInput input, ChannelConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("channels").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ChannelGroupResponseProjection id() {
        return id(null);
    }

    public ChannelGroupResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ChannelGroupResponseProjection name() {
        return name(null);
    }

    public ChannelGroupResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ChannelGroupResponseProjection sortNumber() {
        return sortNumber(null);
    }

    public ChannelGroupResponseProjection sortNumber(String alias) {
        add$(new GraphQLResponseField("sortNumber").alias(alias));
        return this;
    }

    public ChannelGroupResponseProjection typename() {
        return typename(null);
    }

    public ChannelGroupResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ChannelGroupResponseProjection deepCopy$() {
        return new ChannelGroupResponseProjection(this);
    }


}
