package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

public class MultipleRecord implements java.io.Serializable, ActivityItem, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime createdAt;
    @jakarta.validation.constraints.NotNull
    private String id;
    private RecordConnection records;
    @jakarta.validation.constraints.NotNull
    private User user;
    @jakarta.validation.constraints.NotNull
    private Work work;

    public MultipleRecord() {
    }

    public MultipleRecord(int annictId, java.time.OffsetDateTime createdAt, String id, RecordConnection records, User user, Work work) {
        this.annictId = annictId;
        this.createdAt = createdAt;
        this.id = id;
        this.records = records;
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

    public RecordConnection getRecords() {
        return records;
    }
    public void setRecords(RecordConnection records) {
        this.records = records;
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
        if (records != null) {
            joiner.add("records: " + GraphQLRequestSerializer.getEntry(records));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        if (work != null) {
            joiner.add("work: " + GraphQLRequestSerializer.getEntry(work));
        }
        return joiner.toString();
    }

    public static MultipleRecord.Builder builder() {
        return new MultipleRecord.Builder();
    }

    public static class Builder {

        private int annictId;
        private java.time.OffsetDateTime createdAt;
        private String id;
        private RecordConnection records;
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

        public Builder setRecords(RecordConnection records) {
            this.records = records;
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


        public MultipleRecord build() {
            return new MultipleRecord(annictId, createdAt, id, records, user, work);
        }

    }
}
