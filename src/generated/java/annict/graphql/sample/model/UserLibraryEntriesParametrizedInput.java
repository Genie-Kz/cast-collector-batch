package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field libraryEntries in type User
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class UserLibraryEntriesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private LibraryEntryOrder orderBy;
    private String seasonFrom;
    private String seasonUntil;
    private java.util.List<String> seasons;
    private java.util.List<StatusState> states;

    public UserLibraryEntriesParametrizedInput() {
    }

    public UserLibraryEntriesParametrizedInput(String after, String before, Integer first, Integer last, LibraryEntryOrder orderBy, String seasonFrom, String seasonUntil, java.util.List<String> seasons, java.util.List<StatusState> states) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
        this.seasonFrom = seasonFrom;
        this.seasonUntil = seasonUntil;
        this.seasons = seasons;
        this.states = states;
    }

    public UserLibraryEntriesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public UserLibraryEntriesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public UserLibraryEntriesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public UserLibraryEntriesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public UserLibraryEntriesParametrizedInput orderBy(LibraryEntryOrder orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public UserLibraryEntriesParametrizedInput seasonFrom(String seasonFrom) {
        this.seasonFrom = seasonFrom;
        return this;
    }

    public UserLibraryEntriesParametrizedInput seasonUntil(String seasonUntil) {
        this.seasonUntil = seasonUntil;
        return this;
    }

    public UserLibraryEntriesParametrizedInput seasons(java.util.List<String> seasons) {
        this.seasons = seasons;
        return this;
    }

    public UserLibraryEntriesParametrizedInput states(java.util.List<StatusState> states) {
        this.states = states;
        return this;
    }

    @Override
    public UserLibraryEntriesParametrizedInput deepCopy() {
        UserLibraryEntriesParametrizedInput parametrizedInput = new UserLibraryEntriesParametrizedInput();
        parametrizedInput.after(this.after);
        parametrizedInput.before(this.before);
        parametrizedInput.first(this.first);
        parametrizedInput.last(this.last);
        parametrizedInput.orderBy(this.orderBy);
        parametrizedInput.seasonFrom(this.seasonFrom);
        parametrizedInput.seasonUntil(this.seasonUntil);
        parametrizedInput.seasons(this.seasons);
        parametrizedInput.states(this.states);
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
        if (seasonFrom != null) {
            joiner.add("seasonFrom: " + GraphQLRequestSerializer.getEntry(seasonFrom));
        }
        if (seasonUntil != null) {
            joiner.add("seasonUntil: " + GraphQLRequestSerializer.getEntry(seasonUntil));
        }
        if (seasons != null) {
            joiner.add("seasons: " + GraphQLRequestSerializer.getEntry(seasons));
        }
        if (states != null) {
            joiner.add("states: " + GraphQLRequestSerializer.getEntry(states));
        }
        return joiner.toString();
    }

}
