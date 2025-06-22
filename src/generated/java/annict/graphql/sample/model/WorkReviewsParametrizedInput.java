package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field reviews in type Work
 */
public class WorkReviewsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Boolean hasBody;
    private Integer last;
    private ReviewOrder orderBy;

    public WorkReviewsParametrizedInput() {
    }

    public WorkReviewsParametrizedInput(String after, String before, Integer first, Boolean hasBody, Integer last, ReviewOrder orderBy) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.hasBody = hasBody;
        this.last = last;
        this.orderBy = orderBy;
    }

    public WorkReviewsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public WorkReviewsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public WorkReviewsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public WorkReviewsParametrizedInput hasBody(Boolean hasBody) {
        this.hasBody = hasBody;
        return this;
    }

    public WorkReviewsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public WorkReviewsParametrizedInput orderBy(ReviewOrder orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    @Override
    public WorkReviewsParametrizedInput deepCopy() {
        WorkReviewsParametrizedInput parametrizedInput = new WorkReviewsParametrizedInput();
        parametrizedInput.after(this.after);
        parametrizedInput.before(this.before);
        parametrizedInput.first(this.first);
        parametrizedInput.hasBody(this.hasBody);
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
        if (hasBody != null) {
            joiner.add("hasBody: " + GraphQLRequestSerializer.getEntry(hasBody));
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
