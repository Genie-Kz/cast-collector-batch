package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field following in type User
 */
public class UserFollowingParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;

    public UserFollowingParametrizedInput() {
    }

    public UserFollowingParametrizedInput(String after, String before, Integer first, Integer last) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
    }

    public UserFollowingParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public UserFollowingParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public UserFollowingParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public UserFollowingParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    @Override
    public UserFollowingParametrizedInput deepCopy() {
        UserFollowingParametrizedInput parametrizedInput = new UserFollowingParametrizedInput();
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
