package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class Organization implements java.io.Serializable, StaffResourceItem, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    private int favoriteOrganizationsCount;
    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private String nameEn;
    @jakarta.validation.constraints.NotNull
    private String nameKana;
    private int staffsCount;
    private String twitterUsername;
    @jakarta.validation.constraints.NotNull
    private String twitterUsernameEn;
    private String url;
    @jakarta.validation.constraints.NotNull
    private String urlEn;
    private String wikipediaUrl;
    @jakarta.validation.constraints.NotNull
    private String wikipediaUrlEn;

    public Organization() {
    }

    public Organization(int annictId, int favoriteOrganizationsCount, String id, String name, String nameEn, String nameKana, int staffsCount, String twitterUsername, String twitterUsernameEn, String url, String urlEn, String wikipediaUrl, String wikipediaUrlEn) {
        this.annictId = annictId;
        this.favoriteOrganizationsCount = favoriteOrganizationsCount;
        this.id = id;
        this.name = name;
        this.nameEn = nameEn;
        this.nameKana = nameKana;
        this.staffsCount = staffsCount;
        this.twitterUsername = twitterUsername;
        this.twitterUsernameEn = twitterUsernameEn;
        this.url = url;
        this.urlEn = urlEn;
        this.wikipediaUrl = wikipediaUrl;
        this.wikipediaUrlEn = wikipediaUrlEn;
    }

    public int getAnnictId() {
        return annictId;
    }
    public void setAnnictId(int annictId) {
        this.annictId = annictId;
    }

    public int getFavoriteOrganizationsCount() {
        return favoriteOrganizationsCount;
    }
    public void setFavoriteOrganizationsCount(int favoriteOrganizationsCount) {
        this.favoriteOrganizationsCount = favoriteOrganizationsCount;
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

    public String getNameKana() {
        return nameKana;
    }
    public void setNameKana(String nameKana) {
        this.nameKana = nameKana;
    }

    public int getStaffsCount() {
        return staffsCount;
    }
    public void setStaffsCount(int staffsCount) {
        this.staffsCount = staffsCount;
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }
    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public String getTwitterUsernameEn() {
        return twitterUsernameEn;
    }
    public void setTwitterUsernameEn(String twitterUsernameEn) {
        this.twitterUsernameEn = twitterUsernameEn;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlEn() {
        return urlEn;
    }
    public void setUrlEn(String urlEn) {
        this.urlEn = urlEn;
    }

    public String getWikipediaUrl() {
        return wikipediaUrl;
    }
    public void setWikipediaUrl(String wikipediaUrl) {
        this.wikipediaUrl = wikipediaUrl;
    }

    public String getWikipediaUrlEn() {
        return wikipediaUrlEn;
    }
    public void setWikipediaUrlEn(String wikipediaUrlEn) {
        this.wikipediaUrlEn = wikipediaUrlEn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("annictId: " + GraphQLRequestSerializer.getEntry(annictId));
        joiner.add("favoriteOrganizationsCount: " + GraphQLRequestSerializer.getEntry(favoriteOrganizationsCount));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (nameEn != null) {
            joiner.add("nameEn: " + GraphQLRequestSerializer.getEntry(nameEn));
        }
        if (nameKana != null) {
            joiner.add("nameKana: " + GraphQLRequestSerializer.getEntry(nameKana));
        }
        joiner.add("staffsCount: " + GraphQLRequestSerializer.getEntry(staffsCount));
        if (twitterUsername != null) {
            joiner.add("twitterUsername: " + GraphQLRequestSerializer.getEntry(twitterUsername));
        }
        if (twitterUsernameEn != null) {
            joiner.add("twitterUsernameEn: " + GraphQLRequestSerializer.getEntry(twitterUsernameEn));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        if (urlEn != null) {
            joiner.add("urlEn: " + GraphQLRequestSerializer.getEntry(urlEn));
        }
        if (wikipediaUrl != null) {
            joiner.add("wikipediaUrl: " + GraphQLRequestSerializer.getEntry(wikipediaUrl));
        }
        if (wikipediaUrlEn != null) {
            joiner.add("wikipediaUrlEn: " + GraphQLRequestSerializer.getEntry(wikipediaUrlEn));
        }
        return joiner.toString();
    }

    public static Organization.Builder builder() {
        return new Organization.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T02:10:38+0900"
    )
    public static class Builder {

        private int annictId;
        private int favoriteOrganizationsCount;
        private String id;
        private String name;
        private String nameEn;
        private String nameKana;
        private int staffsCount;
        private String twitterUsername;
        private String twitterUsernameEn;
        private String url;
        private String urlEn;
        private String wikipediaUrl;
        private String wikipediaUrlEn;

        public Builder() {
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        public Builder setFavoriteOrganizationsCount(int favoriteOrganizationsCount) {
            this.favoriteOrganizationsCount = favoriteOrganizationsCount;
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

        public Builder setNameKana(String nameKana) {
            this.nameKana = nameKana;
            return this;
        }

        public Builder setStaffsCount(int staffsCount) {
            this.staffsCount = staffsCount;
            return this;
        }

        public Builder setTwitterUsername(String twitterUsername) {
            this.twitterUsername = twitterUsername;
            return this;
        }

        public Builder setTwitterUsernameEn(String twitterUsernameEn) {
            this.twitterUsernameEn = twitterUsernameEn;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setUrlEn(String urlEn) {
            this.urlEn = urlEn;
            return this;
        }

        public Builder setWikipediaUrl(String wikipediaUrl) {
            this.wikipediaUrl = wikipediaUrl;
            return this;
        }

        public Builder setWikipediaUrlEn(String wikipediaUrlEn) {
            this.wikipediaUrlEn = wikipediaUrlEn;
            return this;
        }


        public Organization build() {
            return new Organization(annictId, favoriteOrganizationsCount, id, name, nameEn, nameKana, staffsCount, twitterUsername, twitterUsernameEn, url, urlEn, wikipediaUrl, wikipediaUrlEn);
        }

    }
}
