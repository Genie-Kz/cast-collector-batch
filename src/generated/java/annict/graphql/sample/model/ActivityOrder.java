package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

public class ActivityOrder implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private OrderDirection direction;
    @jakarta.validation.constraints.NotNull
    private ActivityOrderField field;

    public ActivityOrder() {
    }

    public ActivityOrder(OrderDirection direction, ActivityOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public ActivityOrderField getField() {
        return field;
    }
    public void setField(ActivityOrderField field) {
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

    public static ActivityOrder.Builder builder() {
        return new ActivityOrder.Builder();
    }

    public static class Builder {

        private OrderDirection direction;
        private ActivityOrderField field;

        public Builder() {
        }

        public Builder setDirection(OrderDirection direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(ActivityOrderField field) {
            this.field = field;
            return this;
        }


        public ActivityOrder build() {
            return new ActivityOrder(direction, field);
        }

    }
}
