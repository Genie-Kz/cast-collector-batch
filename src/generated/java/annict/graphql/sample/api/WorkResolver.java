package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Resolver for Work
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public interface WorkResolver {

    CastConnection casts(Work work, String after, String before, Integer first, Integer last, CastOrder orderBy) throws Exception;

    EpisodeConnection episodes(Work work, String after, String before, Integer first, Integer last, EpisodeOrder orderBy) throws Exception;

    ProgramConnection programs(Work work, String after, String before, Integer first, Integer last, ProgramOrder orderBy) throws Exception;

    ReviewConnection reviews(Work work, String after, String before, Integer first, Boolean hasBody, Integer last, ReviewOrder orderBy) throws Exception;

    SeriesConnection seriesList(Work work, String after, String before, Integer first, Integer last) throws Exception;

    StaffConnection staffs(Work work, String after, String before, Integer first, Integer last, StaffOrder orderBy) throws Exception;

}
