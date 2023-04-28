package com.Tienda.controller;

import com.Tienda.entity.Pais;
import com.Tienda.entity.Persona;
import com.Tienda.service.IPaisService;
import com.Tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @Autowired
    private IPaisService paisService;

    @GetMapping("/persona")
    public String index(Model model) {
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "personas";
        //
    }

    @GetMapping("/pais")
    public String indexP(Model model) {
        List<Pais> lista = paisService.listCountry();
        model.addAttribute("titulo", "Tabla Paises");
        model.addAttribute("paises", lista);
        return "paises";
    }

    @GetMapping("/personaN")
    public String crearPersona(Model model) {
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("titulo", "Nueva Persona");
        model.addAttribute("persona", new Persona());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona) {
        personaService.savePersona(persona);
        return "redirect:/persona";
    }

    @GetMapping("/delete/{id}")
    public String eliminarDistrito(@PathVariable Long id) {
        personaService.delete(id);
        return "redirect:/persona";
    }

    @GetMapping("/editPersona/{id}")
    public String editarPersona(@PathVariable("id") Long idPersona, Model model) {
        Persona persona = personaService.getPersonaById(idPersona);
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("titulo", "Editar Persona");
        model.addAttribute("persona", persona);
        model.addAttribute("paises", listaPaises);
        return "editar";
    }

    @PostMapping("/editPersona/{id}")
    public String actualizarPersona(@PathVariable Long id, @ModelAttribute("Persona") Persona a) {
        Persona editar = personaService.getPersonaById(id);
        editar.setId(id);
        editar.setNombre(a.getNombre());
        editar.setApellido1(a.getApellido1());
        editar.setApellido2(a.getApellido2());
        editar.setEmail(a.getEmail());
        editar.setTelefono(a.getTelefono());
        editar.setPais(a.getPais());
        personaService.savePersona(editar);
        return "redirect:/persona";
    }

    @GetMapping("/search")
    public ModelAndView searchByName(@RequestParam("apellido1") String apellido1) {
        List<Persona> apellido = personaService.findByApellido1(apellido1);
        ModelAndView modelAndView = new ModelAndView("personasB");
        modelAndView.addObject("apellido", apellido);
        return modelAndView;
    }

}
