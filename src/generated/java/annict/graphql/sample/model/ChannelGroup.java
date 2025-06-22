package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

public class ChannelGroup implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    private ChannelConnection channels;
    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    private int sortNumber;

    public ChannelGroup() {
    }

    public ChannelGroup(int annictId, ChannelConnection channels, String id, String name, int sortNumber) {
        this.annictId = annictId;
        this.channels = channels;
        this.id = id;
        this.name = name;
        this.sortNumber = sortNumber;
    }

    public int getAnnictId() {
        return annictId;
    }
    public void setAnnictId(int annictId) {
        this.annictId = annictId;
    }

    public ChannelConnection getChannels() {
        return channels;
    }
    public void setChannels(ChannelConnection channels) {
        this.channels = channels;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSortNumber() {
        return sortNumber;
    }
    public void setSortNumber(int sortNumber) {
        this.sortNumber = sortNumber;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("annictId: " + GraphQLRequestSerializer.getEntry(annictId));
        if (channels != null) {
            joiner.add("channels: " + GraphQLRequestSerializer.getEntry(channels));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("sortNumber: " + GraphQLRequestSerializer.getEntry(sortNumber));
        return joiner.toString();
    }

    public static ChannelGroup.Builder builder() {
        return new ChannelGroup.Builder();
    }

    public static class Builder {

        private int annictId;
        private ChannelConnection channels;
        private String id;
        private String name;
        private int sortNumber;

        public Builder() {
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        public Builder setChannels(ChannelConnection channels) {
            this.channels = channels;
            return this;
        }

        /**
         * ID of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSortNumber(int sortNumber) {
            this.sortNumber = sortNumber;
            return this;
        }


        public ChannelGroup build() {
            return new ChannelGroup(annictId, channels, id, name, sortNumber);
        }

    }
}
