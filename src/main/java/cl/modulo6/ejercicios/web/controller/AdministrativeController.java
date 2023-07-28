package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.model.domain.dto.Administrative;
import cl.modulo6.ejercicios.web.service.AdministrativeService;
import cl.modulo6.ejercicios.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdministrativeController {
    private final AdministrativeService service;
    private final UserService userService;

    public AdministrativeController(AdministrativeService service, UserService userService) {
        this.service = service;
        this.userService = userService;
    }
    @GetMapping()
    public String list(Model model){
        model.addAttribute("list",service.findAll());
        model.addAttribute("users",userService.findAll());
        return "admins";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("admin",service.findById(id));
        //podría ser si usuario?
        model.addAttribute("users",userService.findAll());
        return "formAdmin";
    }
    @PostMapping("/edit")
    public String saveEdit(@ModelAttribute Administrative administrative){
        service.update(administrative);
        return"redirect:/user/users";
    }
}
