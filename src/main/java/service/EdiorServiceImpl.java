package service;

import entities.Editor;
import entities.LivreDetails;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repo.EditorRepo;
import repo.LivreDetailsRepo;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Service
@AllArgsConstructor
public class EdiorServiceImpl implements IEditorService {
    private EditorRepo editorRepo;

    @Override
    public Editor addEditor(Editor editor) {
        return editorRepo.save(editor);
    }

    @Override
    public List<Editor> getAllEditors() {
        return editorRepo.findAll();
    }

    @Override
    public Optional<Editor> GetEditorById(int id) {
        return editorRepo.findById(id);
    }

    @Override
    public void Delete(int id) {
        Editor editor = editorRepo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Chambre not found with ID: " + id));
        editorRepo.delete(editor);
    }

    @Override
    public Editor Update(Editor editor) {
        return editorRepo.save(editor);
    }
}
