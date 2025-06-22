package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field records in type User
 */
public class UserRecordsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Boolean hasComment;
    private Integer last;
    private RecordOrder orderBy;

    public UserRecordsParametrizedInput() {
    }

    public UserRecordsParametrizedInput(String after, String before, Integer first, Boolean hasComment, Integer last, RecordOrder orderBy) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.hasComment = hasComment;
        this.last = last;
        this.orderBy = orderBy;
    }

    public UserRecordsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public UserRecordsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public UserRecordsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public UserRecordsParametrizedInput hasComment(Boolean hasComment) {
        this.hasComment = hasComment;
        return this;
    }

    public UserRecordsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public UserRecordsParametrizedInput orderBy(RecordOrder orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    @Override
    public UserRecordsParametrizedInput deepCopy() {
        UserRecordsParametrizedInput parametrizedInput = new UserRecordsParametrizedInput();
        parametrizedInput.after(this.after);
        parametrizedInput.before(this.before);
        parametrizedInput.first(this.first);
        parametrizedInput.hasComment(this.hasComment);
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
        if (hasComment != null) {
            joiner.add("hasComment: " + GraphQLRequestSerializer.getEntry(hasComment));
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
