package com.prueba_juan.services.Interface;

import com.prueba_juan.model.Persona;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IPersonaService {
    public ResponseEntity<List<Persona>> search();
    public ResponseEntity<Persona> searchById(Long id);
    public ResponseEntity<Object> save(Persona persona);
    public ResponseEntity<Persona> update(Persona persona,Long id);
    public ResponseEntity<Persona> deleteById(Long id);

}
