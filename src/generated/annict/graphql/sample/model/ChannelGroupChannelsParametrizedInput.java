package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field channels in type ChannelGroup
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class ChannelGroupChannelsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;

    public ChannelGroupChannelsParametrizedInput() {
    }

    public ChannelGroupChannelsParametrizedInput(String after, String before, Integer first, Integer last) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
    }

    public ChannelGroupChannelsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public ChannelGroupChannelsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public ChannelGroupChannelsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public ChannelGroupChannelsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    @Override
    public ChannelGroupChannelsParametrizedInput deepCopy() {
        ChannelGroupChannelsParametrizedInput parametrizedInput = new ChannelGroupChannelsParametrizedInput();
        parametrizedInput.after(this.after);
        parametrizedInput.before(this.before);
        parametrizedInput.first(this.first);
        parametrizedInput.last(this.last);
        return parametrizedInput;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        return joiner.toString();
    }

}
