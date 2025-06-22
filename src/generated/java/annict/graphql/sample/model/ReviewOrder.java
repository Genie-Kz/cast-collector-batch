package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

public class ReviewOrder implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private OrderDirection direction;
    @jakarta.validation.constraints.NotNull
    private ReviewOrderField field;

    public ReviewOrder() {
    }

    public ReviewOrder(OrderDirection direction, ReviewOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public ReviewOrderField getField() {
        return field;
    }
    public void setField(ReviewOrderField field) {
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

    public static ReviewOrder.Builder builder() {
        return new ReviewOrder.Builder();
    }

    public static class Builder {

        private OrderDirection direction;
        private ReviewOrderField field;

        public Builder() {
        }

        public Builder setDirection(OrderDirection direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(ReviewOrderField field) {
            this.field = field;
            return this;
        }


        public ReviewOrder build() {
            return new ReviewOrder(direction, field);
        }

    }
}
