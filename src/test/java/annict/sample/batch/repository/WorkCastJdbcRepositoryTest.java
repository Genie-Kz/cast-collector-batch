package annict.sample.batch.repository;

import static org.assertj.core.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;
import annict.sample.batch.model.CastModel;
import annict.sample.batch.model.WorkModel;

@JdbcTest
@Import(WorkCastJdbcRepository.class)
@Sql(scripts = "/db/migration/V1__create_work_and_cast_tables.sql")
class WorkCastJdbcRepositoryTest {
    @Autowired
    WorkCastJdbcRepository repository;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @BeforeEach
    void setUp() {
        jdbcTemplate.update("DELETE FROM cast");
        jdbcTemplate.update("DELETE FROM work");
    }

    @Test
    void batchInsertWorks_and_batchInsertCasts() {

        var work = new WorkModel(1,"title", 10);
        var works = List.of(work);
        repository.batchInsertWorks(works);
        Integer count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM work WHERE annict_id = 1", Integer.class);
        assertThat(count).isEqualTo(1);

        var cast = new CastModel(100,"cast","castEn",1);
        var casts = List.of(cast);
        repository.batchInsertCasts(casts);
        count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM \"cast\" WHERE annict_id = 100", Integer.class);
        assertThat(count).isEqualTo(1);
    }
}
