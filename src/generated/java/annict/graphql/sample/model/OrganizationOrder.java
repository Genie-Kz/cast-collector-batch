package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:39+0900"
)
public class OrganizationOrder implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private OrderDirection direction;
    @jakarta.validation.constraints.NotNull
    private OrganizationOrderField field;

    public OrganizationOrder() {
    }

    public OrganizationOrder(OrderDirection direction, OrganizationOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public OrganizationOrderField getField() {
        return field;
    }
    public void setField(OrganizationOrderField field) {
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

    public static OrganizationOrder.Builder builder() {
        return new OrganizationOrder.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T02:10:39+0900"
    )
    public static class Builder {

        private OrderDirection direction;
        private OrganizationOrderField field;

        public Builder() {
        }

        public Builder setDirection(OrderDirection direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(OrganizationOrderField field) {
            this.field = field;
            return this;
        }


        public OrganizationOrder build() {
            return new OrganizationOrder(direction, field);
        }

    }
}
