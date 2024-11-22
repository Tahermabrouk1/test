package service;

import entities.Livre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repo.livreRepo;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LivreServiceImpl implements ILivreService{

    private livreRepo livreRepo;
    @Override
    public Livre addLivre(Livre livre) {
        return livreRepo.save(livre);
    }

    @Override
    public List<Livre> getAllLivres() {
        return livreRepo.findAll();
    }

    @Override
    public Optional<Livre> GetLivreById(Long id) {
        return livreRepo.findById(id);
    }
    @Override
    public void Delete(Long id) {
        Livre livre = livreRepo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Chambre not found with ID: " + id));
        livreRepo.delete(livre);
    }

    @Override
    public Livre Update( Livre livre) {
        return livreRepo.save(livre);
    }
    }
