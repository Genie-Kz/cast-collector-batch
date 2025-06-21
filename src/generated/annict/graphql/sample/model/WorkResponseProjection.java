package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Work
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class WorkResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkResponseProjection() {
    }

    public WorkResponseProjection(WorkResponseProjection projection) {
        super(projection);
    }

    public WorkResponseProjection(List<WorkResponseProjection> projections) {
        super(projections);
    }

    public WorkResponseProjection all$() {
        return all$(3);
    }

    public WorkResponseProjection all$(int maxDepth) {
        this.annictId();
        if (projectionDepthOnFields.getOrDefault("WorkResponseProjection.CastConnectionResponseProjection.casts", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkResponseProjection.CastConnectionResponseProjection.casts", projectionDepthOnFields.getOrDefault("WorkResponseProjection.CastConnectionResponseProjection.casts", 0) + 1);
            this.casts(new CastConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkResponseProjection.CastConnectionResponseProjection.casts", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkResponseProjection.EpisodeConnectionResponseProjection.episodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkResponseProjection.EpisodeConnectionResponseProjection.episodes", projectionDepthOnFields.getOrDefault("WorkResponseProjection.EpisodeConnectionResponseProjection.episodes", 0) + 1);
            this.episodes(new EpisodeConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkResponseProjection.EpisodeConnectionResponseProjection.episodes", 0)));
        }
        this.episodesCount();
        this.id();
        if (projectionDepthOnFields.getOrDefault("WorkResponseProjection.WorkImageResponseProjection.image", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkResponseProjection.WorkImageResponseProjection.image", projectionDepthOnFields.getOrDefault("WorkResponseProjection.WorkImageResponseProjection.image", 0) + 1);
            this.image(new WorkImageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkResponseProjection.WorkImageResponseProjection.image", 0)));
        }
        this.malAnimeId();
        this.media();
        this.noEpisodes();
        this.officialSiteUrl();
        this.officialSiteUrlEn();
        if (projectionDepthOnFields.getOrDefault("WorkResponseProjection.ProgramConnectionResponseProjection.programs", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkResponseProjection.ProgramConnectionResponseProjection.programs", projectionDepthOnFields.getOrDefault("WorkResponseProjection.ProgramConnectionResponseProjection.programs", 0) + 1);
            this.programs(new ProgramConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkResponseProjection.ProgramConnectionResponseProjection.programs", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkResponseProjection.ReviewConnectionResponseProjection.reviews", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkResponseProjection.ReviewConnectionResponseProjection.reviews", projectionDepthOnFields.getOrDefault("WorkResponseProjection.ReviewConnectionResponseProjection.reviews", 0) + 1);
            this.reviews(new ReviewConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkResponseProjection.ReviewConnectionResponseProjection.reviews", 0)));
        }
        this.reviewsCount();
        this.satisfactionRate();
        this.seasonName();
        this.seasonYear();
        if (projectionDepthOnFields.getOrDefault("WorkResponseProjection.SeriesConnectionResponseProjection.seriesList", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkResponseProjection.SeriesConnectionResponseProjection.seriesList", projectionDepthOnFields.getOrDefault("WorkResponseProjection.SeriesConnectionResponseProjection.seriesList", 0) + 1);
            this.seriesList(new SeriesConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkResponseProjection.SeriesConnectionResponseProjection.seriesList", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkResponseProjection.StaffConnectionResponseProjection.staffs", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkResponseProjection.StaffConnectionResponseProjection.staffs", projectionDepthOnFields.getOrDefault("WorkResponseProjection.StaffConnectionResponseProjection.staffs", 0) + 1);
            this.staffs(new StaffConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkResponseProjection.StaffConnectionResponseProjection.staffs", 0)));
        }
        this.syobocalTid();
        this.title();
        this.titleEn();
        this.titleKana();
        this.titleRo();
        this.twitterHashtag();
        this.twitterUsername();
        this.viewerStatusState();
        this.watchersCount();
        this.wikipediaUrl();
        this.wikipediaUrlEn();
        this.typename();
        return this;
    }

    public WorkResponseProjection annictId() {
        return annictId(null);
    }

    public WorkResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public WorkResponseProjection casts(CastConnectionResponseProjection subProjection) {
        return casts((String)null, subProjection);
    }

    public WorkResponseProjection casts(String alias, CastConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("casts").alias(alias).projection(subProjection));
        return this;
    }

    public WorkResponseProjection casts(WorkCastsParametrizedInput input, CastConnectionResponseProjection subProjection) {
        return casts(null, input, subProjection);
    }

    public WorkResponseProjection casts(String alias, WorkCastsParametrizedInput input, CastConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("casts").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public WorkResponseProjection episodes(EpisodeConnectionResponseProjection subProjection) {
        return episodes((String)null, subProjection);
    }

    public WorkResponseProjection episodes(String alias, EpisodeConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("episodes").alias(alias).projection(subProjection));
        return this;
    }

    public WorkResponseProjection episodes(WorkEpisodesParametrizedInput input, EpisodeConnectionResponseProjection subProjection) {
        return episodes(null, input, subProjection);
    }

    public WorkResponseProjection episodes(String alias, WorkEpisodesParametrizedInput input, EpisodeConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("episodes").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public WorkResponseProjection episodesCount() {
        return episodesCount(null);
    }

    public WorkResponseProjection episodesCount(String alias) {
        add$(new GraphQLResponseField("episodesCount").alias(alias));
        return this;
    }

    public WorkResponseProjection id() {
        return id(null);
    }

    public WorkResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public WorkResponseProjection image(WorkImageResponseProjection subProjection) {
        return image(null, subProjection);
    }

    public WorkResponseProjection image(String alias, WorkImageResponseProjection subProjection) {
        add$(new GraphQLResponseField("image").alias(alias).projection(subProjection));
        return this;
    }

    public WorkResponseProjection malAnimeId() {
        return malAnimeId(null);
    }

    public WorkResponseProjection malAnimeId(String alias) {
        add$(new GraphQLResponseField("malAnimeId").alias(alias));
        return this;
    }

    public WorkResponseProjection media() {
        return media(null);
    }

    public WorkResponseProjection media(String alias) {
        add$(new GraphQLResponseField("media").alias(alias));
        return this;
    }

    public WorkResponseProjection noEpisodes() {
        return noEpisodes(null);
    }

    public WorkResponseProjection noEpisodes(String alias) {
        add$(new GraphQLResponseField("noEpisodes").alias(alias));
        return this;
    }

    public WorkResponseProjection officialSiteUrl() {
        return officialSiteUrl(null);
    }

    public WorkResponseProjection officialSiteUrl(String alias) {
        add$(new GraphQLResponseField("officialSiteUrl").alias(alias));
        return this;
    }

    public WorkResponseProjection officialSiteUrlEn() {
        return officialSiteUrlEn(null);
    }

    public WorkResponseProjection officialSiteUrlEn(String alias) {
        add$(new GraphQLResponseField("officialSiteUrlEn").alias(alias));
        return this;
    }

    public WorkResponseProjection programs(ProgramConnectionResponseProjection subProjection) {
        return programs((String)null, subProjection);
    }

    public WorkResponseProjection programs(String alias, ProgramConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("programs").alias(alias).projection(subProjection));
        return this;
    }

    public WorkResponseProjection programs(WorkProgramsParametrizedInput input, ProgramConnectionResponseProjection subProjection) {
        return programs(null, input, subProjection);
    }

    public WorkResponseProjection programs(String alias, WorkProgramsParametrizedInput input, ProgramConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("programs").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public WorkResponseProjection reviews(ReviewConnectionResponseProjection subProjection) {
        return reviews((String)null, subProjection);
    }

    public WorkResponseProjection reviews(String alias, ReviewConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("reviews").alias(alias).projection(subProjection));
        return this;
    }

    public WorkResponseProjection reviews(WorkReviewsParametrizedInput input, ReviewConnectionResponseProjection subProjection) {
        return reviews(null, input, subProjection);
    }

    public WorkResponseProjection reviews(String alias, WorkReviewsParametrizedInput input, ReviewConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("reviews").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public WorkResponseProjection reviewsCount() {
        return reviewsCount(null);
    }

    public WorkResponseProjection reviewsCount(String alias) {
        add$(new GraphQLResponseField("reviewsCount").alias(alias));
        return this;
    }

    public WorkResponseProjection satisfactionRate() {
        return satisfactionRate(null);
    }

    public WorkResponseProjection satisfactionRate(String alias) {
        add$(new GraphQLResponseField("satisfactionRate").alias(alias));
        return this;
    }

    public WorkResponseProjection seasonName() {
        return seasonName(null);
    }

    public WorkResponseProjection seasonName(String alias) {
        add$(new GraphQLResponseField("seasonName").alias(alias));
        return this;
    }

    public WorkResponseProjection seasonYear() {
        return seasonYear(null);
    }

    public WorkResponseProjection seasonYear(String alias) {
        add$(new GraphQLResponseField("seasonYear").alias(alias));
        return this;
    }

    public WorkResponseProjection seriesList(SeriesConnectionResponseProjection subProjection) {
        return seriesList((String)null, subProjection);
    }

    public WorkResponseProjection seriesList(String alias, SeriesConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("seriesList").alias(alias).projection(subProjection));
        return this;
    }

    public WorkResponseProjection seriesList(WorkSeriesListParametrizedInput input, SeriesConnectionResponseProjection subProjection) {
        return seriesList(null, input, subProjection);
    }

    public WorkResponseProjection seriesList(String alias, WorkSeriesListParametrizedInput input, SeriesConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("seriesList").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public WorkResponseProjection staffs(StaffConnectionResponseProjection subProjection) {
        return staffs((String)null, subProjection);
    }

    public WorkResponseProjection staffs(String alias, StaffConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("staffs").alias(alias).projection(subProjection));
        return this;
    }

    public WorkResponseProjection staffs(WorkStaffsParametrizedInput input, StaffConnectionResponseProjection subProjection) {
        return staffs(null, input, subProjection);
    }

    public WorkResponseProjection staffs(String alias, WorkStaffsParametrizedInput input, StaffConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("staffs").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public WorkResponseProjection syobocalTid() {
        return syobocalTid(null);
    }

    public WorkResponseProjection syobocalTid(String alias) {
        add$(new GraphQLResponseField("syobocalTid").alias(alias));
        return this;
    }

    public WorkResponseProjection title() {
        return title(null);
    }

    public WorkResponseProjection title(String alias) {
        add$(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public WorkResponseProjection titleEn() {
        return titleEn(null);
    }

    public WorkResponseProjection titleEn(String alias) {
        add$(new GraphQLResponseField("titleEn").alias(alias));
        return this;
    }

    public WorkResponseProjection titleKana() {
        return titleKana(null);
    }

    public WorkResponseProjection titleKana(String alias) {
        add$(new GraphQLResponseField("titleKana").alias(alias));
        return this;
    }

    public WorkResponseProjection titleRo() {
        return titleRo(null);
    }

    public WorkResponseProjection titleRo(String alias) {
        add$(new GraphQLResponseField("titleRo").alias(alias));
        return this;
    }

    public WorkResponseProjection twitterHashtag() {
        return twitterHashtag(null);
    }

    public WorkResponseProjection twitterHashtag(String alias) {
        add$(new GraphQLResponseField("twitterHashtag").alias(alias));
        return this;
    }

    public WorkResponseProjection twitterUsername() {
        return twitterUsername(null);
    }

    public WorkResponseProjection twitterUsername(String alias) {
        add$(new GraphQLResponseField("twitterUsername").alias(alias));
        return this;
    }

    public WorkResponseProjection viewerStatusState() {
        return viewerStatusState(null);
    }

    public WorkResponseProjection viewerStatusState(String alias) {
        add$(new GraphQLResponseField("viewerStatusState").alias(alias));
        return this;
    }

    public WorkResponseProjection watchersCount() {
        return watchersCount(null);
    }

    public WorkResponseProjection watchersCount(String alias) {
        add$(new GraphQLResponseField("watchersCount").alias(alias));
        return this;
    }

    public WorkResponseProjection wikipediaUrl() {
        return wikipediaUrl(null);
    }

    public WorkResponseProjection wikipediaUrl(String alias) {
        add$(new GraphQLResponseField("wikipediaUrl").alias(alias));
        return this;
    }

    public WorkResponseProjection wikipediaUrlEn() {
        return wikipediaUrlEn(null);
    }

    public WorkResponseProjection wikipediaUrlEn(String alias) {
        add$(new GraphQLResponseField("wikipediaUrlEn").alias(alias));
        return this;
    }

    public WorkResponseProjection typename() {
        return typename(null);
    }

    public WorkResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public WorkResponseProjection deepCopy$() {
        return new WorkResponseProjection(this);
    }


}
