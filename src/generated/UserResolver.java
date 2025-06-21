import annict.graphql.sample.model.*;

/**
 * Resolver for User
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public interface UserResolver {

    ActivityConnection activities(User user, String after, String before, Integer first, Integer last, ActivityOrder orderBy) throws Exception;

    UserConnection followers(User user, String after, String before, Integer first, Integer last) throws Exception;

    UserConnection following(User user, String after, String before, Integer first, Integer last) throws Exception;

    ActivityConnection followingActivities(User user, String after, String before, Integer first, Integer last, ActivityOrder orderBy) throws Exception;

    LibraryEntryConnection libraryEntries(User user, String after, String before, Integer first, Integer last, LibraryEntryOrder orderBy, String seasonFrom, String seasonUntil, java.util.List<String> seasons, java.util.List<StatusState> states) throws Exception;

    ProgramConnection programs(User user, String after, String before, Integer first, Integer last, ProgramOrder orderBy, Boolean unwatched) throws Exception;

    RecordConnection records(User user, String after, String before, Integer first, Boolean hasComment, Integer last, RecordOrder orderBy) throws Exception;

    WorkConnection works(User user, String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, WorkOrder orderBy, java.util.List<String> seasons, StatusState state, java.util.List<String> titles) throws Exception;

}
