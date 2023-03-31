package com.Tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
@Controller
public class LoginController {

    @GetMapping("/log in ")
    public String index() {
        return "/login";
    }
}
