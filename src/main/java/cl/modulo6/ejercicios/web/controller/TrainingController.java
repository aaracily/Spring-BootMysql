package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.model.domain.dto.Training;
import cl.modulo6.ejercicios.web.service.CustomerService;
import cl.modulo6.ejercicios.web.service.TrainingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/training")
public class TrainingController {
    //inyección de dependencia- servicioInterface
    private final TrainingService service;
    private final CustomerService customerService;

    public TrainingController(TrainingService service,  CustomerService customerService) {
        this.service = service;
        this.customerService = customerService;

    }

    //caso de uso crear capacitacion
    @GetMapping
    public String formTraining(Model model){
        model.addAttribute("cust",customerService.findAll());
        model.addAttribute("newTraining", new Training());
        return "formTraining";
    }
    @PostMapping
    public String createTraining (@ModelAttribute Training training){

    service.create(training);
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
