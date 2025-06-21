package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class Person implements java.io.Serializable, StaffResourceItem, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    private String birthday;
    private String bloodType;
    private int castsCount;
    private int favoritePeopleCount;
    private String genderText;
    private String height;
    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private String nameEn;
    @jakarta.validation.constraints.NotNull
    private String nameKana;
    private String nickname;
    @jakarta.validation.constraints.NotNull
    private String nicknameEn;
    private Prefecture prefecture;
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

    public Person() {
    }

    public Person(int annictId, String birthday, String bloodType, int castsCount, int favoritePeopleCount, String genderText, String height, String id, String name, String nameEn, String nameKana, String nickname, String nicknameEn, Prefecture prefecture, int staffsCount, String twitterUsername, String twitterUsernameEn, String url, String urlEn, String wikipediaUrl, String wikipediaUrlEn) {
        this.annictId = annictId;
        this.birthday = birthday;
        this.bloodType = bloodType;
        this.castsCount = castsCount;
        this.favoritePeopleCount = favoritePeopleCount;
        this.genderText = genderText;
        this.height = height;
        this.id = id;
        this.name = name;
        this.nameEn = nameEn;
        this.nameKana = nameKana;
        this.nickname = nickname;
        this.nicknameEn = nicknameEn;
        this.prefecture = prefecture;
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

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBloodType() {
        return bloodType;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getCastsCount() {
        return castsCount;
    }
    public void setCastsCount(int castsCount) {
        this.castsCount = castsCount;
    }

    public int getFavoritePeopleCount() {
        return favoritePeopleCount;
    }
    public void setFavoritePeopleCount(int favoritePeopleCount) {
        this.favoritePeopleCount = favoritePeopleCount;
    }

    public String getGenderText() {
        return genderText;
    }
    public void setGenderText(String genderText) {
        this.genderText = genderText;
    }

    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
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

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNicknameEn() {
        return nicknameEn;
    }
    public void setNicknameEn(String nicknameEn) {
        this.nicknameEn = nicknameEn;
    }

    public Prefecture getPrefecture() {
        return prefecture;
    }
    public void setPrefecture(Prefecture prefecture) {
        this.prefecture = prefecture;
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
        if (birthday != null) {
            joiner.add("birthday: " + GraphQLRequestSerializer.getEntry(birthday));
        }
        if (bloodType != null) {
            joiner.add("bloodType: " + GraphQLRequestSerializer.getEntry(bloodType));
        }
        joiner.add("castsCount: " + GraphQLRequestSerializer.getEntry(castsCount));
        joiner.add("favoritePeopleCount: " + GraphQLRequestSerializer.getEntry(favoritePeopleCount));
        if (genderText != null) {
            joiner.add("genderText: " + GraphQLRequestSerializer.getEntry(genderText));
        }
        if (height != null) {
            joiner.add("height: " + GraphQLRequestSerializer.getEntry(height));
        }
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
        if (nickname != null) {
            joiner.add("nickname: " + GraphQLRequestSerializer.getEntry(nickname));
        }
        if (nicknameEn != null) {
            joiner.add("nicknameEn: " + GraphQLRequestSerializer.getEntry(nicknameEn));
        }
        if (prefecture != null) {
            joiner.add("prefecture: " + GraphQLRequestSerializer.getEntry(prefecture));
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

    public static Person.Builder builder() {
        return new Person.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T02:10:38+0900"
    )
    public static class Builder {

        private int annictId;
        private String birthday;
        private String bloodType;
        private int castsCount;
        private int favoritePeopleCount;
        private String genderText;
        private String height;
        private String id;
        private String name;
        private String nameEn;
        private String nameKana;
        private String nickname;
        private String nicknameEn;
        private Prefecture prefecture;
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

        public Builder setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder setBloodType(String bloodType) {
            this.bloodType = bloodType;
            return this;
        }

        public Builder setCastsCount(int castsCount) {
            this.castsCount = castsCount;
            return this;
        }

        public Builder setFavoritePeopleCount(int favoritePeopleCount) {
            this.favoritePeopleCount = favoritePeopleCount;
            return this;
        }

        public Builder setGenderText(String genderText) {
            this.genderText = genderText;
            return this;
        }

        public Builder setHeight(String height) {
            this.height = height;
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

        public Builder setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder setNicknameEn(String nicknameEn) {
            this.nicknameEn = nicknameEn;
            return this;
        }

        public Builder setPrefecture(Prefecture prefecture) {
            this.prefecture = prefecture;
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


        public Person build() {
            return new Person(annictId, birthday, bloodType, castsCount, favoritePeopleCount, genderText, height, id, name, nameEn, nameKana, nickname, nicknameEn, prefecture, staffsCount, twitterUsername, twitterUsernameEn, url, urlEn, wikipediaUrl, wikipediaUrlEn);
        }

    }
}
