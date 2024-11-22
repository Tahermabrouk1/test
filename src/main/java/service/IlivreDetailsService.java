package service;

import entities.Livre;
import entities.LivreDetails;

import java.util.List;
import java.util.Optional;

public interface IlivreDetailsService {
    LivreDetails addLivreDetail(LivreDetails details);
    List<LivreDetails> getAllLivreDetails();
    Optional<LivreDetails> GetLivreDetailsById(Long id);
    void Delete (Long id);
    LivreDetails Update (LivreDetails details);
}
