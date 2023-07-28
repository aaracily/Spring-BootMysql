package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.model.domain.dto.Professional;
import cl.modulo6.ejercicios.web.service.ProfessionalService;
import cl.modulo6.ejercicios.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/professional")
public class ProfessionalController {
    private final ProfessionalService service;
    private final UserService userService;

    public ProfessionalController(ProfessionalService service, UserService userService) {
        this.service = service;
        this.userService = userService;
    }

    @GetMapping()
    public String listProfessional(Model model){
        model.addAttribute("listProfessional",service.findAll());
        return "professionals";
    }
    @GetMapping("/edit/{id}")
    public String editProfessional(@PathVariable int id, Model model){
        model.addAttribute("professional",service.findById(id));
        model.addAttribute("userList",userService.findAll());
        return "formProfessional";
    }
    @PostMapping("/edit")
    public String saveEdit(@ModelAttribute Professional professional){
        service.update(professional);
        return "redirect:/professional";

    }

}