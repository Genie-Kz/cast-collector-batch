package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field records in type MultipleRecord
 */
public class MultipleRecordRecordsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;

    public MultipleRecordRecordsParametrizedInput() {
    }

    public MultipleRecordRecordsParametrizedInput(String after, String before, Integer first, Integer last) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
    }

    public MultipleRecordRecordsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public MultipleRecordRecordsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public MultipleRecordRecordsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public MultipleRecordRecordsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    @Override
    public MultipleRecordRecordsParametrizedInput deepCopy() {
        MultipleRecordRecordsParametrizedInput parametrizedInput = new MultipleRecordRecordsParametrizedInput();
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
