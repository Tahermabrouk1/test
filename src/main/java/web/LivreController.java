package web;

import entities.Livre;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ILivreService;

import java.net.URI;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/livre")
@RequiredArgsConstructor
public class LivreController {

    private final ILivreService livreService;

    @GetMapping("retrive-all-livre")
    public ResponseEntity<List<Livre>> getAllLivres() {
        List<Livre> livres = livreService.getAllLivres();
        if(livres.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(livres);
        }
    }

    @PostMapping("/add-livre")
    public ResponseEntity<Livre> addLivre(@RequestBody Livre livre) {
        Livre savedlivre = livreService.addLivre(livre);
        return ResponseEntity
                .created(URI.create("created"))
                .body(savedlivre);
    }
    @GetMapping("/retrive-livre/{id}")
    public ResponseEntity<Livre> getLivreById(@PathVariable Long id) {
        Optional<Livre> livre = livreService.GetLivreById(id);
        return livre.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/update-livre")
    public ResponseEntity<Livre> updateLivre( @RequestBody Livre updatedBloc) {
        try {
            Livre savedLivre = livreService.Update(updatedBloc);
            return ResponseEntity.ok(savedLivre);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/delete-livre/{id}")
    public ResponseEntity<Void> DeleteLivre(@PathVariable Long id) {
        try {
            livreService.Delete(id);
            return ResponseEntity.ok().build();
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }


}
