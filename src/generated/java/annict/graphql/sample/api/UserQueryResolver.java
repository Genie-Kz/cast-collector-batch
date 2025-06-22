package annict.graphql.sample.api;

import annict.graphql.sample.model.*;

public interface UserQueryResolver {

    User user(@jakarta.validation.constraints.NotNull String username) throws Exception;

}
