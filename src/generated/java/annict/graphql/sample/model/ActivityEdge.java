package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * An edge in a connection.
 */
public class ActivityEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ActivityAction action;
    private int annictId;
    @jakarta.validation.constraints.NotNull
    private String cursor;
    private ActivityItem item;
    private Activity node;
    @jakarta.validation.constraints.NotNull
    private User user;

    public ActivityEdge() {
    }

    public ActivityEdge(ActivityAction action, int annictId, String cursor, ActivityItem item, Activity node, User user) {
        this.action = action;
        this.annictId = annictId;
        this.cursor = cursor;
        this.item = item;
        this.node = node;
        this.user = user;
    }

    public ActivityAction getAction() {
        return action;
    }
    public void setAction(ActivityAction action) {
        this.action = action;
    }

    public int getAnnictId() {
        return annictId;
    }
    public void setAnnictId(int annictId) {
        this.annictId = annictId;
    }

    /**
     * A cursor for use in pagination.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * A cursor for use in pagination.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ActivityItem getItem() {
        return item;
    }
    public void setItem(ActivityItem item) {
        this.item = item;
    }

    /**
     * The item at the end of the edge.
     */
    public Activity getNode() {
        return node;
    }
    /**
     * The item at the end of the edge.
     */
    public void setNode(Activity node) {
        this.node = node;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (action != null) {
            joiner.add("action: " + GraphQLRequestSerializer.getEntry(action));
        }
        joiner.add("annictId: " + GraphQLRequestSerializer.getEntry(annictId));
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        if (item != null) {
            joiner.add("item: " + GraphQLRequestSerializer.getEntry(item));
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        return joiner.toString();
    }

    public static ActivityEdge.Builder builder() {
        return new ActivityEdge.Builder();
    }

    public static class Builder {

        private ActivityAction action;
        private int annictId;
        private String cursor;
        private ActivityItem item;
        private Activity node;
        private User user;

        public Builder() {
        }

        public Builder setAction(ActivityAction action) {
            this.action = action;
            return this;
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        /**
         * A cursor for use in pagination.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setItem(ActivityItem item) {
            this.item = item;
            return this;
        }

        /**
         * The item at the end of the edge.
         */
        public Builder setNode(Activity node) {
            this.node = node;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }


        public ActivityEdge build() {
            return new ActivityEdge(action, annictId, cursor, item, node, user);
        }

    }
}
