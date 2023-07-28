package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.model.domain.dto.Customer;
import cl.modulo6.ejercicios.web.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {
    private final CustomerService service;

    public CustomerRestController(CustomerService service) {
        this.service = service;
    }
    @GetMapping
    public ResponseEntity <List<Customer>> findAll(){
        return service.findAll().map(customers ->
                new ResponseEntity<>(customers, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    /*@GetMapping("/{customerId}")
    public ResponseEntity<Customer> findById(@PathVariable int customerId){
        return service.findById(customerId).map(customer -> new ResponseEntity<>(customer ,HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }*/
}
