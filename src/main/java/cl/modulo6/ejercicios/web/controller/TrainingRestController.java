package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.model.domain.dto.Training;
import cl.modulo6.ejercicios.web.service.TrainingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training")
public class TrainingRestController {
    private final TrainingService service;

    public TrainingRestController(TrainingService service) {
        this.service = service;
    }
   @GetMapping("/list")
   public ResponseEntity <List<Training>> findAll(){
        return service.findAll().map(trainings ->
                new ResponseEntity<>(trainings, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
   }
    @PostMapping()
    public ResponseEntity<Training> create(@RequestBody Training t){
    return service.create(t).map(training ->
            new ResponseEntity<>(t, HttpStatus.CREATED)).
            orElse(new ResponseEntity<>(HttpStatus.CONFLICT));
    }
}
