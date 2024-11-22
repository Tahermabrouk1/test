package repo;

import entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface livreRepo extends JpaRepository<Livre,Long> {
}
