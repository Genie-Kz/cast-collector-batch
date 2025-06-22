package annict.sample.batch.repository;

import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import annict.sample.batch.model.CastModel;
import annict.sample.batch.model.WorkModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
@RequiredArgsConstructor
public class WorkCastJdbcRepository {
    private final NamedParameterJdbcTemplate jdbc;

    public void batchInsertWorks(List<WorkModel> works) {
        if (works == null || works.isEmpty()) {
            log.info("No works to insert.");
            return;
        }
        String sql = """
            INSERT INTO work (annict_id, title, watchers_count)
            VALUES (:annictId, :title, :watchersCount)
            ON CONFLICT (annict_id) DO UPDATE SET
                title = EXCLUDED.title,
                watchers_count = EXCLUDED.watchers_count
            """;
        var params = works.stream()
                .map(w -> new MapSqlParameterSource()
                        .addValue("annictId", w.annictId())
                        .addValue("title", w.title())
                        .addValue("watchersCount", w.watchersCount()))
                .toArray(MapSqlParameterSource[]::new);
        try {
            jdbc.batchUpdate(sql, params);
            log.info("Inserted/updated {} works.", works.size());
        } catch (DataAccessException e) {
            log.error("Failed to batch insert works.", e);
            throw e;
        }
    }

    public void batchInsertCasts(List<CastModel> casts) {
        if (casts == null || casts.isEmpty()) {
            log.info("No casts to insert.");
            return;
        }
        String sql = """
            INSERT INTO "cast" (annict_id, name, name_en, work_annict_id)
            VALUES (:annictId, :name, :nameEn, :workAnnictId)
            ON CONFLICT (annict_id) DO UPDATE SET
                name = EXCLUDED.name,
                name_en = EXCLUDED.name_en,
                work_annict_id = EXCLUDED.work_annict_id
            """;
        var params = casts.stream()
                .map(c -> new MapSqlParameterSource()
                        .addValue("annictId", c.annictId())
                        .addValue("name", c.name())
                        .addValue("nameEn", c.nameEn())
                        .addValue("workAnnictId", c.workAnnictId()))
                .toArray(MapSqlParameterSource[]::new);
        try {
            jdbc.batchUpdate(sql, params);
            log.info("Inserted/updated {} casts.", casts.size());
        } catch (DataAccessException e) {
            log.error("Failed to batch insert casts.", e);
            throw e;
        }
    }
}