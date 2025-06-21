package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Node
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class NodeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public NodeResponseProjection() {
    }

    public NodeResponseProjection(NodeResponseProjection projection) {
        super(projection);
    }

    public NodeResponseProjection(List<NodeResponseProjection> projections) {
        super(projections);
    }

    public NodeResponseProjection all$() {
        return all$(3);
    }

    public NodeResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.StatusResponseProjection.onStatus", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.StatusResponseProjection.onStatus", projectionDepthOnFields.getOrDefault("NodeResponseProjection.StatusResponseProjection.onStatus", 0) + 1);
            this.onStatus(new StatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.StatusResponseProjection.onStatus", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.CastResponseProjection.onCast", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.CastResponseProjection.onCast", projectionDepthOnFields.getOrDefault("NodeResponseProjection.CastResponseProjection.onCast", 0) + 1);
            this.onCast(new CastResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.CastResponseProjection.onCast", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.ProgramResponseProjection.onProgram", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.ProgramResponseProjection.onProgram", projectionDepthOnFields.getOrDefault("NodeResponseProjection.ProgramResponseProjection.onProgram", 0) + 1);
            this.onProgram(new ProgramResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.ProgramResponseProjection.onProgram", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.UserResponseProjection.onUser", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.UserResponseProjection.onUser", projectionDepthOnFields.getOrDefault("NodeResponseProjection.UserResponseProjection.onUser", 0) + 1);
            this.onUser(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.UserResponseProjection.onUser", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.OrganizationResponseProjection.onOrganization", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.OrganizationResponseProjection.onOrganization", projectionDepthOnFields.getOrDefault("NodeResponseProjection.OrganizationResponseProjection.onOrganization", 0) + 1);
            this.onOrganization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.OrganizationResponseProjection.onOrganization", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.LibraryEntryResponseProjection.onLibraryEntry", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.LibraryEntryResponseProjection.onLibraryEntry", projectionDepthOnFields.getOrDefault("NodeResponseProjection.LibraryEntryResponseProjection.onLibraryEntry", 0) + 1);
            this.onLibraryEntry(new LibraryEntryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.LibraryEntryResponseProjection.onLibraryEntry", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.CharacterResponseProjection.onCharacter", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.CharacterResponseProjection.onCharacter", projectionDepthOnFields.getOrDefault("NodeResponseProjection.CharacterResponseProjection.onCharacter", 0) + 1);
            this.onCharacter(new CharacterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.CharacterResponseProjection.onCharacter", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.StaffResponseProjection.onStaff", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.StaffResponseProjection.onStaff", projectionDepthOnFields.getOrDefault("NodeResponseProjection.StaffResponseProjection.onStaff", 0) + 1);
            this.onStaff(new StaffResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.StaffResponseProjection.onStaff", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.ChannelResponseProjection.onChannel", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.ChannelResponseProjection.onChannel", projectionDepthOnFields.getOrDefault("NodeResponseProjection.ChannelResponseProjection.onChannel", 0) + 1);
            this.onChannel(new ChannelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.ChannelResponseProjection.onChannel", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.ActivityResponseProjection.onActivity", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.ActivityResponseProjection.onActivity", projectionDepthOnFields.getOrDefault("NodeResponseProjection.ActivityResponseProjection.onActivity", 0) + 1);
            this.onActivity(new ActivityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.ActivityResponseProjection.onActivity", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.ReviewResponseProjection.onReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.ReviewResponseProjection.onReview", projectionDepthOnFields.getOrDefault("NodeResponseProjection.ReviewResponseProjection.onReview", 0) + 1);
            this.onReview(new ReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.ReviewResponseProjection.onReview", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.SeriesResponseProjection.onSeries", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.SeriesResponseProjection.onSeries", projectionDepthOnFields.getOrDefault("NodeResponseProjection.SeriesResponseProjection.onSeries", 0) + 1);
            this.onSeries(new SeriesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.SeriesResponseProjection.onSeries", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.EpisodeResponseProjection.onEpisode", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.EpisodeResponseProjection.onEpisode", projectionDepthOnFields.getOrDefault("NodeResponseProjection.EpisodeResponseProjection.onEpisode", 0) + 1);
            this.onEpisode(new EpisodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.EpisodeResponseProjection.onEpisode", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.WorkImageResponseProjection.onWorkImage", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.WorkImageResponseProjection.onWorkImage", projectionDepthOnFields.getOrDefault("NodeResponseProjection.WorkImageResponseProjection.onWorkImage", 0) + 1);
            this.onWorkImage(new WorkImageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.WorkImageResponseProjection.onWorkImage", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.PrefectureResponseProjection.onPrefecture", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.PrefectureResponseProjection.onPrefecture", projectionDepthOnFields.getOrDefault("NodeResponseProjection.PrefectureResponseProjection.onPrefecture", 0) + 1);
            this.onPrefecture(new PrefectureResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.PrefectureResponseProjection.onPrefecture", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.WorkResponseProjection.onWork", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.WorkResponseProjection.onWork", projectionDepthOnFields.getOrDefault("NodeResponseProjection.WorkResponseProjection.onWork", 0) + 1);
            this.onWork(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.WorkResponseProjection.onWork", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.MultipleRecordResponseProjection.onMultipleRecord", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.MultipleRecordResponseProjection.onMultipleRecord", projectionDepthOnFields.getOrDefault("NodeResponseProjection.MultipleRecordResponseProjection.onMultipleRecord", 0) + 1);
            this.onMultipleRecord(new MultipleRecordResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.MultipleRecordResponseProjection.onMultipleRecord", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.RecordResponseProjection.onRecord", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.RecordResponseProjection.onRecord", projectionDepthOnFields.getOrDefault("NodeResponseProjection.RecordResponseProjection.onRecord", 0) + 1);
            this.onRecord(new RecordResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.RecordResponseProjection.onRecord", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.PersonResponseProjection.onPerson", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.PersonResponseProjection.onPerson", projectionDepthOnFields.getOrDefault("NodeResponseProjection.PersonResponseProjection.onPerson", 0) + 1);
            this.onPerson(new PersonResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.PersonResponseProjection.onPerson", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NodeResponseProjection.ChannelGroupResponseProjection.onChannelGroup", 0) <= maxDepth) {
            projectionDepthOnFields.put("NodeResponseProjection.ChannelGroupResponseProjection.onChannelGroup", projectionDepthOnFields.getOrDefault("NodeResponseProjection.ChannelGroupResponseProjection.onChannelGroup", 0) + 1);
            this.onChannelGroup(new ChannelGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NodeResponseProjection.ChannelGroupResponseProjection.onChannelGroup", 0)));
        }
        this.typename();
        return this;
    }

    public NodeResponseProjection id() {
        return id(null);
    }

    public NodeResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NodeResponseProjection onStatus(StatusResponseProjection subProjection) {
        return onStatus(null, subProjection);
    }

    public NodeResponseProjection onStatus(String alias, StatusResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Status").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCast(CastResponseProjection subProjection) {
        return onCast(null, subProjection);
    }

    public NodeResponseProjection onCast(String alias, CastResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Cast").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onProgram(ProgramResponseProjection subProjection) {
        return onProgram(null, subProjection);
    }

    public NodeResponseProjection onProgram(String alias, ProgramResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Program").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public NodeResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public NodeResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onLibraryEntry(LibraryEntryResponseProjection subProjection) {
        return onLibraryEntry(null, subProjection);
    }

    public NodeResponseProjection onLibraryEntry(String alias, LibraryEntryResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on LibraryEntry").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCharacter(CharacterResponseProjection subProjection) {
        return onCharacter(null, subProjection);
    }

    public NodeResponseProjection onCharacter(String alias, CharacterResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Character").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onStaff(StaffResponseProjection subProjection) {
        return onStaff(null, subProjection);
    }

    public NodeResponseProjection onStaff(String alias, StaffResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Staff").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onChannel(ChannelResponseProjection subProjection) {
        return onChannel(null, subProjection);
    }

    public NodeResponseProjection onChannel(String alias, ChannelResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Channel").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onActivity(ActivityResponseProjection subProjection) {
        return onActivity(null, subProjection);
    }

    public NodeResponseProjection onActivity(String alias, ActivityResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Activity").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReview(ReviewResponseProjection subProjection) {
        return onReview(null, subProjection);
    }

    public NodeResponseProjection onReview(String alias, ReviewResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Review").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSeries(SeriesResponseProjection subProjection) {
        return onSeries(null, subProjection);
    }

    public NodeResponseProjection onSeries(String alias, SeriesResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Series").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onEpisode(EpisodeResponseProjection subProjection) {
        return onEpisode(null, subProjection);
    }

    public NodeResponseProjection onEpisode(String alias, EpisodeResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Episode").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onWorkImage(WorkImageResponseProjection subProjection) {
        return onWorkImage(null, subProjection);
    }

    public NodeResponseProjection onWorkImage(String alias, WorkImageResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on WorkImage").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPrefecture(PrefectureResponseProjection subProjection) {
        return onPrefecture(null, subProjection);
    }

    public NodeResponseProjection onPrefecture(String alias, PrefectureResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Prefecture").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onWork(WorkResponseProjection subProjection) {
        return onWork(null, subProjection);
    }

    public NodeResponseProjection onWork(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Work").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onMultipleRecord(MultipleRecordResponseProjection subProjection) {
        return onMultipleRecord(null, subProjection);
    }

    public NodeResponseProjection onMultipleRecord(String alias, MultipleRecordResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on MultipleRecord").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRecord(RecordResponseProjection subProjection) {
        return onRecord(null, subProjection);
    }

    public NodeResponseProjection onRecord(String alias, RecordResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Record").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPerson(PersonResponseProjection subProjection) {
        return onPerson(null, subProjection);
    }

    public NodeResponseProjection onPerson(String alias, PersonResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on Person").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onChannelGroup(ChannelGroupResponseProjection subProjection) {
        return onChannelGroup(null, subProjection);
    }

    public NodeResponseProjection onChannelGroup(String alias, ChannelGroupResponseProjection subProjection) {
        add$(new GraphQLResponseField("...on ChannelGroup").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection typename() {
        return typename(null);
    }

    public NodeResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public NodeResponseProjection deepCopy$() {
        return new NodeResponseProjection(this);
    }


}
