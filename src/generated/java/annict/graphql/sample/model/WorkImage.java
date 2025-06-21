package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class WorkImage implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    private Integer annictId;
    private String copyright;
    private String facebookOgImageUrl;
    @jakarta.validation.constraints.NotNull
    private String id;
    private String recommendedImageUrl;
    private String twitterAvatarUrl;
    private String twitterBiggerAvatarUrl;
    private String twitterMiniAvatarUrl;
    private String twitterNormalAvatarUrl;
    private Work work;

    public WorkImage() {
    }

    public WorkImage(Integer annictId, String copyright, String facebookOgImageUrl, String id, String recommendedImageUrl, String twitterAvatarUrl, String twitterBiggerAvatarUrl, String twitterMiniAvatarUrl, String twitterNormalAvatarUrl, Work work) {
        this.annictId = annictId;
        this.copyright = copyright;
        this.facebookOgImageUrl = facebookOgImageUrl;
        this.id = id;
        this.recommendedImageUrl = recommendedImageUrl;
        this.twitterAvatarUrl = twitterAvatarUrl;
        this.twitterBiggerAvatarUrl = twitterBiggerAvatarUrl;
        this.twitterMiniAvatarUrl = twitterMiniAvatarUrl;
        this.twitterNormalAvatarUrl = twitterNormalAvatarUrl;
        this.work = work;
    }

    public Integer getAnnictId() {
        return annictId;
    }
    public void setAnnictId(Integer annictId) {
        this.annictId = annictId;
    }

    public String getCopyright() {
        return copyright;
    }
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getFacebookOgImageUrl() {
        return facebookOgImageUrl;
    }
    public void setFacebookOgImageUrl(String facebookOgImageUrl) {
        this.facebookOgImageUrl = facebookOgImageUrl;
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

    public String getRecommendedImageUrl() {
        return recommendedImageUrl;
    }
    public void setRecommendedImageUrl(String recommendedImageUrl) {
        this.recommendedImageUrl = recommendedImageUrl;
    }

    public String getTwitterAvatarUrl() {
        return twitterAvatarUrl;
    }
    public void setTwitterAvatarUrl(String twitterAvatarUrl) {
        this.twitterAvatarUrl = twitterAvatarUrl;
    }

    public String getTwitterBiggerAvatarUrl() {
        return twitterBiggerAvatarUrl;
    }
    public void setTwitterBiggerAvatarUrl(String twitterBiggerAvatarUrl) {
        this.twitterBiggerAvatarUrl = twitterBiggerAvatarUrl;
    }

    public String getTwitterMiniAvatarUrl() {
        return twitterMiniAvatarUrl;
    }
    public void setTwitterMiniAvatarUrl(String twitterMiniAvatarUrl) {
        this.twitterMiniAvatarUrl = twitterMiniAvatarUrl;
    }

    public String getTwitterNormalAvatarUrl() {
        return twitterNormalAvatarUrl;
    }
    public void setTwitterNormalAvatarUrl(String twitterNormalAvatarUrl) {
        this.twitterNormalAvatarUrl = twitterNormalAvatarUrl;
    }

    public Work getWork() {
        return work;
    }
    public void setWork(Work work) {
        this.work = work;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (annictId != null) {
            joiner.add("annictId: " + GraphQLRequestSerializer.getEntry(annictId));
        }
        if (copyright != null) {
            joiner.add("copyright: " + GraphQLRequestSerializer.getEntry(copyright));
        }
        if (facebookOgImageUrl != null) {
            joiner.add("facebookOgImageUrl: " + GraphQLRequestSerializer.getEntry(facebookOgImageUrl));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (recommendedImageUrl != null) {
            joiner.add("recommendedImageUrl: " + GraphQLRequestSerializer.getEntry(recommendedImageUrl));
        }
        if (twitterAvatarUrl != null) {
            joiner.add("twitterAvatarUrl: " + GraphQLRequestSerializer.getEntry(twitterAvatarUrl));
        }
        if (twitterBiggerAvatarUrl != null) {
            joiner.add("twitterBiggerAvatarUrl: " + GraphQLRequestSerializer.getEntry(twitterBiggerAvatarUrl));
        }
        if (twitterMiniAvatarUrl != null) {
            joiner.add("twitterMiniAvatarUrl: " + GraphQLRequestSerializer.getEntry(twitterMiniAvatarUrl));
        }
        if (twitterNormalAvatarUrl != null) {
            joiner.add("twitterNormalAvatarUrl: " + GraphQLRequestSerializer.getEntry(twitterNormalAvatarUrl));
        }
        if (work != null) {
            joiner.add("work: " + GraphQLRequestSerializer.getEntry(work));
        }
        return joiner.toString();
    }

    public static WorkImage.Builder builder() {
        return new WorkImage.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T02:10:38+0900"
    )
    public static class Builder {

        private Integer annictId;
        private String copyright;
        private String facebookOgImageUrl;
        private String id;
        private String recommendedImageUrl;
        private String twitterAvatarUrl;
        private String twitterBiggerAvatarUrl;
        private String twitterMiniAvatarUrl;
        private String twitterNormalAvatarUrl;
        private Work work;

        public Builder() {
        }

        public Builder setAnnictId(Integer annictId) {
            this.annictId = annictId;
            return this;
        }

        public Builder setCopyright(String copyright) {
            this.copyright = copyright;
            return this;
        }

        public Builder setFacebookOgImageUrl(String facebookOgImageUrl) {
            this.facebookOgImageUrl = facebookOgImageUrl;
            return this;
        }

        /**
         * ID of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setRecommendedImageUrl(String recommendedImageUrl) {
            this.recommendedImageUrl = recommendedImageUrl;
            return this;
        }

        public Builder setTwitterAvatarUrl(String twitterAvatarUrl) {
            this.twitterAvatarUrl = twitterAvatarUrl;
            return this;
        }

        public Builder setTwitterBiggerAvatarUrl(String twitterBiggerAvatarUrl) {
            this.twitterBiggerAvatarUrl = twitterBiggerAvatarUrl;
            return this;
        }

        public Builder setTwitterMiniAvatarUrl(String twitterMiniAvatarUrl) {
            this.twitterMiniAvatarUrl = twitterMiniAvatarUrl;
            return this;
        }

        public Builder setTwitterNormalAvatarUrl(String twitterNormalAvatarUrl) {
            this.twitterNormalAvatarUrl = twitterNormalAvatarUrl;
            return this;
        }

        public Builder setWork(Work work) {
            this.work = work;
            return this;
        }


        public WorkImage build() {
            return new WorkImage(annictId, copyright, facebookOgImageUrl, id, recommendedImageUrl, twitterAvatarUrl, twitterBiggerAvatarUrl, twitterMiniAvatarUrl, twitterNormalAvatarUrl, work);
        }

    }
}
