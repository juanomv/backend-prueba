package com.prueba_juan.Controller;

import com.prueba_juan.model.Persona;
import com.prueba_juan.services.Interface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/v1")
public class PersonaRestController {


    @Autowired
    private  IPersonaService personaService;

    @GetMapping("/personas")
    public ResponseEntity<List<Persona>> search() {
        return personaService.search();
    }

    @GetMapping("personas/{id}")
    public ResponseEntity<Persona> searchById(@PathVariable Long id) {
        return personaService.searchById(id);
    }

    @PostMapping("personas")
    public ResponseEntity<Object> save(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @PutMapping("personas/{id}")
    public ResponseEntity<Persona> update(@PathVariable Long id, @RequestBody Persona persona) {
        return personaService.update(persona, id);
    }

    @DeleteMapping("personas/{id}")
    public ResponseEntity<Persona> deleteById(@PathVariable Long id) {
        return personaService.deleteById(id);
    }
}

