package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

public class ChannelGroup implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    private int sortNumber;

    public ChannelGroup() {
    }

    public ChannelGroup(int annictId, String id, String name, int sortNumber) {
        this.annictId = annictId;
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
        private String id;
        private String name;
        private int sortNumber;

        public Builder() {
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
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
            return new ChannelGroup(annictId, id, name, sortNumber);
        }

    }
}
