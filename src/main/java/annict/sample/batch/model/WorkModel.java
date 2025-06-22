package annict.sample.batch.model;

import java.io.Serializable;

public record WorkModel(
    Integer annictId,
    String title,
    Integer watchersCount
) implements Serializable {}
