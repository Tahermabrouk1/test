package service;

import entities.Livre;

import java.util.List;
import java.util.Optional;

public interface ILivreService {
    Livre addLivre(Livre livre);
    List<Livre> getAllLivres();
    Optional<Livre> GetLivreById(Long id);
    void Delete (Long id);
    Livre Update (Livre livre);
}
