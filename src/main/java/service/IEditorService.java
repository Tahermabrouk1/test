package service;

import entities.Editor;
import entities.Livre;

import java.util.List;
import java.util.Optional;

public interface IEditorService {
    Editor addEditor(Editor editor);
    List<Editor> getAllEditors();
    Optional<Editor>  GetEditorById(int id);
    void Delete (int id);
    Editor Update (Editor editor);
}
