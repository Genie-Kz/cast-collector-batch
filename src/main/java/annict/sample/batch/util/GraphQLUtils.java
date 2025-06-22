package annict.sample.batch.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class GraphQLUtils {

    private final RestClient restClient;

    @Value("${graphql.annict.endpoint}")
    private String endpoint;

    public <T extends GraphQLResult<?>> T sendRequest(GraphQLRequest request,
            Class<T> responseType) {
        return restClient
                .post()
                .uri(endpoint)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(request.toHttpJsonBody())
                .retrieve()
                .body(responseType);
    }
}
