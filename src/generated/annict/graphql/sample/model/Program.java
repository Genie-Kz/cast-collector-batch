package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class Program implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    @jakarta.validation.constraints.NotNull
    private Channel channel;
    @jakarta.validation.constraints.NotNull
    private Episode episode;
    @jakarta.validation.constraints.NotNull
    private String id;
    private boolean rebroadcast;
    private Integer scPid;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startedAt;
    @jakarta.validation.constraints.NotNull
    private ProgramState state;
    @jakarta.validation.constraints.NotNull
    private Work work;

    public Program() {
    }

    public Program(int annictId, Channel channel, Episode episode, String id, boolean rebroadcast, Integer scPid, java.time.OffsetDateTime startedAt, ProgramState state, Work work) {
        this.annictId = annictId;
        this.channel = channel;
        this.episode = episode;
        this.id = id;
        this.rebroadcast = rebroadcast;
        this.scPid = scPid;
        this.startedAt = startedAt;
        this.state = state;
        this.work = work;
    }

    public int getAnnictId() {
        return annictId;
    }
    public void setAnnictId(int annictId) {
        this.annictId = annictId;
    }

    public Channel getChannel() {
        return channel;
    }
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Episode getEpisode() {
        return episode;
    }
    public void setEpisode(Episode episode) {
        this.episode = episode;
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

    public boolean getRebroadcast() {
        return rebroadcast;
    }
    public void setRebroadcast(boolean rebroadcast) {
        this.rebroadcast = rebroadcast;
    }

    public Integer getScPid() {
        return scPid;
    }
    public void setScPid(Integer scPid) {
        this.scPid = scPid;
    }

    public java.time.OffsetDateTime getStartedAt() {
        return startedAt;
    }
    public void setStartedAt(java.time.OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public ProgramState getState() {
        return state;
    }
    public void setState(ProgramState state) {
        this.state = state;
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
        if (channel != null) {
            joiner.add("channel: " + GraphQLRequestSerializer.getEntry(channel));
        }
        if (episode != null) {
            joiner.add("episode: " + GraphQLRequestSerializer.getEntry(episode));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("rebroadcast: " + GraphQLRequestSerializer.getEntry(rebroadcast));
        if (scPid != null) {
            joiner.add("scPid: " + GraphQLRequestSerializer.getEntry(scPid));
        }
        if (startedAt != null) {
            joiner.add("startedAt: " + GraphQLRequestSerializer.getEntry(startedAt));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (work != null) {
            joiner.add("work: " + GraphQLRequestSerializer.getEntry(work));
        }
        return joiner.toString();
    }

    public static Program.Builder builder() {
        return new Program.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T01:49:37+0900"
    )
    public static class Builder {

        private int annictId;
        private Channel channel;
        private Episode episode;
        private String id;
        private boolean rebroadcast;
        private Integer scPid;
        private java.time.OffsetDateTime startedAt;
        private ProgramState state;
        private Work work;

        public Builder() {
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        public Builder setChannel(Channel channel) {
            this.channel = channel;
            return this;
        }

        public Builder setEpisode(Episode episode) {
            this.episode = episode;
            return this;
        }

        /**
         * ID of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setRebroadcast(boolean rebroadcast) {
            this.rebroadcast = rebroadcast;
            return this;
        }

        public Builder setScPid(Integer scPid) {
            this.scPid = scPid;
            return this;
        }

        public Builder setStartedAt(java.time.OffsetDateTime startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        public Builder setState(ProgramState state) {
            this.state = state;
            return this;
        }

        public Builder setWork(Work work) {
            this.work = work;
            return this;
        }


        public Program build() {
            return new Program(annictId, channel, episode, id, rebroadcast, scPid, startedAt, state, work);
        }

    }
}
