package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

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
    private SeriesWorkConnection works;

    public Series() {
    }

    public Series(int annictId, String id, String name, String nameEn, String nameRo, SeriesWorkConnection works) {
        this.annictId = annictId;
        this.id = id;
        this.name = name;
        this.nameEn = nameEn;
        this.nameRo = nameRo;
        this.works = works;
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

    public SeriesWorkConnection getWorks() {
        return works;
    }
    public void setWorks(SeriesWorkConnection works) {
        this.works = works;
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
        if (works != null) {
            joiner.add("works: " + GraphQLRequestSerializer.getEntry(works));
        }
        return joiner.toString();
    }

    public static Series.Builder builder() {
        return new Series.Builder();
    }

    public static class Builder {

        private int annictId;
        private String id;
        private String name;
        private String nameEn;
        private String nameRo;
        private SeriesWorkConnection works;

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

        public Builder setWorks(SeriesWorkConnection works) {
            this.works = works;
            return this;
        }


        public Series build() {
            return new Series(annictId, id, name, nameEn, nameRo, works);
        }

    }
}
