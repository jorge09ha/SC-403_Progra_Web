package com.Tienda.repository;

import com.Tienda.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    public List<Persona> findByApellido1(String apellido1);

}
