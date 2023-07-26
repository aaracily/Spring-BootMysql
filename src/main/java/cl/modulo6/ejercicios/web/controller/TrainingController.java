package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.model.domain.dto.Training;
import cl.modulo6.ejercicios.web.service.CustomerService;
import cl.modulo6.ejercicios.web.service.TrainingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/training")
public class TrainingController {
    //inyección de dependencia- servicioInterface
    private final TrainingService service;
    private final CustomerService cservice;

    public TrainingController(TrainingService service, CustomerService cservice) {
        this.service = service;
        this.cservice = cservice;
    }

    //caso de uso crear capacitacion
    @GetMapping
    public String formTraining(Model model){
        //model.addAttribute("cust",cservice.findAll());
        return "formTraining";
    }
    @PostMapping
    public String createTraining (@ModelAttribute Training t){
    service.create(t);
    return "redirect:/training/list";
    }
    //Caso de uso Listar capacitaciones
    @GetMapping("/list")
    public String findAll(Model model){
       // model.addAttribute("customer",cservice.findAll());
        model.addAttribute("listTrainings",service.findAll());
        return "trainings";
    }

}
