package annict.sample.batch.model;

import java.io.Serializable;

public record CastModel(
    Integer annictId,
    String name,
    String nameEn,
    Integer workAnnictId
) implements Serializable {}
