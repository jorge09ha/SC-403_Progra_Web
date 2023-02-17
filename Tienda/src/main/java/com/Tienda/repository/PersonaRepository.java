package com.Tienda.repository;

import com.Tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {

}
