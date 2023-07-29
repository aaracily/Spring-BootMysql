package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.web.service.CustomerService;
import cl.modulo6.ejercicios.web.service.VisitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/visit")
public class VisitController {

    private final VisitService service;
    private final CustomerService customerService;

    public VisitController(VisitService service, CustomerService customerService) {
        this.service = service;
        this.customerService = customerService;
    }

    @GetMapping()
    public String listVisit(Model model) {
        model.addAttribute("listVisit", service.findAll());
        return "visits";
    }



}
