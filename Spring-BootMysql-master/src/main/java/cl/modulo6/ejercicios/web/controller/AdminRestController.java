package cl.modulo6.ejercicios.web.controller;

import cl.modulo6.ejercicios.model.domain.dto.Admin;
import cl.modulo6.ejercicios.web.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminRestController {

    private final AdminService service;

    public AdminRestController(AdminService service) {
        this.service = service;
    }
    @GetMapping
    public ResponseEntity <List<Admin>> findAll(){
        return service.findAll().map(admins ->
                        new ResponseEntity<>(admins, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/{adminId}")
    public ResponseEntity<Admin> findById(@PathVariable int adminId){
        return service.findById(adminId).map(admin -> new ResponseEntity<>(admin ,HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }
}
