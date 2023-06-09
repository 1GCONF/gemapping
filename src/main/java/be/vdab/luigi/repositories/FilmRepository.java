package be.vdab.luigi.repositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class FilmRepository {
    private final JdbcTemplate template;
    public FilmRepository(JdbcTemplate template) {
        this.template = template;
    }
    public long findTotaalVrijePlaatsen(){
        var sql = """
                select sum(vrijeplaatsen) 
                from films
                """;
        return template.queryForObject(sql,Long.class);
    }
}
