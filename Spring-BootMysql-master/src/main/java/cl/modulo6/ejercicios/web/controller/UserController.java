package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.model.domain.dto.User;
import cl.modulo6.ejercicios.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    //controlador caso uso listar usuarios
@GetMapping("users")
    public String listaUsuarios(Model model){
        model.addAttribute("listUsers", service.findAll());
        return "users";
    }
@GetMapping()
    public String formUser(){
        return "formUser";
}
    @PostMapping()
    public String createUser(@ModelAttribute User user){
        service.create(user);
        return "redirect:/user/users";
    }
}
