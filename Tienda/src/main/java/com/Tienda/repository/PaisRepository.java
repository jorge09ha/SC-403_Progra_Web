package com.Tienda.repository;

import com.Tienda.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
@Repository
public interface PaisRepository extends CrudRepository<Pais, Long>{
    
}
