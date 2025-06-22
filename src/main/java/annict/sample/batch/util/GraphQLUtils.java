package annict.sample.batch.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Component
@Slf4j
public class GraphQLUtils {

    private final RestClient restClient;

    @Value("${annict.graphql.endpoint}")
    private String endpoint;

    public <T extends GraphQLResult<?>> T sendRequest(
            GraphQLRequest request, Class<T> responseType) {
        String body = request.toHttpJsonBody();
        log.info("request body: {}", body);
        return restClient
                .post()
                .uri(endpoint)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(body)
                .retrieve()
                .body(responseType);
    }
}
