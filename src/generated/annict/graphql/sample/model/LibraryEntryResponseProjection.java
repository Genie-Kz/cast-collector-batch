package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for LibraryEntry
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public class LibraryEntryResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LibraryEntryResponseProjection() {
    }

    public LibraryEntryResponseProjection(LibraryEntryResponseProjection projection) {
        super(projection);
    }

    public LibraryEntryResponseProjection(List<LibraryEntryResponseProjection> projections) {
        super(projections);
    }

    public LibraryEntryResponseProjection all$() {
        return all$(3);
    }

    public LibraryEntryResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.EpisodeResponseProjection.nextEpisode", 0) <= maxDepth) {
            projectionDepthOnFields.put("LibraryEntryResponseProjection.EpisodeResponseProjection.nextEpisode", projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.EpisodeResponseProjection.nextEpisode", 0) + 1);
            this.nextEpisode(new EpisodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.EpisodeResponseProjection.nextEpisode", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.ProgramResponseProjection.nextProgram", 0) <= maxDepth) {
            projectionDepthOnFields.put("LibraryEntryResponseProjection.ProgramResponseProjection.nextProgram", projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.ProgramResponseProjection.nextProgram", 0) + 1);
            this.nextProgram(new ProgramResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.ProgramResponseProjection.nextProgram", 0)));
        }
        this.note();
        if (projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.StatusResponseProjection.status", 0) <= maxDepth) {
            projectionDepthOnFields.put("LibraryEntryResponseProjection.StatusResponseProjection.status", projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.StatusResponseProjection.status", 0) + 1);
            this.status(new StatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.StatusResponseProjection.status", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("LibraryEntryResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.UserResponseProjection.user", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.WorkResponseProjection.work", 0) <= maxDepth) {
            projectionDepthOnFields.put("LibraryEntryResponseProjection.WorkResponseProjection.work", projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.WorkResponseProjection.work", 0) + 1);
            this.work(new WorkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LibraryEntryResponseProjection.WorkResponseProjection.work", 0)));
        }
        this.typename();
        return this;
    }

    public LibraryEntryResponseProjection id() {
        return id(null);
    }

    public LibraryEntryResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LibraryEntryResponseProjection nextEpisode(EpisodeResponseProjection subProjection) {
        return nextEpisode(null, subProjection);
    }

    public LibraryEntryResponseProjection nextEpisode(String alias, EpisodeResponseProjection subProjection) {
        add$(new GraphQLResponseField("nextEpisode").alias(alias).projection(subProjection));
        return this;
    }

    public LibraryEntryResponseProjection nextProgram(ProgramResponseProjection subProjection) {
        return nextProgram(null, subProjection);
    }

    public LibraryEntryResponseProjection nextProgram(String alias, ProgramResponseProjection subProjection) {
        add$(new GraphQLResponseField("nextProgram").alias(alias).projection(subProjection));
        return this;
    }

    public LibraryEntryResponseProjection note() {
        return note(null);
    }

    public LibraryEntryResponseProjection note(String alias) {
        add$(new GraphQLResponseField("note").alias(alias));
        return this;
    }

    public LibraryEntryResponseProjection status(StatusResponseProjection subProjection) {
        return status(null, subProjection);
    }

    public LibraryEntryResponseProjection status(String alias, StatusResponseProjection subProjection) {
        add$(new GraphQLResponseField("status").alias(alias).projection(subProjection));
        return this;
    }

    public LibraryEntryResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public LibraryEntryResponseProjection user(String alias, UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public LibraryEntryResponseProjection work(WorkResponseProjection subProjection) {
        return work(null, subProjection);
    }

    public LibraryEntryResponseProjection work(String alias, WorkResponseProjection subProjection) {
        add$(new GraphQLResponseField("work").alias(alias).projection(subProjection));
        return this;
    }

    public LibraryEntryResponseProjection typename() {
        return typename(null);
    }

    public LibraryEntryResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public LibraryEntryResponseProjection deepCopy$() {
        return new LibraryEntryResponseProjection(this);
    }


}
