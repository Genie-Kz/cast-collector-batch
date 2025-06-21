package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field works in type Series
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class SeriesWorksParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private SeriesWorkOrder orderBy;

    public SeriesWorksParametrizedInput() {
    }

    public SeriesWorksParametrizedInput(String after, String before, Integer first, Integer last, SeriesWorkOrder orderBy) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public SeriesWorksParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public SeriesWorksParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public SeriesWorksParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public SeriesWorksParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public SeriesWorksParametrizedInput orderBy(SeriesWorkOrder orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    @Override
    public SeriesWorksParametrizedInput deepCopy() {
        SeriesWorksParametrizedInput parametrizedInput = new SeriesWorksParametrizedInput();
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
