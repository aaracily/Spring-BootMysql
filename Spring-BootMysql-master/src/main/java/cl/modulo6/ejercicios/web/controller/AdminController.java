package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.model.domain.dto.Admin;
import cl.modulo6.ejercicios.model.domain.dto.Customer;
import cl.modulo6.ejercicios.web.service.AdminService;
import cl.modulo6.ejercicios.web.service.CustomerService;
import cl.modulo6.ejercicios.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final AdminService service;
    private final UserService userService;

    public AdminController(AdminService service, UserService userService) {
        this.service = service;
        this.userService = userService;
    }
    @GetMapping()
    public String listAdmin(Model model){
        model.addAttribute("listAdmins",service.findAll());
        return "admins";
    }
    @GetMapping("/edit/{id}")
    public String editAdmin(@PathVariable int id, Model model){
        model.addAttribute("admin",service.findById(id));
        model.addAttribute("listUser",userService.findAll());
        return "formAdmin";
    }
    @PostMapping("/edit")
    public String saveEdit(@ModelAttribute Admin admin){
        service.update(admin);
        return "redirect:/admin";

    }
}
