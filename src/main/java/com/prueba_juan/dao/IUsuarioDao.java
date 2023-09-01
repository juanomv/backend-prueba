package com.prueba_juan.dao;

import com.prueba_juan.model.Persona;
import com.prueba_juan.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IUsuarioDao extends CrudRepository<Usuario,Long> , JpaRepository<Usuario,Long> {
    List<Persona> findPersonasByIdUsuario(Long idUsuario);
}
