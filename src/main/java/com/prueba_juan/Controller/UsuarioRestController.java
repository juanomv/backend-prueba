package com.prueba_juan.Controller;

import com.prueba_juan.model.Persona;
import com.prueba_juan.model.Usuario;
import com.prueba_juan.services.Interface.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioRestController {
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> search() {
        return usuarioService.search();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> searchById(@PathVariable Long id) {
        return usuarioService.searchById(id);
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@RequestBody Usuario usuario, @PathVariable Long id) {
        return usuarioService.update(usuario, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        return usuarioService.deleteById(id);
    }

    @GetMapping("/{idUsuario}/personas")
    public ResponseEntity<List<Persona>> findPersonasByIdUsuario(@PathVariable Long idUsuario) {
        return usuarioService.findPersonasByIdUsuario(idUsuario);
    }
}
