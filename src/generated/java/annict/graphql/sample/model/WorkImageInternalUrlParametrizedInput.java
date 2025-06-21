package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field internalUrl in type WorkImage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-06-22T02:10:38+0900"
)
public class WorkImageInternalUrlParametrizedInput implements GraphQLParametrizedInput {

    @jakarta.validation.constraints.NotNull
    private String size;

    public WorkImageInternalUrlParametrizedInput() {
    }

    public WorkImageInternalUrlParametrizedInput(String size) {
        this.size = size;
    }

    public WorkImageInternalUrlParametrizedInput size(String size) {
        this.size = size;
        return this;
    }

    @Override
    public WorkImageInternalUrlParametrizedInput deepCopy() {
        WorkImageInternalUrlParametrizedInput parametrizedInput = new WorkImageInternalUrlParametrizedInput();
        parametrizedInput.size(this.size);
        return parametrizedInput;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        }
        return joiner.toString();
    }

}
