package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

/**
 * Resolver for MultipleRecord
 */
public interface MultipleRecordResolver {

    RecordConnection records(MultipleRecord multipleRecord, String after, String before, Integer first, Integer last) throws Exception;

}
