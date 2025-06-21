package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class Series implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private String nameEn;
    @jakarta.validation.constraints.NotNull
    private String nameRo;

    public Series() {
    }

    public Series(int annictId, String id, String name, String nameEn, String nameRo) {
        this.annictId = annictId;
        this.id = id;
        this.name = name;
        this.nameEn = nameEn;
        this.nameRo = nameRo;
    }

    public int getAnnictId() {
        return annictId;
    }
    public void setAnnictId(int annictId) {
        this.annictId = annictId;
    }

    /**
     * ID of the object.
     */
    public String getId() {
        return id;
    }
    /**
     * ID of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameRo() {
        return nameRo;
    }
    public void setNameRo(String nameRo) {
        this.nameRo = nameRo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("annictId: " + GraphQLRequestSerializer.getEntry(annictId));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (nameEn != null) {
            joiner.add("nameEn: " + GraphQLRequestSerializer.getEntry(nameEn));
        }
        if (nameRo != null) {
            joiner.add("nameRo: " + GraphQLRequestSerializer.getEntry(nameRo));
        }
        return joiner.toString();
    }

    public static Series.Builder builder() {
        return new Series.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T02:10:38+0900"
    )
    public static class Builder {

        private int annictId;
        private String id;
        private String name;
        private String nameEn;
        private String nameRo;

        public Builder() {
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        /**
         * ID of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }

        public Builder setNameRo(String nameRo) {
            this.nameRo = nameRo;
            return this;
        }


        public Series build() {
            return new Series(annictId, id, name, nameEn, nameRo);
        }

    }
}
