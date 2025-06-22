package annict.sample.batch.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestClient;
import annict.sample.batch.contant.AuthConstants;

@Configuration
public class RestConfig {

    @Value("${annict.graphql.access-token}")
    private String accessToken;

    @Bean
    RestClient restClient() {
        return RestClient.builder()
                .defaultHeader(HttpHeaders.AUTHORIZATION, AuthConstants.BEARER_PREFIX + accessToken)
                .build();
    }
}
