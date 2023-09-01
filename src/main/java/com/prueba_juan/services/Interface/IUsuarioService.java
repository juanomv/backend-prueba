package com.prueba_juan.services.Interface;

import com.prueba_juan.model.Persona;
import com.prueba_juan.model.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUsuarioService {
    public ResponseEntity<List<Usuario>> search();
    public ResponseEntity<Object> searchById(Long id);
    public ResponseEntity<Object> save(Usuario usuario);
    public ResponseEntity<Object> update(Usuario usuario,Long id);
    public ResponseEntity<Object> deleteById(Long id);
    public ResponseEntity<List<Persona>> findPersonasByIdUsuario(Long idUsuario);
}
