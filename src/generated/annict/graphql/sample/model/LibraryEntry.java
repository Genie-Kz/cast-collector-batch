package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class LibraryEntry implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private Episode nextEpisode;
    private Program nextProgram;
    @jakarta.validation.constraints.NotNull
    private String note;
    private Status status;
    @jakarta.validation.constraints.NotNull
    private User user;
    @jakarta.validation.constraints.NotNull
    private Work work;

    public LibraryEntry() {
    }

    public LibraryEntry(String id, Episode nextEpisode, Program nextProgram, String note, Status status, User user, Work work) {
        this.id = id;
        this.nextEpisode = nextEpisode;
        this.nextProgram = nextProgram;
        this.note = note;
        this.status = status;
        this.user = user;
        this.work = work;
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

    public Episode getNextEpisode() {
        return nextEpisode;
    }
    public void setNextEpisode(Episode nextEpisode) {
        this.nextEpisode = nextEpisode;
    }

    public Program getNextProgram() {
        return nextProgram;
    }
    public void setNextProgram(Program nextProgram) {
        this.nextProgram = nextProgram;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (nextEpisode != null) {
            joiner.add("nextEpisode: " + GraphQLRequestSerializer.getEntry(nextEpisode));
        }
        if (nextProgram != null) {
            joiner.add("nextProgram: " + GraphQLRequestSerializer.getEntry(nextProgram));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        if (work != null) {
            joiner.add("work: " + GraphQLRequestSerializer.getEntry(work));
        }
        return joiner.toString();
    }

    public static LibraryEntry.Builder builder() {
        return new LibraryEntry.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T01:49:37+0900"
    )
    public static class Builder {

        private String id;
        private Episode nextEpisode;
        private Program nextProgram;
        private String note;
        private Status status;
        private User user;
        private Work work;

        public Builder() {
        }

        /**
         * ID of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setNextEpisode(Episode nextEpisode) {
            this.nextEpisode = nextEpisode;
            return this;
        }

        public Builder setNextProgram(Program nextProgram) {
            this.nextProgram = nextProgram;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setStatus(Status status) {
            this.status = status;
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


        public LibraryEntry build() {
            return new LibraryEntry(id, nextEpisode, nextProgram, note, status, user, work);
        }

    }
}
