package annict.sample.batch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import annict.sample.batch.service.AnnictService;
import annict.sample.batch.service.WorkCastBatchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Component
@StepScope
@Slf4j
public class AnnictDataProcessTasklet implements Tasklet {
    private final AnnictService annictService;
    private final WorkCastBatchService workCastBatchService;

    @Value("#{jobParameters['season']}")
    private String season;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
        try {
            var worksWithCastsModel = annictService.fetchWorksWithCastsModel(season);
            if (worksWithCastsModel == null || worksWithCastsModel.isEmpty()) {
                log.warn("No works found for season: {}", season);
                return RepeatStatus.FINISHED;
            }
            workCastBatchService.saveWorksAndCastsModel(worksWithCastsModel);
            log.info("Inserted {} works and {} casts", worksWithCastsModel.size(), worksWithCastsModel.stream().mapToInt(w -> w.casts().size()).sum());
        } catch (Exception e) {
            log.error("Batch tasklet failed for season {}", season, e);
            throw new RuntimeException("Batch tasklet failed", e);
        }
        return RepeatStatus.FINISHED;
    }
}