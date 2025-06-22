package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

public class RecordOrder implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private OrderDirection direction;
    @jakarta.validation.constraints.NotNull
    private RecordOrderField field;

    public RecordOrder() {
    }

    public RecordOrder(OrderDirection direction, RecordOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public RecordOrderField getField() {
        return field;
    }
    public void setField(RecordOrderField field) {
        this.field = field;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (direction != null) {
            joiner.add("direction: " + GraphQLRequestSerializer.getEntry(direction));
        }
        if (field != null) {
            joiner.add("field: " + GraphQLRequestSerializer.getEntry(field));
        }
        return joiner.toString();
    }

    public static RecordOrder.Builder builder() {
        return new RecordOrder.Builder();
    }

    public static class Builder {

        private OrderDirection direction;
        private RecordOrderField field;

        public Builder() {
        }

        public Builder setDirection(OrderDirection direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(RecordOrderField field) {
            this.field = field;
            return this;
        }


        public RecordOrder build() {
            return new RecordOrder(direction, field);
        }

    }
}
