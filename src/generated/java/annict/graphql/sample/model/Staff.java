package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T12:59:00+0900"
)
public class Staff implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private String nameEn;
    @jakarta.validation.constraints.NotNull
    private StaffResourceItem resource;
    @jakarta.validation.constraints.NotNull
    private String roleOther;
    @jakarta.validation.constraints.NotNull
    private String roleOtherEn;
    @jakarta.validation.constraints.NotNull
    private String roleText;
    private int sortNumber;
    @jakarta.validation.constraints.NotNull
    private Work work;

    public Staff() {
    }

    public Staff(int annictId, String id, String name, String nameEn, StaffResourceItem resource, String roleOther, String roleOtherEn, String roleText, int sortNumber, Work work) {
        this.annictId = annictId;
        this.id = id;
        this.name = name;
        this.nameEn = nameEn;
        this.resource = resource;
        this.roleOther = roleOther;
        this.roleOtherEn = roleOtherEn;
        this.roleText = roleText;
        this.sortNumber = sortNumber;
        this.work = work;
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

    public StaffResourceItem getResource() {
        return resource;
    }
    public void setResource(StaffResourceItem resource) {
        this.resource = resource;
    }

    public String getRoleOther() {
        return roleOther;
    }
    public void setRoleOther(String roleOther) {
        this.roleOther = roleOther;
    }

    public String getRoleOtherEn() {
        return roleOtherEn;
    }
    public void setRoleOtherEn(String roleOtherEn) {
        this.roleOtherEn = roleOtherEn;
    }

    public String getRoleText() {
        return roleText;
    }
    public void setRoleText(String roleText) {
        this.roleText = roleText;
    }

    public int getSortNumber() {
        return sortNumber;
    }
    public void setSortNumber(int sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Work getWork() {
        return work;
    }
    public void setWork(Work work) {
        this.work = work;
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
        if (resource != null) {
            joiner.add("resource: " + GraphQLRequestSerializer.getEntry(resource));
        }
        if (roleOther != null) {
            joiner.add("roleOther: " + GraphQLRequestSerializer.getEntry(roleOther));
        }
        if (roleOtherEn != null) {
            joiner.add("roleOtherEn: " + GraphQLRequestSerializer.getEntry(roleOtherEn));
        }
        if (roleText != null) {
            joiner.add("roleText: " + GraphQLRequestSerializer.getEntry(roleText));
        }
        joiner.add("sortNumber: " + GraphQLRequestSerializer.getEntry(sortNumber));
        if (work != null) {
            joiner.add("work: " + GraphQLRequestSerializer.getEntry(work));
        }
        return joiner.toString();
    }

    public static Staff.Builder builder() {
        return new Staff.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-06-22T12:59:00+0900"
    )
    public static class Builder {

        private int annictId;
        private String id;
        private String name;
        private String nameEn;
        private StaffResourceItem resource;
        private String roleOther;
        private String roleOtherEn;
        private String roleText;
        private int sortNumber;
        private Work work;

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

        public Builder setResource(StaffResourceItem resource) {
            this.resource = resource;
            return this;
        }

        public Builder setRoleOther(String roleOther) {
            this.roleOther = roleOther;
            return this;
        }

        public Builder setRoleOtherEn(String roleOtherEn) {
            this.roleOtherEn = roleOtherEn;
            return this;
        }

        public Builder setRoleText(String roleText) {
            this.roleText = roleText;
            return this;
        }

        public Builder setSortNumber(int sortNumber) {
            this.sortNumber = sortNumber;
            return this;
        }

        public Builder setWork(Work work) {
            this.work = work;
            return this;
        }


        public Staff build() {
            return new Staff(annictId, id, name, nameEn, resource, roleOther, roleOtherEn, roleText, sortNumber, work);
        }

    }
}
