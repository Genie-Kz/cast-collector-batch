package annict.sample.batch.service;

import org.springframework.stereotype.Component;
import annict.sample.batch.exception.InvalidParameterException;

@Component
public class ValidationService {

    public void validateSeason(String season) {
        if (season == null || season.isEmpty()) {
            throw new InvalidParameterException("Season must not be null or empty");
        }

        if (!season.matches("^[0-9]{4}-(winter|spring|summer|autumn)$")) {
            throw new InvalidParameterException(
                    "Season format is invalid. Expected format: YYYY-Season Actual : %s"
                            .formatted(season));
        }
    }
}
