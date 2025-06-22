package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field programs in type Work
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:01+0900"
)
public class WorkProgramsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private ProgramOrder orderBy;

    public WorkProgramsParametrizedInput() {
    }

    public WorkProgramsParametrizedInput(String after, String before, Integer first, Integer last, ProgramOrder orderBy) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public WorkProgramsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public WorkProgramsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public WorkProgramsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public WorkProgramsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public WorkProgramsParametrizedInput orderBy(ProgramOrder orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    @Override
    public WorkProgramsParametrizedInput deepCopy() {
        WorkProgramsParametrizedInput parametrizedInput = new WorkProgramsParametrizedInput();
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
