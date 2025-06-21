package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field records in type Episode
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class EpisodeRecordsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Boolean hasComment;
    private Integer last;
    private RecordOrder orderBy;

    public EpisodeRecordsParametrizedInput() {
    }

    public EpisodeRecordsParametrizedInput(String after, String before, Integer first, Boolean hasComment, Integer last, RecordOrder orderBy) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.hasComment = hasComment;
        this.last = last;
        this.orderBy = orderBy;
    }

    public EpisodeRecordsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public EpisodeRecordsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public EpisodeRecordsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public EpisodeRecordsParametrizedInput hasComment(Boolean hasComment) {
        this.hasComment = hasComment;
        return this;
    }

    public EpisodeRecordsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public EpisodeRecordsParametrizedInput orderBy(RecordOrder orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    @Override
    public EpisodeRecordsParametrizedInput deepCopy() {
        EpisodeRecordsParametrizedInput parametrizedInput = new EpisodeRecordsParametrizedInput();
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
