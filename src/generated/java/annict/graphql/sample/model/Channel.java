package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

public class Channel implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    @jakarta.validation.constraints.NotNull
    private ChannelGroup channelGroup;
    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    private boolean published;
    private int scChid;

    public Channel() {
    }

    public Channel(int annictId, ChannelGroup channelGroup, String id, String name, boolean published, int scChid) {
        this.annictId = annictId;
        this.channelGroup = channelGroup;
        this.id = id;
        this.name = name;
        this.published = published;
        this.scChid = scChid;
    }

    public int getAnnictId() {
        return annictId;
    }
    public void setAnnictId(int annictId) {
        this.annictId = annictId;
    }

    public ChannelGroup getChannelGroup() {
        return channelGroup;
    }
    public void setChannelGroup(ChannelGroup channelGroup) {
        this.channelGroup = channelGroup;
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

    public boolean getPublished() {
        return published;
    }
    public void setPublished(boolean published) {
        this.published = published;
    }

    public int getScChid() {
        return scChid;
    }
    public void setScChid(int scChid) {
        this.scChid = scChid;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("annictId: " + GraphQLRequestSerializer.getEntry(annictId));
        if (channelGroup != null) {
            joiner.add("channelGroup: " + GraphQLRequestSerializer.getEntry(channelGroup));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("published: " + GraphQLRequestSerializer.getEntry(published));
        joiner.add("scChid: " + GraphQLRequestSerializer.getEntry(scChid));
        return joiner.toString();
    }

    public static Channel.Builder builder() {
        return new Channel.Builder();
    }

    public static class Builder {

        private int annictId;
        private ChannelGroup channelGroup;
        private String id;
        private String name;
        private boolean published;
        private int scChid;

        public Builder() {
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        public Builder setChannelGroup(ChannelGroup channelGroup) {
            this.channelGroup = channelGroup;
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

        public Builder setPublished(boolean published) {
            this.published = published;
            return this;
        }

        public Builder setScChid(int scChid) {
            this.scChid = scChid;
            return this;
        }


        public Channel build() {
            return new Channel(annictId, channelGroup, id, name, published, scChid);
        }

    }
}
