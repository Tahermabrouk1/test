package repo;

import entities.LivreDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreDetailsRepo extends JpaRepository<LivreDetails,Long> {
}
