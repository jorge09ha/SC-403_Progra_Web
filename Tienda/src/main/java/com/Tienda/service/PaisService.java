package com.Tienda.service;

import com.Tienda.entity.Pais;
import com.Tienda.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
@Service
public class PaisService implements IPaisService {

    //Se crea un atributo de tipo Repositorio, el autowired hace un puente entre instancias es una inyeccion.
    @Autowired
    private PaisRepository paisRepository;

    //
    @Override
    public List<Pais> listCountry() {
        return (List<Pais>) paisRepository.findAll();
    }

}
