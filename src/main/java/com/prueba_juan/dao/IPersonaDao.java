package com.prueba_juan.dao;

import com.prueba_juan.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona,Long> {
}
