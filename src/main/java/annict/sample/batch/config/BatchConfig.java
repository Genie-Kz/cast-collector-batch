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
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BatchConfig {

    private final PlatformTransactionManager transactionManager;

    private final JobRepository jobRepository;

    @Bean
    public Job job(Step step) {
        return new JobBuilder("sampleJob", jobRepository)
                .start(step)
                .build();
    }

    @Bean
    public Step step(Tasklet annictDataProcessTasklet) {
        return new StepBuilder("step1", jobRepository)
                .tasklet(annictDataProcessTasklet, transactionManager).build();
    }
}
