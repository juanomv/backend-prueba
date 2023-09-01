package com.prueba_juan.services.Interface;

import com.prueba_juan.model.Persona;
import com.prueba_juan.model.Rol;
import com.prueba_juan.model.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IRolService {
    public ResponseEntity<List<Rol>> search();
    public ResponseEntity<Object> searchById(Long id);
    public ResponseEntity<Object> save(Rol rol);
    public ResponseEntity<Object> update(Rol rol,Long id);
    public ResponseEntity<Object> deleteById(Long id);
    public ResponseEntity<List<Persona>> findPersonasByIdUsuario(Long idRol);

}
