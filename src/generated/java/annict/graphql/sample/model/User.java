package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

public class User implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    private ActivityConnection activities;
    private int annictId;
    private String avatarUrl;
    private String backgroundImageUrl;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime createdAt;
    @jakarta.validation.constraints.NotNull
    private String description;
    private String email;
    private UserConnection followers;
    private int followersCount;
    private UserConnection following;
    private ActivityConnection followingActivities;
    private int followingsCount;
    @jakarta.validation.constraints.NotNull
    private String id;
    private LibraryEntryConnection libraryEntries;
    @jakarta.validation.constraints.NotNull
    private String name;
    private Integer notificationsCount;
    private int onHoldCount;
    private ProgramConnection programs;
    private RecordConnection records;
    private int recordsCount;
    private int stopWatchingCount;
    private String url;
    @jakarta.validation.constraints.NotNull
    private String username;
    private boolean viewerCanFollow;
    private boolean viewerIsFollowing;
    private int wannaWatchCount;
    private int watchedCount;
    private int watchingCount;
    private WorkConnection works;

    public User() {
    }

    public User(ActivityConnection activities, int annictId, String avatarUrl, String backgroundImageUrl, java.time.OffsetDateTime createdAt, String description, String email, UserConnection followers, int followersCount, UserConnection following, ActivityConnection followingActivities, int followingsCount, String id, LibraryEntryConnection libraryEntries, String name, Integer notificationsCount, int onHoldCount, ProgramConnection programs, RecordConnection records, int recordsCount, int stopWatchingCount, String url, String username, boolean viewerCanFollow, boolean viewerIsFollowing, int wannaWatchCount, int watchedCount, int watchingCount, WorkConnection works) {
        this.activities = activities;
        this.annictId = annictId;
        this.avatarUrl = avatarUrl;
        this.backgroundImageUrl = backgroundImageUrl;
        this.createdAt = createdAt;
        this.description = description;
        this.email = email;
        this.followers = followers;
        this.followersCount = followersCount;
        this.following = following;
        this.followingActivities = followingActivities;
        this.followingsCount = followingsCount;
        this.id = id;
        this.libraryEntries = libraryEntries;
        this.name = name;
        this.notificationsCount = notificationsCount;
        this.onHoldCount = onHoldCount;
        this.programs = programs;
        this.records = records;
        this.recordsCount = recordsCount;
        this.stopWatchingCount = stopWatchingCount;
        this.url = url;
        this.username = username;
        this.viewerCanFollow = viewerCanFollow;
        this.viewerIsFollowing = viewerIsFollowing;
        this.wannaWatchCount = wannaWatchCount;
        this.watchedCount = watchedCount;
        this.watchingCount = watchingCount;
        this.works = works;
    }

    public ActivityConnection getActivities() {
        return activities;
    }
    public void setActivities(ActivityConnection activities) {
        this.activities = activities;
    }

    public int getAnnictId() {
        return annictId;
    }
    public void setAnnictId(int annictId) {
        this.annictId = annictId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBackgroundImageUrl() {
        return backgroundImageUrl;
    }
    public void setBackgroundImageUrl(String backgroundImageUrl) {
        this.backgroundImageUrl = backgroundImageUrl;
    }

    public java.time.OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public UserConnection getFollowers() {
        return followers;
    }
    public void setFollowers(UserConnection followers) {
        this.followers = followers;
    }

    public int getFollowersCount() {
        return followersCount;
    }
    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public UserConnection getFollowing() {
        return following;
    }
    public void setFollowing(UserConnection following) {
        this.following = following;
    }

    public ActivityConnection getFollowingActivities() {
        return followingActivities;
    }
    public void setFollowingActivities(ActivityConnection followingActivities) {
        this.followingActivities = followingActivities;
    }

    public int getFollowingsCount() {
        return followingsCount;
    }
    public void setFollowingsCount(int followingsCount) {
        this.followingsCount = followingsCount;
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

    public LibraryEntryConnection getLibraryEntries() {
        return libraryEntries;
    }
    public void setLibraryEntries(LibraryEntryConnection libraryEntries) {
        this.libraryEntries = libraryEntries;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getNotificationsCount() {
        return notificationsCount;
    }
    public void setNotificationsCount(Integer notificationsCount) {
        this.notificationsCount = notificationsCount;
    }

    public int getOnHoldCount() {
        return onHoldCount;
    }
    public void setOnHoldCount(int onHoldCount) {
        this.onHoldCount = onHoldCount;
    }

    public ProgramConnection getPrograms() {
        return programs;
    }
    public void setPrograms(ProgramConnection programs) {
        this.programs = programs;
    }

    public RecordConnection getRecords() {
        return records;
    }
    public void setRecords(RecordConnection records) {
        this.records = records;
    }

    public int getRecordsCount() {
        return recordsCount;
    }
    public void setRecordsCount(int recordsCount) {
        this.recordsCount = recordsCount;
    }

    public int getStopWatchingCount() {
        return stopWatchingCount;
    }
    public void setStopWatchingCount(int stopWatchingCount) {
        this.stopWatchingCount = stopWatchingCount;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public boolean getViewerCanFollow() {
        return viewerCanFollow;
    }
    public void setViewerCanFollow(boolean viewerCanFollow) {
        this.viewerCanFollow = viewerCanFollow;
    }

    public boolean getViewerIsFollowing() {
        return viewerIsFollowing;
    }
    public void setViewerIsFollowing(boolean viewerIsFollowing) {
        this.viewerIsFollowing = viewerIsFollowing;
    }

    public int getWannaWatchCount() {
        return wannaWatchCount;
    }
    public void setWannaWatchCount(int wannaWatchCount) {
        this.wannaWatchCount = wannaWatchCount;
    }

    public int getWatchedCount() {
        return watchedCount;
    }
    public void setWatchedCount(int watchedCount) {
        this.watchedCount = watchedCount;
    }

    public int getWatchingCount() {
        return watchingCount;
    }
    public void setWatchingCount(int watchingCount) {
        this.watchingCount = watchingCount;
    }

    public WorkConnection getWorks() {
        return works;
    }
    public void setWorks(WorkConnection works) {
        this.works = works;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (activities != null) {
            joiner.add("activities: " + GraphQLRequestSerializer.getEntry(activities));
        }
        joiner.add("annictId: " + GraphQLRequestSerializer.getEntry(annictId));
        if (avatarUrl != null) {
            joiner.add("avatarUrl: " + GraphQLRequestSerializer.getEntry(avatarUrl));
        }
        if (backgroundImageUrl != null) {
            joiner.add("backgroundImageUrl: " + GraphQLRequestSerializer.getEntry(backgroundImageUrl));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (followers != null) {
            joiner.add("followers: " + GraphQLRequestSerializer.getEntry(followers));
        }
        joiner.add("followersCount: " + GraphQLRequestSerializer.getEntry(followersCount));
        if (following != null) {
            joiner.add("following: " + GraphQLRequestSerializer.getEntry(following));
        }
        if (followingActivities != null) {
            joiner.add("followingActivities: " + GraphQLRequestSerializer.getEntry(followingActivities));
        }
        joiner.add("followingsCount: " + GraphQLRequestSerializer.getEntry(followingsCount));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (libraryEntries != null) {
            joiner.add("libraryEntries: " + GraphQLRequestSerializer.getEntry(libraryEntries));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (notificationsCount != null) {
            joiner.add("notificationsCount: " + GraphQLRequestSerializer.getEntry(notificationsCount));
        }
        joiner.add("onHoldCount: " + GraphQLRequestSerializer.getEntry(onHoldCount));
        if (programs != null) {
            joiner.add("programs: " + GraphQLRequestSerializer.getEntry(programs));
        }
        if (records != null) {
            joiner.add("records: " + GraphQLRequestSerializer.getEntry(records));
        }
        joiner.add("recordsCount: " + GraphQLRequestSerializer.getEntry(recordsCount));
        joiner.add("stopWatchingCount: " + GraphQLRequestSerializer.getEntry(stopWatchingCount));
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        if (username != null) {
            joiner.add("username: " + GraphQLRequestSerializer.getEntry(username));
        }
        joiner.add("viewerCanFollow: " + GraphQLRequestSerializer.getEntry(viewerCanFollow));
        joiner.add("viewerIsFollowing: " + GraphQLRequestSerializer.getEntry(viewerIsFollowing));
        joiner.add("wannaWatchCount: " + GraphQLRequestSerializer.getEntry(wannaWatchCount));
        joiner.add("watchedCount: " + GraphQLRequestSerializer.getEntry(watchedCount));
        joiner.add("watchingCount: " + GraphQLRequestSerializer.getEntry(watchingCount));
        if (works != null) {
            joiner.add("works: " + GraphQLRequestSerializer.getEntry(works));
        }
        return joiner.toString();
    }

    public static User.Builder builder() {
        return new User.Builder();
    }

    public static class Builder {

        private ActivityConnection activities;
        private int annictId;
        private String avatarUrl;
        private String backgroundImageUrl;
        private java.time.OffsetDateTime createdAt;
        private String description;
        private String email;
        private UserConnection followers;
        private int followersCount;
        private UserConnection following;
        private ActivityConnection followingActivities;
        private int followingsCount;
        private String id;
        private LibraryEntryConnection libraryEntries;
        private String name;
        private Integer notificationsCount;
        private int onHoldCount;
        private ProgramConnection programs;
        private RecordConnection records;
        private int recordsCount;
        private int stopWatchingCount;
        private String url;
        private String username;
        private boolean viewerCanFollow;
        private boolean viewerIsFollowing;
        private int wannaWatchCount;
        private int watchedCount;
        private int watchingCount;
        private WorkConnection works;

        public Builder() {
        }

        public Builder setActivities(ActivityConnection activities) {
            this.activities = activities;
            return this;
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        public Builder setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        public Builder setBackgroundImageUrl(String backgroundImageUrl) {
            this.backgroundImageUrl = backgroundImageUrl;
            return this;
        }

        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setFollowers(UserConnection followers) {
            this.followers = followers;
            return this;
        }

        public Builder setFollowersCount(int followersCount) {
            this.followersCount = followersCount;
            return this;
        }

        public Builder setFollowing(UserConnection following) {
            this.following = following;
            return this;
        }

        public Builder setFollowingActivities(ActivityConnection followingActivities) {
            this.followingActivities = followingActivities;
            return this;
        }

        public Builder setFollowingsCount(int followingsCount) {
            this.followingsCount = followingsCount;
            return this;
        }

        /**
         * ID of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLibraryEntries(LibraryEntryConnection libraryEntries) {
            this.libraryEntries = libraryEntries;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNotificationsCount(Integer notificationsCount) {
            this.notificationsCount = notificationsCount;
            return this;
        }

        public Builder setOnHoldCount(int onHoldCount) {
            this.onHoldCount = onHoldCount;
            return this;
        }

        public Builder setPrograms(ProgramConnection programs) {
            this.programs = programs;
            return this;
        }

        public Builder setRecords(RecordConnection records) {
            this.records = records;
            return this;
        }

        public Builder setRecordsCount(int recordsCount) {
            this.recordsCount = recordsCount;
            return this;
        }

        public Builder setStopWatchingCount(int stopWatchingCount) {
            this.stopWatchingCount = stopWatchingCount;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setViewerCanFollow(boolean viewerCanFollow) {
            this.viewerCanFollow = viewerCanFollow;
            return this;
        }

        public Builder setViewerIsFollowing(boolean viewerIsFollowing) {
            this.viewerIsFollowing = viewerIsFollowing;
            return this;
        }

        public Builder setWannaWatchCount(int wannaWatchCount) {
            this.wannaWatchCount = wannaWatchCount;
            return this;
        }

        public Builder setWatchedCount(int watchedCount) {
            this.watchedCount = watchedCount;
            return this;
        }

        public Builder setWatchingCount(int watchingCount) {
            this.watchingCount = watchingCount;
            return this;
        }

        public Builder setWorks(WorkConnection works) {
            this.works = works;
            return this;
        }


        public User build() {
            return new User(activities, annictId, avatarUrl, backgroundImageUrl, createdAt, description, email, followers, followersCount, following, followingActivities, followingsCount, id, libraryEntries, name, notificationsCount, onHoldCount, programs, records, recordsCount, stopWatchingCount, url, username, viewerCanFollow, viewerIsFollowing, wannaWatchCount, watchedCount, watchingCount, works);
        }

    }
}
