package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Episode
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:01+0900"
)
public class EpisodeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EpisodeResponseProjection() {
    }

    public EpisodeResponseProjection(EpisodeResponseProjection projection) {
        super(projection);
    }

    public EpisodeResponseProjection(List<EpisodeResponseProjection> projections) {
        super(projections);
    }

    public EpisodeResponseProjection all$() {
        return all$(3);
    }

    public EpisodeResponseProjection all$(int maxDepth) {
        this.annictId();
        this.id();
        if (projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.EpisodeResponseProjection.nextEpisode", 0) <= maxDepth) {
            projectionDepthOnFields.put("EpisodeResponseProjection.EpisodeResponseProjection.nextEpisode", projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.EpisodeResponseProjection.nextEpisode", 0) + 1);
            this.nextEpisode(new EpisodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.EpisodeResponseProjection.nextEpisode", 0)));
        }
        this.number();
        this.numberText();
        if (projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.EpisodeResponseProjection.prevEpisode", 0) <= maxDepth) {
            projectionDepthOnFields.put("EpisodeResponseProjection.EpisodeResponseProjection.prevEpisode", projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.EpisodeResponseProjection.prevEpisode", 0) + 1);
            this.prevEpisode(new EpisodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.EpisodeResponseProjection.prevEpisode", 0)));
        }
        this.recordCommentsCount();
        if (projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.RecordConnectionResponseProjection.records", 0) <= maxDepth) {
            projectionDepthOnFields.put("EpisodeResponseProjection.RecordConnectionResponseProjection.records", projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.RecordConnectionResponseProjection.records", 0) + 1);
            this.records(new RecordConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.RecordConnectionResponseProjection.records", 0)));
        }
        this.recordsCount();
        this.satisfactionRate();
        this.sortNumber();
        this.title();
        this.viewerDidTrack();
        this.viewerRecordsCount();
        if (projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("EpisodeResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EpisodeResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public EpisodeResponseProjection annictId() {
        return annictId(null);
    }

    public EpisodeResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public EpisodeResponseProjection id() {
        return id(null);
    }

    public EpisodeResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EpisodeResponseProjection nextEpisode(EpisodeResponseProjection subProjection) {
        return nextEpisode(null, subProjection);
    }

    public EpisodeResponseProjection nextEpisode(String alias, EpisodeResponseProjection subProjection) {
        add$(new GraphQLResponseField("nextEpisode").alias(alias).projection(subProjection));
        return this;
    }

    public EpisodeResponseProjection number() {
        return number(null);
    }

    public EpisodeResponseProjection number(String alias) {
        add$(new GraphQLResponseField("number").alias(alias));
        return this;
    }

    public EpisodeResponseProjection numberText() {
        return numberText(null);
    }

    public EpisodeResponseProjection numberText(String alias) {
        add$(new GraphQLResponseField("numberText").alias(alias));
        return this;
    }

    public EpisodeResponseProjection prevEpisode(EpisodeResponseProjection subProjection) {
        return prevEpisode(null, subProjection);
    }

    public EpisodeResponseProjection prevEpisode(String alias, EpisodeResponseProjection subProjection) {
        add$(new GraphQLResponseField("prevEpisode").alias(alias).projection(subProjection));
        return this;
    }

    public EpisodeResponseProjection recordCommentsCount() {
        return recordCommentsCount(null);
    }

    public EpisodeResponseProjection recordCommentsCount(String alias) {
        add$(new GraphQLResponseField("recordCommentsCount").alias(alias));
        return this;
    }

    public EpisodeResponseProjection records(RecordConnectionResponseProjection subProjection) {
        return records((String)null, subProjection);
    }

    public EpisodeResponseProjection records(String alias, RecordConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("records").alias(alias).projection(subProjection));
        return this;
    }

    public EpisodeResponseProjection records(EpisodeRecordsParametrizedInput input, RecordConnectionResponseProjection subProjection) {
        return records(null, input, subProjection);
    }

    public EpisodeResponseProjection records(String alias, EpisodeRecordsParametrizedInput input, RecordConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("records").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public EpisodeResponseProjection recordsCount() {
        return recordsCount(null);
    }

    public EpisodeResponseProjection recordsCount(String alias) {
        add$(new GraphQLResponseField("recordsCount").alias(alias));
        return this;
    }

    public EpisodeResponseProjection satisfactionRate() {
        return satisfactionRate(null);
    }

    public EpisodeResponseProjection satisfactionRate(String alias) {
        add$(new GraphQLResponseField("satisfactionRate").alias(alias));
        return this;
    }

    public EpisodeResponseProjection sortNumber() {
        return sortNumber(null);
    }

    public EpisodeResponseProjection sortNumber(String alias) {
        add$(new GraphQLResponseField("sortNumber").alias(alias));
        return this;
    }

    public EpisodeResponseProjection title() {
        return title(null);
    }

    public EpisodeResponseProjection title(String alias) {
        add$(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public EpisodeResponseProjection viewerDidTrack() {
        return viewerDidTrack(null);
    }

    public EpisodeResponseProjection viewerDidTrack(String alias) {
        add$(new GraphQLResponseField("viewerDidTrack").alias(alias));
        return this;
    }

    public EpisodeResponseProjection viewerRecordsCount() {
        return viewerRecordsCount(null);
    }

    public EpisodeResponseProjection viewerRecordsCount(String alias) {
        add$(new GraphQLResponseField("viewerRecordsCount").alias(alias));
        return this;
    }

    public EpisodeResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public EpisodeResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public EpisodeResponseProjection typename() {
        return typename(null);
    }

    public EpisodeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public EpisodeResponseProjection deepCopy$() {
        return new EpisodeResponseProjection(this);
    }


}
