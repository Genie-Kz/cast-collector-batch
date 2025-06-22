package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for User
 */
public class UserResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UserResponseProjection() {
    }

    public UserResponseProjection(UserResponseProjection projection) {
        super(projection);
    }

    public UserResponseProjection(List<UserResponseProjection> projections) {
        super(projections);
    }

    public UserResponseProjection all$() {
        return all$(3);
    }

    public UserResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ActivityConnectionResponseProjection.activities", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.ActivityConnectionResponseProjection.activities", projectionDepthOnFields.getOrDefault("UserResponseProjection.ActivityConnectionResponseProjection.activities", 0) + 1);
            this.activities(new ActivityConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ActivityConnectionResponseProjection.activities", 0)));
        }
        this.annictId();
        this.avatarUrl();
        this.backgroundImageUrl();
        this.createdAt();
        this.description();
        this.email();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.UserConnectionResponseProjection.followers", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.UserConnectionResponseProjection.followers", projectionDepthOnFields.getOrDefault("UserResponseProjection.UserConnectionResponseProjection.followers", 0) + 1);
            this.followers(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.UserConnectionResponseProjection.followers", 0)));
        }
        this.followersCount();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.UserConnectionResponseProjection.following", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.UserConnectionResponseProjection.following", projectionDepthOnFields.getOrDefault("UserResponseProjection.UserConnectionResponseProjection.following", 0) + 1);
            this.following(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.UserConnectionResponseProjection.following", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ActivityConnectionResponseProjection.followingActivities", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.ActivityConnectionResponseProjection.followingActivities", projectionDepthOnFields.getOrDefault("UserResponseProjection.ActivityConnectionResponseProjection.followingActivities", 0) + 1);
            this.followingActivities(new ActivityConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ActivityConnectionResponseProjection.followingActivities", 0)));
        }
        this.followingsCount();
        this.id();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.LibraryEntryConnectionResponseProjection.libraryEntries", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.LibraryEntryConnectionResponseProjection.libraryEntries", projectionDepthOnFields.getOrDefault("UserResponseProjection.LibraryEntryConnectionResponseProjection.libraryEntries", 0) + 1);
            this.libraryEntries(new LibraryEntryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.LibraryEntryConnectionResponseProjection.libraryEntries", 0)));
        }
        this.name();
        this.notificationsCount();
        this.onHoldCount();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ProgramConnectionResponseProjection.programs", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.ProgramConnectionResponseProjection.programs", projectionDepthOnFields.getOrDefault("UserResponseProjection.ProgramConnectionResponseProjection.programs", 0) + 1);
            this.programs(new ProgramConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ProgramConnectionResponseProjection.programs", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RecordConnectionResponseProjection.records", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RecordConnectionResponseProjection.records", projectionDepthOnFields.getOrDefault("UserResponseProjection.RecordConnectionResponseProjection.records", 0) + 1);
            this.records(new RecordConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RecordConnectionResponseProjection.records", 0)));
        }
        this.recordsCount();
        this.stopWatchingCount();
        this.url();
        this.username();
        this.viewerCanFollow();
        this.viewerIsFollowing();
        this.wannaWatchCount();
        this.watchedCount();
        this.watchingCount();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.WorkConnectionResponseProjection.works", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.WorkConnectionResponseProjection.works", projectionDepthOnFields.getOrDefault("UserResponseProjection.WorkConnectionResponseProjection.works", 0) + 1);
            this.works(new WorkConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.WorkConnectionResponseProjection.works", 0)));
        }
        this.typename();
        return this;
    }

    public UserResponseProjection activities(ActivityConnectionResponseProjection subProjection) {
        return activities((String)null, subProjection);
    }

    public UserResponseProjection activities(String alias, ActivityConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("activities").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection activities(UserActivitiesParametrizedInput input, ActivityConnectionResponseProjection subProjection) {
        return activities(null, input, subProjection);
    }

    public UserResponseProjection activities(String alias, UserActivitiesParametrizedInput input, ActivityConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("activities").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection annictId() {
        return annictId(null);
    }

    public UserResponseProjection annictId(String alias) {
        add$(new GraphQLResponseField("annictId").alias(alias));
        return this;
    }

    public UserResponseProjection avatarUrl() {
        return avatarUrl(null);
    }

    public UserResponseProjection avatarUrl(String alias) {
        add$(new GraphQLResponseField("avatarUrl").alias(alias));
        return this;
    }

    public UserResponseProjection backgroundImageUrl() {
        return backgroundImageUrl(null);
    }

    public UserResponseProjection backgroundImageUrl(String alias) {
        add$(new GraphQLResponseField("backgroundImageUrl").alias(alias));
        return this;
    }

    public UserResponseProjection createdAt() {
        return createdAt(null);
    }

    public UserResponseProjection createdAt(String alias) {
        add$(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UserResponseProjection description() {
        return description(null);
    }

    public UserResponseProjection description(String alias) {
        add$(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public UserResponseProjection email() {
        return email(null);
    }

    public UserResponseProjection email(String alias) {
        add$(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public UserResponseProjection followers(UserConnectionResponseProjection subProjection) {
        return followers((String)null, subProjection);
    }

    public UserResponseProjection followers(String alias, UserConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("followers").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection followers(UserFollowersParametrizedInput input, UserConnectionResponseProjection subProjection) {
        return followers(null, input, subProjection);
    }

    public UserResponseProjection followers(String alias, UserFollowersParametrizedInput input, UserConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("followers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection followersCount() {
        return followersCount(null);
    }

    public UserResponseProjection followersCount(String alias) {
        add$(new GraphQLResponseField("followersCount").alias(alias));
        return this;
    }

    public UserResponseProjection following(UserConnectionResponseProjection subProjection) {
        return following((String)null, subProjection);
    }

    public UserResponseProjection following(String alias, UserConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("following").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection following(UserFollowingParametrizedInput input, UserConnectionResponseProjection subProjection) {
        return following(null, input, subProjection);
    }

    public UserResponseProjection following(String alias, UserFollowingParametrizedInput input, UserConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("following").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection followingActivities(ActivityConnectionResponseProjection subProjection) {
        return followingActivities((String)null, subProjection);
    }

    public UserResponseProjection followingActivities(String alias, ActivityConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("followingActivities").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection followingActivities(UserFollowingActivitiesParametrizedInput input, ActivityConnectionResponseProjection subProjection) {
        return followingActivities(null, input, subProjection);
    }

    public UserResponseProjection followingActivities(String alias, UserFollowingActivitiesParametrizedInput input, ActivityConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("followingActivities").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection followingsCount() {
        return followingsCount(null);
    }

    public UserResponseProjection followingsCount(String alias) {
        add$(new GraphQLResponseField("followingsCount").alias(alias));
        return this;
    }

    public UserResponseProjection id() {
        return id(null);
    }

    public UserResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserResponseProjection libraryEntries(LibraryEntryConnectionResponseProjection subProjection) {
        return libraryEntries((String)null, subProjection);
    }

    public UserResponseProjection libraryEntries(String alias, LibraryEntryConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("libraryEntries").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection libraryEntries(UserLibraryEntriesParametrizedInput input, LibraryEntryConnectionResponseProjection subProjection) {
        return libraryEntries(null, input, subProjection);
    }

    public UserResponseProjection libraryEntries(String alias, UserLibraryEntriesParametrizedInput input, LibraryEntryConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("libraryEntries").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection name() {
        return name(null);
    }

    public UserResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public UserResponseProjection notificationsCount() {
        return notificationsCount(null);
    }

    public UserResponseProjection notificationsCount(String alias) {
        add$(new GraphQLResponseField("notificationsCount").alias(alias));
        return this;
    }

    public UserResponseProjection onHoldCount() {
        return onHoldCount(null);
    }

    public UserResponseProjection onHoldCount(String alias) {
        add$(new GraphQLResponseField("onHoldCount").alias(alias));
        return this;
    }

    public UserResponseProjection programs(ProgramConnectionResponseProjection subProjection) {
        return programs((String)null, subProjection);
    }

    public UserResponseProjection programs(String alias, ProgramConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("programs").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection programs(UserProgramsParametrizedInput input, ProgramConnectionResponseProjection subProjection) {
        return programs(null, input, subProjection);
    }

    public UserResponseProjection programs(String alias, UserProgramsParametrizedInput input, ProgramConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("programs").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection records(RecordConnectionResponseProjection subProjection) {
        return records((String)null, subProjection);
    }

    public UserResponseProjection records(String alias, RecordConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("records").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection records(UserRecordsParametrizedInput input, RecordConnectionResponseProjection subProjection) {
        return records(null, input, subProjection);
    }

    public UserResponseProjection records(String alias, UserRecordsParametrizedInput input, RecordConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("records").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection recordsCount() {
        return recordsCount(null);
    }

    public UserResponseProjection recordsCount(String alias) {
        add$(new GraphQLResponseField("recordsCount").alias(alias));
        return this;
    }

    public UserResponseProjection stopWatchingCount() {
        return stopWatchingCount(null);
    }

    public UserResponseProjection stopWatchingCount(String alias) {
        add$(new GraphQLResponseField("stopWatchingCount").alias(alias));
        return this;
    }

    public UserResponseProjection url() {
        return url(null);
    }

    public UserResponseProjection url(String alias) {
        add$(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public UserResponseProjection username() {
        return username(null);
    }

    public UserResponseProjection username(String alias) {
        add$(new GraphQLResponseField("username").alias(alias));
        return this;
    }

    public UserResponseProjection viewerCanFollow() {
        return viewerCanFollow(null);
    }

    public UserResponseProjection viewerCanFollow(String alias) {
        add$(new GraphQLResponseField("viewerCanFollow").alias(alias));
        return this;
    }

    public UserResponseProjection viewerIsFollowing() {
        return viewerIsFollowing(null);
    }

    public UserResponseProjection viewerIsFollowing(String alias) {
        add$(new GraphQLResponseField("viewerIsFollowing").alias(alias));
        return this;
    }

    public UserResponseProjection wannaWatchCount() {
        return wannaWatchCount(null);
    }

    public UserResponseProjection wannaWatchCount(String alias) {
        add$(new GraphQLResponseField("wannaWatchCount").alias(alias));
        return this;
    }

    public UserResponseProjection watchedCount() {
        return watchedCount(null);
    }

    public UserResponseProjection watchedCount(String alias) {
        add$(new GraphQLResponseField("watchedCount").alias(alias));
        return this;
    }

    public UserResponseProjection watchingCount() {
        return watchingCount(null);
    }

    public UserResponseProjection watchingCount(String alias) {
        add$(new GraphQLResponseField("watchingCount").alias(alias));
        return this;
    }

    public UserResponseProjection works(WorkConnectionResponseProjection subProjection) {
        return works((String)null, subProjection);
    }

    public UserResponseProjection works(String alias, WorkConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("works").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection works(UserWorksParametrizedInput input, WorkConnectionResponseProjection subProjection) {
        return works(null, input, subProjection);
    }

    public UserResponseProjection works(String alias, UserWorksParametrizedInput input, WorkConnectionResponseProjection subProjection) {
        add$(new GraphQLResponseField("works").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection typename() {
        return typename(null);
    }

    public UserResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public UserResponseProjection deepCopy$() {
        return new UserResponseProjection(this);
    }


}
