package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Information about pagination in a connection.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:00+0900"
)
public class PageInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String endCursor;
    private boolean hasNextPage;
    private boolean hasPreviousPage;
    private String startCursor;

    public PageInfo() {
    }

    public PageInfo(String endCursor, boolean hasNextPage, boolean hasPreviousPage, String startCursor) {
        this.endCursor = endCursor;
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.startCursor = startCursor;
    }

    /**
     * When paginating forwards, the cursor to continue.
     */
    public String getEndCursor() {
        return endCursor;
    }
    /**
     * When paginating forwards, the cursor to continue.
     */
    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }

    /**
     * When paginating forwards, are there more items?
     */
    public boolean getHasNextPage() {
        return hasNextPage;
    }
    /**
     * When paginating forwards, are there more items?
     */
    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    /**
     * When paginating backwards, are there more items?
     */
    public boolean getHasPreviousPage() {
        return hasPreviousPage;
    }
    /**
     * When paginating backwards, are there more items?
     */
    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    /**
     * When paginating backwards, the cursor to continue.
     */
    public String getStartCursor() {
        return startCursor;
    }
    /**
     * When paginating backwards, the cursor to continue.
     */
    public void setStartCursor(String startCursor) {
        this.startCursor = startCursor;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (endCursor != null) {
            joiner.add("endCursor: " + GraphQLRequestSerializer.getEntry(endCursor));
        }
        joiner.add("hasNextPage: " + GraphQLRequestSerializer.getEntry(hasNextPage));
        joiner.add("hasPreviousPage: " + GraphQLRequestSerializer.getEntry(hasPreviousPage));
        if (startCursor != null) {
            joiner.add("startCursor: " + GraphQLRequestSerializer.getEntry(startCursor));
        }
        return joiner.toString();
    }

    public static PageInfo.Builder builder() {
        return new PageInfo.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T12:59:00+0900"
    )
    public static class Builder {

        private String endCursor;
        private boolean hasNextPage;
        private boolean hasPreviousPage;
        private String startCursor;

        public Builder() {
        }

        /**
         * When paginating forwards, the cursor to continue.
         */
        public Builder setEndCursor(String endCursor) {
            this.endCursor = endCursor;
            return this;
        }

        /**
         * When paginating forwards, are there more items?
         */
        public Builder setHasNextPage(boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }

        /**
         * When paginating backwards, are there more items?
         */
        public Builder setHasPreviousPage(boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
            return this;
        }

        /**
         * When paginating backwards, the cursor to continue.
         */
        public Builder setStartCursor(String startCursor) {
            this.startCursor = startCursor;
            return this;
        }


        public PageInfo build() {
            return new PageInfo(endCursor, hasNextPage, hasPreviousPage, startCursor);
        }

    }
}
