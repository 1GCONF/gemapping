package be.vdab.luigi.services;
import be.vdab.luigi.repositories.FilmRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional(readOnly = true)
public class FilmService {
    private final FilmRepository filmRepository;
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    public long findTotaalVrijePlaatsen(){
        return filmRepository.findTotaalVrijePlaatsen();
    }
}
