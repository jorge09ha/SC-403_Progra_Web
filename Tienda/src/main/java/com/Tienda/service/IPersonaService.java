package com.Tienda.service;

import com.Tienda.entity.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
@Service
public interface IPersonaService {

    public List<Persona> getAllPersona();

    public Persona getPersonaById(long id);

    public void savePersona(Persona persona);

    public void delete(long id);
    
    public Persona findByNombre(String nombre);

    public List<Persona> findByApellido1(String apellido1);

    
}
