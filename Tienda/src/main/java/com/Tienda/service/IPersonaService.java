package com.Tienda.service;

import com.Tienda.entity.Persona;
import java.util.List;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public interface IPersonaService {

    public List<Persona> getAllPersona();

    public Persona getPersonaById(long id);

    public void savePersona(Persona persona);

    public void delete(long id);

}
