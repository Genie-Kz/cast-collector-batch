package annict.sample.batch.service;

import annict.sample.batch.model.WorkModel;
import annict.sample.batch.model.CastModel;
import annict.sample.batch.repository.WorkCastJdbcRepository;
import annict.sample.batch.service.AnnictService.WorkWithCastsModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class WorkCastBatchServiceTest {
    @Mock
    WorkCastJdbcRepository repository;
    @InjectMocks
    WorkCastBatchService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void saveWorksAndCastsModel_shouldCallBatchInsertWithCorrectEntities() {
        var work = new WorkModel(1, "title", 10);
        var cast = new CastModel(100, "cast", "castEn", 1);
        var wwc = new WorkWithCastsModel(work, List.of(cast));
        service.saveWorksAndCastsModel(List.of(wwc));
        ArgumentCaptor<List<WorkModel>> workCaptor = ArgumentCaptor.forClass(List.class);
        ArgumentCaptor<List<CastModel>> castCaptor = ArgumentCaptor.forClass(List.class);
        verify(repository).batchInsertWorks(workCaptor.capture());
        verify(repository).batchInsertCasts(castCaptor.capture());
        assertThat(workCaptor.getValue()).hasSize(1);
        assertThat(workCaptor.getValue().get(0).annictId()).isEqualTo(1);
        assertThat(castCaptor.getValue()).hasSize(1);
        assertThat(castCaptor.getValue().get(0).annictId()).isEqualTo(100);
        assertThat(castCaptor.getValue().get(0).workAnnictId()).isEqualTo(1);
    }
}