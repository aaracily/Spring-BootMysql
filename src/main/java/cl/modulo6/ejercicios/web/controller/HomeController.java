package cl.modulo6.ejercicios.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
@GetMapping
    public String home(){
    return "index";
}
/*    @GetMapping("/contacto")
    public String contacto(){
        return "formContact";
    }*/

@PostMapping()
    public String login(){
    return null;
}
}
