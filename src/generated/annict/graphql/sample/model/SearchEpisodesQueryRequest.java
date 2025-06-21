package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class SearchEpisodesQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "searchEpisodes";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public SearchEpisodesQueryRequest() {
    }

    public SearchEpisodesQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setAfter(String after) {
        this.input.put("after", after);
    }

    public void setAnnictIds(java.util.List<Integer> annictIds) {
        this.input.put("annictIds", annictIds);
    }

    public void setBefore(String before) {
        this.input.put("before", before);
    }

    public void setFirst(Integer first) {
        this.input.put("first", first);
    }

    public void setLast(Integer last) {
        this.input.put("last", last);
    }

    public void setOrderBy(EpisodeOrder orderBy) {
        this.input.put("orderBy", orderBy);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static SearchEpisodesQueryRequest.Builder builder() {
        return new SearchEpisodesQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T01:49:37+0900"
    )
    public static class Builder {

        private String $alias;
        private String after;
        private java.util.List<Integer> annictIds;
        private String before;
        private Integer first;
        private Integer last;
        private EpisodeOrder orderBy;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setAfter(String after) {
            this.after = after;
            return this;
        }

        public Builder setAnnictIds(java.util.List<Integer> annictIds) {
            this.annictIds = annictIds;
            return this;
        }

        public Builder setBefore(String before) {
            this.before = before;
            return this;
        }

        public Builder setFirst(Integer first) {
            this.first = first;
            return this;
        }

        public Builder setLast(Integer last) {
            this.last = last;
            return this;
        }

        public Builder setOrderBy(EpisodeOrder orderBy) {
            this.orderBy = orderBy;
            return this;
        }


        public SearchEpisodesQueryRequest build() {
            SearchEpisodesQueryRequest obj = new SearchEpisodesQueryRequest($alias);
            obj.setAfter(after);
            obj.setAnnictIds(annictIds);
            obj.setBefore(before);
            obj.setFirst(first);
            obj.setLast(last);
            obj.setOrderBy(orderBy);
            return obj;
        }

    }
}
