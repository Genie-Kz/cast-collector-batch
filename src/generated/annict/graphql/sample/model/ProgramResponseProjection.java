package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Program
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class ProgramResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProgramResponseProjection() {
    }

    public ProgramResponseProjection(ProgramResponseProjection projection) {
        super(projection);
    }

    public ProgramResponseProjection(List<ProgramResponseProjection> projections) {
        super(projections);
    }

    public ProgramResponseProjection all$() {
        return all$(3);
    }

    public ProgramResponseProjection all$(int maxDepth) {
        this.annictId();
        if (projectionDepthOnFields.getOrDefault("ProgramResponseProjection.ChannelResponseProjection.channel", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProgramResponseProjection.ChannelResponseProjection.channel", projectionDepthOnFields.getOrDefault("ProgramResponseProjection.ChannelResponseProjection.channel", 0) + 1);
            this.channel(new ChannelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProgramResponseProjection.ChannelResponseProjection.channel", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProgramResponseProjection.EpisodeResponseProjection.episode", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProgramResponseProjection.EpisodeResponseProjection.episode", projectionDepthOnFields.getOrDefault("ProgramResponseProjection.EpisodeResponseProjection.episode", 0) + 1);
            this.episode(new EpisodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProgramResponseProjection.EpisodeResponseProjection.episode", 0)));
        }
        this.id();
        this.rebroadcast();
        this.scPid();
        this.startedAt();
        this.state();
        if (projectionDepthOnFields.getOrDefault("ProgramResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProgramResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("ProgramResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProgramResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public ProgramResponseProjection annictId() {
        return annictId(null);
    }

    public ProgramResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public ProgramResponseProjection channel(ChannelResponseProjection subProjection) {
        return channel(null, subProjection);
    }

    public ProgramResponseProjection channel(String alias, ChannelResponseProjection subProjection) {
        add$(new GraphQLResponseField("channel").alias(alias).projection(subProjection));
        return this;
    }

    public ProgramResponseProjection episode(EpisodeResponseProjection subProjection) {
        return episode(null, subProjection);
    }

    public ProgramResponseProjection episode(String alias, EpisodeResponseProjection subProjection) {
        add$(new GraphQLResponseField("episode").alias(alias).projection(subProjection));
        return this;
    }

    public ProgramResponseProjection id() {
        return id(null);
    }

    public ProgramResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProgramResponseProjection rebroadcast() {
        return rebroadcast(null);
    }

    public ProgramResponseProjection rebroadcast(String alias) {
        add$(new GraphQLResponseField("rebroadcast").alias(alias));
        return this;
    }

    public ProgramResponseProjection scPid() {
        return scPid(null);
    }

    public ProgramResponseProjection scPid(String alias) {
        add$(new GraphQLResponseField("scPid").alias(alias));
        return this;
    }

    public ProgramResponseProjection startedAt() {
        return startedAt(null);
    }

    public ProgramResponseProjection startedAt(String alias) {
        add$(new GraphQLResponseField("startedAt").alias(alias));
        return this;
    }

    public ProgramResponseProjection state() {
        return state(null);
    }

    public ProgramResponseProjection state(String alias) {
        add$(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public ProgramResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public ProgramResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public ProgramResponseProjection typename() {
        return typename(null);
    }

    public ProgramResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ProgramResponseProjection deepCopy$() {
        return new ProgramResponseProjection(this);
    }


}
