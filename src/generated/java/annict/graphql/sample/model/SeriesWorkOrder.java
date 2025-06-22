package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

public class SeriesWorkOrder implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private OrderDirection direction;
    @jakarta.validation.constraints.NotNull
    private SeriesWorkOrderField field;

    public SeriesWorkOrder() {
    }

    public SeriesWorkOrder(OrderDirection direction, SeriesWorkOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public SeriesWorkOrderField getField() {
        return field;
    }
    public void setField(SeriesWorkOrderField field) {
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

    public static SeriesWorkOrder.Builder builder() {
        return new SeriesWorkOrder.Builder();
    }

    public static class Builder {

        private OrderDirection direction;
        private SeriesWorkOrderField field;

        public Builder() {
        }

        public Builder setDirection(OrderDirection direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(SeriesWorkOrderField field) {
            this.field = field;
            return this;
        }


        public SeriesWorkOrder build() {
            return new SeriesWorkOrder(direction, field);
        }

    }
}
