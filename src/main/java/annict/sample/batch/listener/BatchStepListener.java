package annict.sample.batch.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BatchStepListener implements StepExecutionListener {
    @Override
    public void beforeStep(StepExecution stepExecution) {
        log.info("[BATCH] Step started: {}", stepExecution.getStepName());
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        if (stepExecution.getStatus().isUnsuccessful()) {
            log.error("[BATCH] Step failed: {} - {}", stepExecution.getStepName(), stepExecution.getFailureExceptions());
        } else {
            log.info("[BATCH] Step finished: {}", stepExecution.getStepName());
        }
        return stepExecution.getExitStatus();
    }
}
