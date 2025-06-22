package annict.sample.batch.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BatchJobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        log.info("[BATCH] Job started: {}", jobExecution.getJobInstance().getJobName());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus().isUnsuccessful()) {
            log.error("[BATCH] Job failed: {} - {}", jobExecution.getJobInstance().getJobName(), jobExecution.getAllFailureExceptions());
        } else {
            log.info("[BATCH] Job finished: {}", jobExecution.getJobInstance().getJobName());
        }
    }
}
