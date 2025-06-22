package annict.sample.batch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import annict.sample.batch.service.ValidationService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
@StepScope
public class ValidationTasklet implements Tasklet {

    private final ValidationService validationService;

    @Value("#{jobParameters['season']}")
    private String season;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext)
            throws Exception {
        validationService.validateSeason(season);
        return RepeatStatus.FINISHED;
    }

}
