package annict.sample.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import annict.sample.batch.listener.BatchJobListener;
import annict.sample.batch.listener.BatchStepListener;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BatchConfig {

    private final PlatformTransactionManager transactionManager;

    private final JobRepository jobRepository;

    @Bean
    public Job job(Step validationStep, Step fetchWorkWithCastStep,BatchJobListener jobListener) {
        return new JobBuilder("sampleJob", jobRepository)
                .listener(jobListener)
                .start(validationStep)
                .next(fetchWorkWithCastStep)
                .build();
    }

    @Bean
    public Step fetchWorkWithCastStep(Tasklet annictDataProcessTasklet, BatchStepListener stepListener) {
        return new StepBuilder("step1", jobRepository)
                .tasklet(annictDataProcessTasklet, transactionManager)
                .listener(stepListener)
                .allowStartIfComplete(true)
                .build();
    }

    @Bean Step validationStep(Tasklet validationTasklet, BatchStepListener stepListener) {
        return new StepBuilder("validationStep", jobRepository)
                .tasklet(validationTasklet, transactionManager)
                .listener(stepListener)
                .allowStartIfComplete(true)
                .build();
    }
}