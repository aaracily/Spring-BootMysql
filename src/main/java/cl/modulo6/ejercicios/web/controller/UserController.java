package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.model.domain.dto.User;
import cl.modulo6.ejercicios.model.persistence.mapper.UserMapper;
import cl.modulo6.ejercicios.web.service.AdministrativeService;
import cl.modulo6.ejercicios.web.service.CustomerService;
import cl.modulo6.ejercicios.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService service;
private final CustomerService customerService;
private final AdministrativeService administrativeService;
private final UserMapper mapper;
    public UserController(UserService service, CustomerService customerService, AdministrativeService administrativeService, UserMapper mapper) {
        this.service = service;
        this.customerService = customerService;
        this.administrativeService = administrativeService;
        this.mapper = mapper;
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
