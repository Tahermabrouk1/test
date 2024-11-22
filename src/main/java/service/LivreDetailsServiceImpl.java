package service;

import entities.Livre;
import entities.LivreDetails;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repo.LivreDetailsRepo;
import repo.livreRepo;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LivreDetailsServiceImpl implements IlivreDetailsService{

    private LivreDetailsRepo livreDetailsRepo;
    @Override
    public LivreDetails addLivreDetail(LivreDetails livre) {
        return livreDetailsRepo.save(livre);
    }

    @Override
    public List<LivreDetails> getAllLivreDetails() {
        return livreDetailsRepo.findAll();
    }

    @Override
    public Optional<LivreDetails> GetLivreDetailsById(Long id) {
        return livreDetailsRepo.findById(id);
    }
    @Override
    public void Delete(Long id) {
        LivreDetails livre = livreDetailsRepo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Chambre not found with ID: " + id));
        livreDetailsRepo.delete(livre);
    }

    @Override
    public LivreDetails Update( LivreDetails livre) {
        return livreDetailsRepo.save(livre);
    }
}
