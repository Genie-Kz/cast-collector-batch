package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

public class Record implements java.io.Serializable, ActivityItem, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    private String comment;
    private int commentsCount;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime createdAt;
    @jakarta.validation.constraints.NotNull
    private Episode episode;
    private int facebookClickCount;
    @jakarta.validation.constraints.NotNull
    private String id;
    private int likesCount;
    private boolean modified;
    private Double rating;
    private RatingState ratingState;
    private int twitterClickCount;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime updatedAt;
    @jakarta.validation.constraints.NotNull
    private User user;
    @jakarta.validation.constraints.NotNull
    private Work work;

    public Record() {
    }

    public Record(int annictId, String comment, int commentsCount, java.time.OffsetDateTime createdAt, Episode episode, int facebookClickCount, String id, int likesCount, boolean modified, Double rating, RatingState ratingState, int twitterClickCount, java.time.OffsetDateTime updatedAt, User user, Work work) {
        this.annictId = annictId;
        this.comment = comment;
        this.commentsCount = commentsCount;
        this.createdAt = createdAt;
        this.episode = episode;
        this.facebookClickCount = facebookClickCount;
        this.id = id;
        this.likesCount = likesCount;
        this.modified = modified;
        this.rating = rating;
        this.ratingState = ratingState;
        this.twitterClickCount = twitterClickCount;
        this.updatedAt = updatedAt;
        this.user = user;
        this.work = work;
    }

    public int getAnnictId() {
        return annictId;
    }
    public void setAnnictId(int annictId) {
        this.annictId = annictId;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getCommentsCount() {
        return commentsCount;
    }
    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public java.time.OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Episode getEpisode() {
        return episode;
    }
    public void setEpisode(Episode episode) {
        this.episode = episode;
    }

    public int getFacebookClickCount() {
        return facebookClickCount;
    }
    public void setFacebookClickCount(int facebookClickCount) {
        this.facebookClickCount = facebookClickCount;
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

    public int getLikesCount() {
        return likesCount;
    }
    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public boolean getModified() {
        return modified;
    }
    public void setModified(boolean modified) {
        this.modified = modified;
    }

    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }

    public RatingState getRatingState() {
        return ratingState;
    }
    public void setRatingState(RatingState ratingState) {
        this.ratingState = ratingState;
    }

    public int getTwitterClickCount() {
        return twitterClickCount;
    }
    public void setTwitterClickCount(int twitterClickCount) {
        this.twitterClickCount = twitterClickCount;
    }

    public java.time.OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.time.OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
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
        joiner.add("annictId: " + GraphQLRequestSerializer.getEntry(annictId));
        if (comment != null) {
            joiner.add("comment: " + GraphQLRequestSerializer.getEntry(comment));
        }
        joiner.add("commentsCount: " + GraphQLRequestSerializer.getEntry(commentsCount));
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (episode != null) {
            joiner.add("episode: " + GraphQLRequestSerializer.getEntry(episode));
        }
        joiner.add("facebookClickCount: " + GraphQLRequestSerializer.getEntry(facebookClickCount));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("likesCount: " + GraphQLRequestSerializer.getEntry(likesCount));
        joiner.add("modified: " + GraphQLRequestSerializer.getEntry(modified));
        if (rating != null) {
            joiner.add("rating: " + GraphQLRequestSerializer.getEntry(rating));
        }
        if (ratingState != null) {
            joiner.add("ratingState: " + GraphQLRequestSerializer.getEntry(ratingState));
        }
        joiner.add("twitterClickCount: " + GraphQLRequestSerializer.getEntry(twitterClickCount));
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        if (work != null) {
            joiner.add("work: " + GraphQLRequestSerializer.getEntry(work));
        }
        return joiner.toString();
    }

    public static Record.Builder builder() {
        return new Record.Builder();
    }

    public static class Builder {

        private int annictId;
        private String comment;
        private int commentsCount;
        private java.time.OffsetDateTime createdAt;
        private Episode episode;
        private int facebookClickCount;
        private String id;
        private int likesCount;
        private boolean modified;
        private Double rating;
        private RatingState ratingState;
        private int twitterClickCount;
        private java.time.OffsetDateTime updatedAt;
        private User user;
        private Work work;

        public Builder() {
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setCommentsCount(int commentsCount) {
            this.commentsCount = commentsCount;
            return this;
        }

        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setEpisode(Episode episode) {
            this.episode = episode;
            return this;
        }

        public Builder setFacebookClickCount(int facebookClickCount) {
            this.facebookClickCount = facebookClickCount;
            return this;
        }

        /**
         * ID of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLikesCount(int likesCount) {
            this.likesCount = likesCount;
            return this;
        }

        public Builder setModified(boolean modified) {
            this.modified = modified;
            return this;
        }

        public Builder setRating(Double rating) {
            this.rating = rating;
            return this;
        }

        public Builder setRatingState(RatingState ratingState) {
            this.ratingState = ratingState;
            return this;
        }

        public Builder setTwitterClickCount(int twitterClickCount) {
            this.twitterClickCount = twitterClickCount;
            return this;
        }

        public Builder setUpdatedAt(java.time.OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setWork(Work work) {
            this.work = work;
            return this;
        }


        public Record build() {
            return new Record(annictId, comment, commentsCount, createdAt, episode, facebookClickCount, id, likesCount, modified, rating, ratingState, twitterClickCount, updatedAt, user, work);
        }

    }
}
