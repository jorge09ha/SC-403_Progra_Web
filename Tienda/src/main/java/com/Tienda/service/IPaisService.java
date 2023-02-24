package com.Tienda.service;

import com.Tienda.entity.Pais;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
@Service
public interface IPaisService {

    public List<Pais> listCountry();

}
