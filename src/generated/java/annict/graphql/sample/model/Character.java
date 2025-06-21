package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class Character implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String age;
    @jakarta.validation.constraints.NotNull
    private String ageEn;
    private int annictId;
    @jakarta.validation.constraints.NotNull
    private String birthday;
    @jakarta.validation.constraints.NotNull
    private String birthdayEn;
    @jakarta.validation.constraints.NotNull
    private String bloodType;
    @jakarta.validation.constraints.NotNull
    private String bloodTypeEn;
    @jakarta.validation.constraints.NotNull
    private String description;
    @jakarta.validation.constraints.NotNull
    private String descriptionEn;
    @jakarta.validation.constraints.NotNull
    private String descriptionSource;
    @jakarta.validation.constraints.NotNull
    private String descriptionSourceEn;
    private int favoriteCharactersCount;
    @jakarta.validation.constraints.NotNull
    private String height;
    @jakarta.validation.constraints.NotNull
    private String heightEn;
    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private String nameEn;
    @jakarta.validation.constraints.NotNull
    private String nameKana;
    @jakarta.validation.constraints.NotNull
    private String nationality;
    @jakarta.validation.constraints.NotNull
    private String nationalityEn;
    @jakarta.validation.constraints.NotNull
    private String nickname;
    @jakarta.validation.constraints.NotNull
    private String nicknameEn;
    @jakarta.validation.constraints.NotNull
    private String occupation;
    @jakarta.validation.constraints.NotNull
    private String occupationEn;
    private Series series;
    @jakarta.validation.constraints.NotNull
    private String weight;
    @jakarta.validation.constraints.NotNull
    private String weightEn;

    public Character() {
    }

    public Character(String age, String ageEn, int annictId, String birthday, String birthdayEn, String bloodType, String bloodTypeEn, String description, String descriptionEn, String descriptionSource, String descriptionSourceEn, int favoriteCharactersCount, String height, String heightEn, String id, String name, String nameEn, String nameKana, String nationality, String nationalityEn, String nickname, String nicknameEn, String occupation, String occupationEn, Series series, String weight, String weightEn) {
        this.age = age;
        this.ageEn = ageEn;
        this.annictId = annictId;
        this.birthday = birthday;
        this.birthdayEn = birthdayEn;
        this.bloodType = bloodType;
        this.bloodTypeEn = bloodTypeEn;
        this.description = description;
        this.descriptionEn = descriptionEn;
        this.descriptionSource = descriptionSource;
        this.descriptionSourceEn = descriptionSourceEn;
        this.favoriteCharactersCount = favoriteCharactersCount;
        this.height = height;
        this.heightEn = heightEn;
        this.id = id;
        this.name = name;
        this.nameEn = nameEn;
        this.nameKana = nameKana;
        this.nationality = nationality;
        this.nationalityEn = nationalityEn;
        this.nickname = nickname;
        this.nicknameEn = nicknameEn;
        this.occupation = occupation;
        this.occupationEn = occupationEn;
        this.series = series;
        this.weight = weight;
        this.weightEn = weightEn;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getAgeEn() {
        return ageEn;
    }
    public void setAgeEn(String ageEn) {
        this.ageEn = ageEn;
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

    public String getBirthdayEn() {
        return birthdayEn;
    }
    public void setBirthdayEn(String birthdayEn) {
        this.birthdayEn = birthdayEn;
    }

    public String getBloodType() {
        return bloodType;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodTypeEn() {
        return bloodTypeEn;
    }
    public void setBloodTypeEn(String bloodTypeEn) {
        this.bloodTypeEn = bloodTypeEn;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }
    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getDescriptionSource() {
        return descriptionSource;
    }
    public void setDescriptionSource(String descriptionSource) {
        this.descriptionSource = descriptionSource;
    }

    public String getDescriptionSourceEn() {
        return descriptionSourceEn;
    }
    public void setDescriptionSourceEn(String descriptionSourceEn) {
        this.descriptionSourceEn = descriptionSourceEn;
    }

    public int getFavoriteCharactersCount() {
        return favoriteCharactersCount;
    }
    public void setFavoriteCharactersCount(int favoriteCharactersCount) {
        this.favoriteCharactersCount = favoriteCharactersCount;
    }

    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeightEn() {
        return heightEn;
    }
    public void setHeightEn(String heightEn) {
        this.heightEn = heightEn;
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

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationalityEn() {
        return nationalityEn;
    }
    public void setNationalityEn(String nationalityEn) {
        this.nationalityEn = nationalityEn;
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

    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupationEn() {
        return occupationEn;
    }
    public void setOccupationEn(String occupationEn) {
        this.occupationEn = occupationEn;
    }

    public Series getSeries() {
        return series;
    }
    public void setSeries(Series series) {
        this.series = series;
    }

    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeightEn() {
        return weightEn;
    }
    public void setWeightEn(String weightEn) {
        this.weightEn = weightEn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (age != null) {
            joiner.add("age: " + GraphQLRequestSerializer.getEntry(age));
        }
        if (ageEn != null) {
            joiner.add("ageEn: " + GraphQLRequestSerializer.getEntry(ageEn));
        }
        joiner.add("annictId: " + GraphQLRequestSerializer.getEntry(annictId));
        if (birthday != null) {
            joiner.add("birthday: " + GraphQLRequestSerializer.getEntry(birthday));
        }
        if (birthdayEn != null) {
            joiner.add("birthdayEn: " + GraphQLRequestSerializer.getEntry(birthdayEn));
        }
        if (bloodType != null) {
            joiner.add("bloodType: " + GraphQLRequestSerializer.getEntry(bloodType));
        }
        if (bloodTypeEn != null) {
            joiner.add("bloodTypeEn: " + GraphQLRequestSerializer.getEntry(bloodTypeEn));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (descriptionEn != null) {
            joiner.add("descriptionEn: " + GraphQLRequestSerializer.getEntry(descriptionEn));
        }
        if (descriptionSource != null) {
            joiner.add("descriptionSource: " + GraphQLRequestSerializer.getEntry(descriptionSource));
        }
        if (descriptionSourceEn != null) {
            joiner.add("descriptionSourceEn: " + GraphQLRequestSerializer.getEntry(descriptionSourceEn));
        }
        joiner.add("favoriteCharactersCount: " + GraphQLRequestSerializer.getEntry(favoriteCharactersCount));
        if (height != null) {
            joiner.add("height: " + GraphQLRequestSerializer.getEntry(height));
        }
        if (heightEn != null) {
            joiner.add("heightEn: " + GraphQLRequestSerializer.getEntry(heightEn));
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
        if (nationality != null) {
            joiner.add("nationality: " + GraphQLRequestSerializer.getEntry(nationality));
        }
        if (nationalityEn != null) {
            joiner.add("nationalityEn: " + GraphQLRequestSerializer.getEntry(nationalityEn));
        }
        if (nickname != null) {
            joiner.add("nickname: " + GraphQLRequestSerializer.getEntry(nickname));
        }
        if (nicknameEn != null) {
            joiner.add("nicknameEn: " + GraphQLRequestSerializer.getEntry(nicknameEn));
        }
        if (occupation != null) {
            joiner.add("occupation: " + GraphQLRequestSerializer.getEntry(occupation));
        }
        if (occupationEn != null) {
            joiner.add("occupationEn: " + GraphQLRequestSerializer.getEntry(occupationEn));
        }
        if (series != null) {
            joiner.add("series: " + GraphQLRequestSerializer.getEntry(series));
        }
        if (weight != null) {
            joiner.add("weight: " + GraphQLRequestSerializer.getEntry(weight));
        }
        if (weightEn != null) {
            joiner.add("weightEn: " + GraphQLRequestSerializer.getEntry(weightEn));
        }
        return joiner.toString();
    }

    public static Character.Builder builder() {
        return new Character.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T02:10:38+0900"
    )
    public static class Builder {

        private String age;
        private String ageEn;
        private int annictId;
        private String birthday;
        private String birthdayEn;
        private String bloodType;
        private String bloodTypeEn;
        private String description;
        private String descriptionEn;
        private String descriptionSource;
        private String descriptionSourceEn;
        private int favoriteCharactersCount;
        private String height;
        private String heightEn;
        private String id;
        private String name;
        private String nameEn;
        private String nameKana;
        private String nationality;
        private String nationalityEn;
        private String nickname;
        private String nicknameEn;
        private String occupation;
        private String occupationEn;
        private Series series;
        private String weight;
        private String weightEn;

        public Builder() {
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Builder setAgeEn(String ageEn) {
            this.ageEn = ageEn;
            return this;
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        public Builder setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder setBirthdayEn(String birthdayEn) {
            this.birthdayEn = birthdayEn;
            return this;
        }

        public Builder setBloodType(String bloodType) {
            this.bloodType = bloodType;
            return this;
        }

        public Builder setBloodTypeEn(String bloodTypeEn) {
            this.bloodTypeEn = bloodTypeEn;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }

        public Builder setDescriptionSource(String descriptionSource) {
            this.descriptionSource = descriptionSource;
            return this;
        }

        public Builder setDescriptionSourceEn(String descriptionSourceEn) {
            this.descriptionSourceEn = descriptionSourceEn;
            return this;
        }

        public Builder setFavoriteCharactersCount(int favoriteCharactersCount) {
            this.favoriteCharactersCount = favoriteCharactersCount;
            return this;
        }

        public Builder setHeight(String height) {
            this.height = height;
            return this;
        }

        public Builder setHeightEn(String heightEn) {
            this.heightEn = heightEn;
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

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder setNationalityEn(String nationalityEn) {
            this.nationalityEn = nationalityEn;
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

        public Builder setOccupation(String occupation) {
            this.occupation = occupation;
            return this;
        }

        public Builder setOccupationEn(String occupationEn) {
            this.occupationEn = occupationEn;
            return this;
        }

        public Builder setSeries(Series series) {
            this.series = series;
            return this;
        }

        public Builder setWeight(String weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWeightEn(String weightEn) {
            this.weightEn = weightEn;
            return this;
        }


        public Character build() {
            return new Character(age, ageEn, annictId, birthday, birthdayEn, bloodType, bloodTypeEn, description, descriptionEn, descriptionSource, descriptionSourceEn, favoriteCharactersCount, height, heightEn, id, name, nameEn, nameKana, nationality, nationalityEn, nickname, nicknameEn, occupation, occupationEn, series, weight, weightEn);
        }

    }
}
