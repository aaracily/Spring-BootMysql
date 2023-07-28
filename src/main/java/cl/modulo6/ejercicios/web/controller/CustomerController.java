package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.model.domain.dto.Customer;
import cl.modulo6.ejercicios.model.persistence.mapper.CustomerMapper;
import cl.modulo6.ejercicios.web.service.CustomerService;
import cl.modulo6.ejercicios.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService service;
    private final UserService userService;

    public CustomerController(CustomerService service, UserService userService) {
        this.service = service;
        this.userService = userService;

    }

    @GetMapping()
    public String listCustomer(Model model){
        model.addAttribute("listCustomers",service.findAll());
        return "customers";
    }
    @GetMapping("/edit/{id}")
    public String editCustomer(@PathVariable int id, Model model){
        model.addAttribute("customer",service.findById(id));
        model.addAttribute("listUser",userService.findAll());
        return "formCustomer";
    }
    @PostMapping("/edit")
    public String saveEdit(@ModelAttribute Customer customer){
       service.update(customer);
        return "redirect:/customer";

    }

}
