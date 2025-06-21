package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class Status implements java.io.Serializable, ActivityItem, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime createdAt;
    @jakarta.validation.constraints.NotNull
    private String id;
    private int likesCount;
    @jakarta.validation.constraints.NotNull
    private StatusState state;
    @jakarta.validation.constraints.NotNull
    private User user;
    @jakarta.validation.constraints.NotNull
    private Work work;

    public Status() {
    }

    public Status(int annictId, java.time.OffsetDateTime createdAt, String id, int likesCount, StatusState state, User user, Work work) {
        this.annictId = annictId;
        this.createdAt = createdAt;
        this.id = id;
        this.likesCount = likesCount;
        this.state = state;
        this.user = user;
        this.work = work;
    }

    public int getAnnictId() {
        return annictId;
    }
    public void setAnnictId(int annictId) {
        this.annictId = annictId;
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

    public int getLikesCount() {
        return likesCount;
    }
    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public StatusState getState() {
        return state;
    }
    public void setState(StatusState state) {
        this.state = state;
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
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("likesCount: " + GraphQLRequestSerializer.getEntry(likesCount));
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        if (work != null) {
            joiner.add("work: " + GraphQLRequestSerializer.getEntry(work));
        }
        return joiner.toString();
    }

    public static Status.Builder builder() {
        return new Status.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T01:49:37+0900"
    )
    public static class Builder {

        private int annictId;
        private java.time.OffsetDateTime createdAt;
        private String id;
        private int likesCount;
        private StatusState state;
        private User user;
        private Work work;

        public Builder() {
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
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

        public Builder setLikesCount(int likesCount) {
            this.likesCount = likesCount;
            return this;
        }

        public Builder setState(StatusState state) {
            this.state = state;
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


        public Status build() {
            return new Status(annictId, createdAt, id, likesCount, state, user, work);
        }

    }
}
