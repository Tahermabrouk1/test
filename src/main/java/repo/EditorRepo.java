package repo;

import entities.Editor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorRepo extends JpaRepository<Editor,Integer> {
}
