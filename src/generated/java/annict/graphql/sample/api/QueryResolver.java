package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface QueryResolver {

    /**
     * Fetches an object given its ID.
     */
    Node node(@jakarta.validation.constraints.NotNull String id) throws Exception;

    /**
     * Fetches a list of objects given a list of IDs.
     */
    @jakarta.validation.constraints.NotNull
    java.util.List<Node> nodes(@jakarta.validation.constraints.NotNull java.util.List<String> ids) throws Exception;

    CharacterConnection searchCharacters(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, java.util.List<String> names, CharacterOrder orderBy) throws Exception;

    EpisodeConnection searchEpisodes(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, EpisodeOrder orderBy) throws Exception;

    OrganizationConnection searchOrganizations(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, java.util.List<String> names, OrganizationOrder orderBy) throws Exception;

    PersonConnection searchPeople(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, java.util.List<String> names, PersonOrder orderBy) throws Exception;

    WorkConnection searchWorks(String after, java.util.List<Integer> annictIds, String before, Integer first, Integer last, WorkOrder orderBy, java.util.List<String> seasons, java.util.List<String> titles) throws Exception;

    User user(@jakarta.validation.constraints.NotNull String username) throws Exception;

    User viewer() throws Exception;

}
