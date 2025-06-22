package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field works in type User
 */
public class UserWorksParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private java.util.List<Integer> annictIds;
    private String before;
    private Integer first;
    private Integer last;
    private WorkOrder orderBy;
    private java.util.List<String> seasons;
    private StatusState state;
    private java.util.List<String> titles;

    public UserWorksParametrizedInput() {
    }

    public UserWorksParametrizedInput(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, WorkOrder orderBy, java.util.List<String> seasons, StatusState state, java.util.List<String> titles) {
        this.after = after;
        this.annictIds = annictIds;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
        this.seasons = seasons;
        this.state = state;
        this.titles = titles;
    }

    public UserWorksParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public UserWorksParametrizedInput annictIds(java.util.List<Integer> annictIds) {
        this.annictIds = annictIds;
        return this;
    }

    public UserWorksParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public UserWorksParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public UserWorksParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public UserWorksParametrizedInput orderBy(WorkOrder orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public UserWorksParametrizedInput seasons(java.util.List<String> seasons) {
        this.seasons = seasons;
        return this;
    }

    public UserWorksParametrizedInput state(StatusState state) {
        this.state = state;
        return this;
    }

    public UserWorksParametrizedInput titles(java.util.List<String> titles) {
        this.titles = titles;
        return this;
    }

    @Override
    public UserWorksParametrizedInput deepCopy() {
        UserWorksParametrizedInput parametrizedInput = new UserWorksParametrizedInput();
        parametrizedInput.after(this.after);
        parametrizedInput.annictIds(this.annictIds);
        parametrizedInput.before(this.before);
        parametrizedInput.first(this.first);
        parametrizedInput.last(this.last);
        parametrizedInput.orderBy(this.orderBy);
        parametrizedInput.seasons(this.seasons);
        parametrizedInput.state(this.state);
        parametrizedInput.titles(this.titles);
        return parametrizedInput;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (annictIds != null) {
            joiner.add("annictIds: " + GraphQLRequestSerializer.getEntry(annictIds));
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
        if (seasons != null) {
            joiner.add("seasons: " + GraphQLRequestSerializer.getEntry(seasons));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (titles != null) {
            joiner.add("titles: " + GraphQLRequestSerializer.getEntry(titles));
        }
        return joiner.toString();
    }

}
