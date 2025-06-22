package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * An anime title
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:00+0900"
)
public class Work implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    private int episodesCount;
    @jakarta.validation.constraints.NotNull
    private String id;
    private WorkImage image;
    private String malAnimeId;
    @jakarta.validation.constraints.NotNull
    private Media media;
    private boolean noEpisodes;
    private String officialSiteUrl;
    private String officialSiteUrlEn;
    private int reviewsCount;
    private Double satisfactionRate;
    private SeasonName seasonName;
    private Integer seasonYear;
    private Integer syobocalTid;
    @jakarta.validation.constraints.NotNull
    private String title;
    private String titleEn;
    private String titleKana;
    private String titleRo;
    private String twitterHashtag;
    private String twitterUsername;
    private StatusState viewerStatusState;
    private int watchersCount;
    private String wikipediaUrl;
    private String wikipediaUrlEn;

    public Work() {
    }

    public Work(int annictId, int episodesCount, String id, WorkImage image, String malAnimeId, Media media, boolean noEpisodes, String officialSiteUrl, String officialSiteUrlEn, int reviewsCount, Double satisfactionRate, SeasonName seasonName, Integer seasonYear, Integer syobocalTid, String title, String titleEn, String titleKana, String titleRo, String twitterHashtag, String twitterUsername, StatusState viewerStatusState, int watchersCount, String wikipediaUrl, String wikipediaUrlEn) {
        this.annictId = annictId;
        this.episodesCount = episodesCount;
        this.id = id;
        this.image = image;
        this.malAnimeId = malAnimeId;
        this.media = media;
        this.noEpisodes = noEpisodes;
        this.officialSiteUrl = officialSiteUrl;
        this.officialSiteUrlEn = officialSiteUrlEn;
        this.reviewsCount = reviewsCount;
        this.satisfactionRate = satisfactionRate;
        this.seasonName = seasonName;
        this.seasonYear = seasonYear;
        this.syobocalTid = syobocalTid;
        this.title = title;
        this.titleEn = titleEn;
        this.titleKana = titleKana;
        this.titleRo = titleRo;
        this.twitterHashtag = twitterHashtag;
        this.twitterUsername = twitterUsername;
        this.viewerStatusState = viewerStatusState;
        this.watchersCount = watchersCount;
        this.wikipediaUrl = wikipediaUrl;
        this.wikipediaUrlEn = wikipediaUrlEn;
    }

    public int getAnnictId() {
        return annictId;
    }
    public void setAnnictId(int annictId) {
        this.annictId = annictId;
    }

    public int getEpisodesCount() {
        return episodesCount;
    }
    public void setEpisodesCount(int episodesCount) {
        this.episodesCount = episodesCount;
    }

    /**
     * ID of the object.
     */
    public String getId() {
        return id;
    }
    /**
     * ID of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public WorkImage getImage() {
        return image;
    }
    public void setImage(WorkImage image) {
        this.image = image;
    }

    public String getMalAnimeId() {
        return malAnimeId;
    }
    public void setMalAnimeId(String malAnimeId) {
        this.malAnimeId = malAnimeId;
    }

    public Media getMedia() {
        return media;
    }
    public void setMedia(Media media) {
        this.media = media;
    }

    public boolean getNoEpisodes() {
        return noEpisodes;
    }
    public void setNoEpisodes(boolean noEpisodes) {
        this.noEpisodes = noEpisodes;
    }

    public String getOfficialSiteUrl() {
        return officialSiteUrl;
    }
    public void setOfficialSiteUrl(String officialSiteUrl) {
        this.officialSiteUrl = officialSiteUrl;
    }

    public String getOfficialSiteUrlEn() {
        return officialSiteUrlEn;
    }
    public void setOfficialSiteUrlEn(String officialSiteUrlEn) {
        this.officialSiteUrlEn = officialSiteUrlEn;
    }

    public int getReviewsCount() {
        return reviewsCount;
    }
    public void setReviewsCount(int reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public Double getSatisfactionRate() {
        return satisfactionRate;
    }
    public void setSatisfactionRate(Double satisfactionRate) {
        this.satisfactionRate = satisfactionRate;
    }

    public SeasonName getSeasonName() {
        return seasonName;
    }
    public void setSeasonName(SeasonName seasonName) {
        this.seasonName = seasonName;
    }

    public Integer getSeasonYear() {
        return seasonYear;
    }
    public void setSeasonYear(Integer seasonYear) {
        this.seasonYear = seasonYear;
    }

    public Integer getSyobocalTid() {
        return syobocalTid;
    }
    public void setSyobocalTid(Integer syobocalTid) {
        this.syobocalTid = syobocalTid;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleEn() {
        return titleEn;
    }
    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getTitleKana() {
        return titleKana;
    }
    public void setTitleKana(String titleKana) {
        this.titleKana = titleKana;
    }

    public String getTitleRo() {
        return titleRo;
    }
    public void setTitleRo(String titleRo) {
        this.titleRo = titleRo;
    }

    public String getTwitterHashtag() {
        return twitterHashtag;
    }
    public void setTwitterHashtag(String twitterHashtag) {
        this.twitterHashtag = twitterHashtag;
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }
    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public StatusState getViewerStatusState() {
        return viewerStatusState;
    }
    public void setViewerStatusState(StatusState viewerStatusState) {
        this.viewerStatusState = viewerStatusState;
    }

    public int getWatchersCount() {
        return watchersCount;
    }
    public void setWatchersCount(int watchersCount) {
        this.watchersCount = watchersCount;
    }

    public String getWikipediaUrl() {
        return wikipediaUrl;
    }
    public void setWikipediaUrl(String wikipediaUrl) {
        this.wikipediaUrl = wikipediaUrl;
    }

    public String getWikipediaUrlEn() {
        return wikipediaUrlEn;
    }
    public void setWikipediaUrlEn(String wikipediaUrlEn) {
        this.wikipediaUrlEn = wikipediaUrlEn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("annictId: " + GraphQLRequestSerializer.getEntry(annictId));
        joiner.add("episodesCount: " + GraphQLRequestSerializer.getEntry(episodesCount));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (image != null) {
            joiner.add("image: " + GraphQLRequestSerializer.getEntry(image));
        }
        if (malAnimeId != null) {
            joiner.add("malAnimeId: " + GraphQLRequestSerializer.getEntry(malAnimeId));
        }
        if (media != null) {
            joiner.add("media: " + GraphQLRequestSerializer.getEntry(media));
        }
        joiner.add("noEpisodes: " + GraphQLRequestSerializer.getEntry(noEpisodes));
        if (officialSiteUrl != null) {
            joiner.add("officialSiteUrl: " + GraphQLRequestSerializer.getEntry(officialSiteUrl));
        }
        if (officialSiteUrlEn != null) {
            joiner.add("officialSiteUrlEn: " + GraphQLRequestSerializer.getEntry(officialSiteUrlEn));
        }
        joiner.add("reviewsCount: " + GraphQLRequestSerializer.getEntry(reviewsCount));
        if (satisfactionRate != null) {
            joiner.add("satisfactionRate: " + GraphQLRequestSerializer.getEntry(satisfactionRate));
        }
        if (seasonName != null) {
            joiner.add("seasonName: " + GraphQLRequestSerializer.getEntry(seasonName));
        }
        if (seasonYear != null) {
            joiner.add("seasonYear: " + GraphQLRequestSerializer.getEntry(seasonYear));
        }
        if (syobocalTid != null) {
            joiner.add("syobocalTid: " + GraphQLRequestSerializer.getEntry(syobocalTid));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (titleEn != null) {
            joiner.add("titleEn: " + GraphQLRequestSerializer.getEntry(titleEn));
        }
        if (titleKana != null) {
            joiner.add("titleKana: " + GraphQLRequestSerializer.getEntry(titleKana));
        }
        if (titleRo != null) {
            joiner.add("titleRo: " + GraphQLRequestSerializer.getEntry(titleRo));
        }
        if (twitterHashtag != null) {
            joiner.add("twitterHashtag: " + GraphQLRequestSerializer.getEntry(twitterHashtag));
        }
        if (twitterUsername != null) {
            joiner.add("twitterUsername: " + GraphQLRequestSerializer.getEntry(twitterUsername));
        }
        if (viewerStatusState != null) {
            joiner.add("viewerStatusState: " + GraphQLRequestSerializer.getEntry(viewerStatusState));
        }
        joiner.add("watchersCount: " + GraphQLRequestSerializer.getEntry(watchersCount));
        if (wikipediaUrl != null) {
            joiner.add("wikipediaUrl: " + GraphQLRequestSerializer.getEntry(wikipediaUrl));
        }
        if (wikipediaUrlEn != null) {
            joiner.add("wikipediaUrlEn: " + GraphQLRequestSerializer.getEntry(wikipediaUrlEn));
        }
        return joiner.toString();
    }

    public static Work.Builder builder() {
        return new Work.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T12:59:00+0900"
    )
    public static class Builder {

        private int annictId;
        private int episodesCount;
        private String id;
        private WorkImage image;
        private String malAnimeId;
        private Media media;
        private boolean noEpisodes;
        private String officialSiteUrl;
        private String officialSiteUrlEn;
        private int reviewsCount;
        private Double satisfactionRate;
        private SeasonName seasonName;
        private Integer seasonYear;
        private Integer syobocalTid;
        private String title;
        private String titleEn;
        private String titleKana;
        private String titleRo;
        private String twitterHashtag;
        private String twitterUsername;
        private StatusState viewerStatusState;
        private int watchersCount;
        private String wikipediaUrl;
        private String wikipediaUrlEn;

        public Builder() {
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        public Builder setEpisodesCount(int episodesCount) {
            this.episodesCount = episodesCount;
            return this;
        }

        /**
         * ID of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setImage(WorkImage image) {
            this.image = image;
            return this;
        }

        public Builder setMalAnimeId(String malAnimeId) {
            this.malAnimeId = malAnimeId;
            return this;
        }

        public Builder setMedia(Media media) {
            this.media = media;
            return this;
        }

        public Builder setNoEpisodes(boolean noEpisodes) {
            this.noEpisodes = noEpisodes;
            return this;
        }

        public Builder setOfficialSiteUrl(String officialSiteUrl) {
            this.officialSiteUrl = officialSiteUrl;
            return this;
        }

        public Builder setOfficialSiteUrlEn(String officialSiteUrlEn) {
            this.officialSiteUrlEn = officialSiteUrlEn;
            return this;
        }

        public Builder setReviewsCount(int reviewsCount) {
            this.reviewsCount = reviewsCount;
            return this;
        }

        public Builder setSatisfactionRate(Double satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }

        public Builder setSeasonName(SeasonName seasonName) {
            this.seasonName = seasonName;
            return this;
        }

        public Builder setSeasonYear(Integer seasonYear) {
            this.seasonYear = seasonYear;
            return this;
        }

        public Builder setSyobocalTid(Integer syobocalTid) {
            this.syobocalTid = syobocalTid;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setTitleEn(String titleEn) {
            this.titleEn = titleEn;
            return this;
        }

        public Builder setTitleKana(String titleKana) {
            this.titleKana = titleKana;
            return this;
        }

        public Builder setTitleRo(String titleRo) {
            this.titleRo = titleRo;
            return this;
        }

        public Builder setTwitterHashtag(String twitterHashtag) {
            this.twitterHashtag = twitterHashtag;
            return this;
        }

        public Builder setTwitterUsername(String twitterUsername) {
            this.twitterUsername = twitterUsername;
            return this;
        }

        public Builder setViewerStatusState(StatusState viewerStatusState) {
            this.viewerStatusState = viewerStatusState;
            return this;
        }

        public Builder setWatchersCount(int watchersCount) {
            this.watchersCount = watchersCount;
            return this;
        }

        public Builder setWikipediaUrl(String wikipediaUrl) {
            this.wikipediaUrl = wikipediaUrl;
            return this;
        }

        public Builder setWikipediaUrlEn(String wikipediaUrlEn) {
            this.wikipediaUrlEn = wikipediaUrlEn;
            return this;
        }


        public Work build() {
            return new Work(annictId, episodesCount, id, image, malAnimeId, media, noEpisodes, officialSiteUrl, officialSiteUrlEn, reviewsCount, satisfactionRate, seasonName, seasonYear, syobocalTid, title, titleEn, titleKana, titleRo, twitterHashtag, twitterUsername, viewerStatusState, watchersCount, wikipediaUrl, wikipediaUrlEn);
        }

    }
}
