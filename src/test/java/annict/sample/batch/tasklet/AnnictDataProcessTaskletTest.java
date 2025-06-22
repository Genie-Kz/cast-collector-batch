package annict.sample.batch.tasklet;

import annict.sample.batch.service.AnnictService;
import annict.sample.batch.service.WorkCastBatchService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.repeat.RepeatStatus;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AnnictDataProcessTaskletTest {
    @Mock
    AnnictService annictService;
    @Mock
    WorkCastBatchService workCastBatchService;
    @InjectMocks
    AnnictDataProcessTasklet tasklet;

    AnnictDataProcessTaskletTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void execute_noWorks_returnsFinished() throws Exception {
        when(annictService.fetchWorksWithCasts(anyString())).thenReturn(Collections.emptyList());
        var status = tasklet.execute(mock(StepContribution.class), mock(ChunkContext.class));
        assertEquals(RepeatStatus.FINISHED, status);
        verify(workCastBatchService, never()).saveWorksAndCasts(anyList());
    }
}
