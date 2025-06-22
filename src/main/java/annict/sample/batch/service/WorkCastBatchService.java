package annict.sample.batch.service;

import annict.sample.batch.model.WorkModel;
import annict.sample.batch.model.CastModel;
import annict.sample.batch.repository.WorkCastJdbcRepository;
import annict.sample.batch.service.AnnictService.WorkWithCasts;
import annict.sample.batch.service.AnnictService.WorkWithCastsModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class WorkCastBatchService {
    private final WorkCastJdbcRepository workCastJdbcRepository;

    @Transactional
    public void saveWorksAndCasts(List<WorkWithCasts> worksWithCasts) {
        if (worksWithCasts == null || worksWithCasts.isEmpty()) {
            log.warn("No worksWithCasts to save.");
            return;
        }
        try {
            List<WorkModel> workModels = worksWithCasts.stream()
                    .map(w -> new WorkModel(
                            w.work().getAnnictId(),
                            w.work().getTitle(),
                            w.work().getWatchersCount()
                    ))
                    .toList();
            List<CastModel> castModels = worksWithCasts.stream()
                    .flatMap(w -> w.casts().stream()
                            .map(c -> new CastModel(
                                    c.getAnnictId(),
                                    c.getName(),
                                    c.getNameEn(),
                                    w.work().getAnnictId()
                            )))
                    .toList();
            workCastJdbcRepository.batchInsertWorks(workModels);
            workCastJdbcRepository.batchInsertCasts(castModels);
            log.info("Saved {} works and {} casts.", workModels.size(), castModels.size());
        } catch (Exception e) {
            log.error("Failed to save works and casts.", e);
            throw new RuntimeException("DB batch insert failed", e);
        }
    }

    @Transactional
    public void saveWorksAndCastsModel(List<WorkWithCastsModel> worksWithCasts) {
        if (worksWithCasts == null || worksWithCasts.isEmpty()) {
            log.warn("No worksWithCasts to save.");
            return;
        }
        try {
            var workModels = worksWithCasts.stream().map(WorkWithCastsModel::work).toList();
            var castModels = worksWithCasts.stream().flatMap(w -> w.casts().stream()).toList();
            workCastJdbcRepository.batchInsertWorks(workModels);
            workCastJdbcRepository.batchInsertCasts(castModels);
            log.info("Saved {} works and {} casts.", workModels.size(), castModels.size());
        } catch (Exception e) {
            log.error("Failed to save works and casts.", e);
            throw new RuntimeException("DB batch insert failed", e);
        }
    }
}