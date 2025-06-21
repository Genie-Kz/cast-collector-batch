package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field programs in type User
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class UserProgramsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private ProgramOrder orderBy;
    private Boolean unwatched;

    public UserProgramsParametrizedInput() {
    }

    public UserProgramsParametrizedInput(String after, String before, Integer first, Integer last, ProgramOrder orderBy, Boolean unwatched) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
        this.unwatched = unwatched;
    }

    public UserProgramsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public UserProgramsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public UserProgramsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public UserProgramsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public UserProgramsParametrizedInput orderBy(ProgramOrder orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public UserProgramsParametrizedInput unwatched(Boolean unwatched) {
        this.unwatched = unwatched;
        return this;
    }

    @Override
    public UserProgramsParametrizedInput deepCopy() {
        UserProgramsParametrizedInput parametrizedInput = new UserProgramsParametrizedInput();
        parametrizedInput.after(this.after);
        parametrizedInput.before(this.before);
        parametrizedInput.first(this.first);
        parametrizedInput.last(this.last);
        parametrizedInput.orderBy(this.orderBy);
        parametrizedInput.unwatched(this.unwatched);
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
        if (unwatched != null) {
            joiner.add("unwatched: " + GraphQLRequestSerializer.getEntry(unwatched));
        }
        return joiner.toString();
    }

}
