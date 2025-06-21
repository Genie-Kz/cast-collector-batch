package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field followingActivities in type User
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class UserFollowingActivitiesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private ActivityOrder orderBy;

    public UserFollowingActivitiesParametrizedInput() {
    }

    public UserFollowingActivitiesParametrizedInput(String after, String before, Integer first, Integer last, ActivityOrder orderBy) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public UserFollowingActivitiesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public UserFollowingActivitiesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public UserFollowingActivitiesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public UserFollowingActivitiesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public UserFollowingActivitiesParametrizedInput orderBy(ActivityOrder orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    @Override
    public UserFollowingActivitiesParametrizedInput deepCopy() {
        UserFollowingActivitiesParametrizedInput parametrizedInput = new UserFollowingActivitiesParametrizedInput();
        parametrizedInput.after(this.after);
        parametrizedInput.before(this.before);
        parametrizedInput.first(this.first);
        parametrizedInput.last(this.last);
        parametrizedInput.orderBy(this.orderBy);
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
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        return joiner.toString();
    }

}
