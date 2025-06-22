package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

public class Review implements java.io.Serializable, ActivityItem, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    @jakarta.validation.constraints.NotNull
    private String body;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime createdAt;
    @jakarta.validation.constraints.NotNull
    private String id;
    private int impressionsCount;
    private int likesCount;
    private java.time.OffsetDateTime modifiedAt;
    private RatingState ratingAnimationState;
    private RatingState ratingCharacterState;
    private RatingState ratingMusicState;
    private RatingState ratingOverallState;
    private RatingState ratingStoryState;
    private String title;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime updatedAt;
    @jakarta.validation.constraints.NotNull
    private User user;
    @jakarta.validation.constraints.NotNull
    private Work work;

    public Review() {
    }

    public Review(int annictId, String body, java.time.OffsetDateTime createdAt, String id, int impressionsCount, int likesCount, java.time.OffsetDateTime modifiedAt, RatingState ratingAnimationState, RatingState ratingCharacterState, RatingState ratingMusicState, RatingState ratingOverallState, RatingState ratingStoryState, String title, java.time.OffsetDateTime updatedAt, User user, Work work) {
        this.annictId = annictId;
        this.body = body;
        this.createdAt = createdAt;
        this.id = id;
        this.impressionsCount = impressionsCount;
        this.likesCount = likesCount;
        this.modifiedAt = modifiedAt;
        this.ratingAnimationState = ratingAnimationState;
        this.ratingCharacterState = ratingCharacterState;
        this.ratingMusicState = ratingMusicState;
        this.ratingOverallState = ratingOverallState;
        this.ratingStoryState = ratingStoryState;
        this.title = title;
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

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public java.time.OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.OffsetDateTime createdAt) {
        this.createdAt = createdAt;
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

    public int getImpressionsCount() {
        return impressionsCount;
    }
    public void setImpressionsCount(int impressionsCount) {
        this.impressionsCount = impressionsCount;
    }

    public int getLikesCount() {
        return likesCount;
    }
    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public java.time.OffsetDateTime getModifiedAt() {
        return modifiedAt;
    }
    public void setModifiedAt(java.time.OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public RatingState getRatingAnimationState() {
        return ratingAnimationState;
    }
    public void setRatingAnimationState(RatingState ratingAnimationState) {
        this.ratingAnimationState = ratingAnimationState;
    }

    public RatingState getRatingCharacterState() {
        return ratingCharacterState;
    }
    public void setRatingCharacterState(RatingState ratingCharacterState) {
        this.ratingCharacterState = ratingCharacterState;
    }

    public RatingState getRatingMusicState() {
        return ratingMusicState;
    }
    public void setRatingMusicState(RatingState ratingMusicState) {
        this.ratingMusicState = ratingMusicState;
    }

    public RatingState getRatingOverallState() {
        return ratingOverallState;
    }
    public void setRatingOverallState(RatingState ratingOverallState) {
        this.ratingOverallState = ratingOverallState;
    }

    public RatingState getRatingStoryState() {
        return ratingStoryState;
    }
    public void setRatingStoryState(RatingState ratingStoryState) {
        this.ratingStoryState = ratingStoryState;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("impressionsCount: " + GraphQLRequestSerializer.getEntry(impressionsCount));
        joiner.add("likesCount: " + GraphQLRequestSerializer.getEntry(likesCount));
        if (modifiedAt != null) {
            joiner.add("modifiedAt: " + GraphQLRequestSerializer.getEntry(modifiedAt));
        }
        if (ratingAnimationState != null) {
            joiner.add("ratingAnimationState: " + GraphQLRequestSerializer.getEntry(ratingAnimationState));
        }
        if (ratingCharacterState != null) {
            joiner.add("ratingCharacterState: " + GraphQLRequestSerializer.getEntry(ratingCharacterState));
        }
        if (ratingMusicState != null) {
            joiner.add("ratingMusicState: " + GraphQLRequestSerializer.getEntry(ratingMusicState));
        }
        if (ratingOverallState != null) {
            joiner.add("ratingOverallState: " + GraphQLRequestSerializer.getEntry(ratingOverallState));
        }
        if (ratingStoryState != null) {
            joiner.add("ratingStoryState: " + GraphQLRequestSerializer.getEntry(ratingStoryState));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
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

    public static Review.Builder builder() {
        return new Review.Builder();
    }

    public static class Builder {

        private int annictId;
        private String body;
        private java.time.OffsetDateTime createdAt;
        private String id;
        private int impressionsCount;
        private int likesCount;
        private java.time.OffsetDateTime modifiedAt;
        private RatingState ratingAnimationState;
        private RatingState ratingCharacterState;
        private RatingState ratingMusicState;
        private RatingState ratingOverallState;
        private RatingState ratingStoryState;
        private String title;
        private java.time.OffsetDateTime updatedAt;
        private User user;
        private Work work;

        public Builder() {
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * ID of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setImpressionsCount(int impressionsCount) {
            this.impressionsCount = impressionsCount;
            return this;
        }

        public Builder setLikesCount(int likesCount) {
            this.likesCount = likesCount;
            return this;
        }

        public Builder setModifiedAt(java.time.OffsetDateTime modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder setRatingAnimationState(RatingState ratingAnimationState) {
            this.ratingAnimationState = ratingAnimationState;
            return this;
        }

        public Builder setRatingCharacterState(RatingState ratingCharacterState) {
            this.ratingCharacterState = ratingCharacterState;
            return this;
        }

        public Builder setRatingMusicState(RatingState ratingMusicState) {
            this.ratingMusicState = ratingMusicState;
            return this;
        }

        public Builder setRatingOverallState(RatingState ratingOverallState) {
            this.ratingOverallState = ratingOverallState;
            return this;
        }

        public Builder setRatingStoryState(RatingState ratingStoryState) {
            this.ratingStoryState = ratingStoryState;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
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


        public Review build() {
            return new Review(annictId, body, createdAt, id, impressionsCount, likesCount, modifiedAt, ratingAnimationState, ratingCharacterState, ratingMusicState, ratingOverallState, ratingStoryState, title, updatedAt, user, work);
        }

    }
}
