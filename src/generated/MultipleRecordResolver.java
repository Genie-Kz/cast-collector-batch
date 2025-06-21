import annict.graphql.sample.model.*;

/**
 * Resolver for MultipleRecord
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T01:49:37+0900"
)
public interface MultipleRecordResolver {

    RecordConnection records(MultipleRecord multipleRecord, String after, String before, Integer first, Integer last) throws Exception;

}
