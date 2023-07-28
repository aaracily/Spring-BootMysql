package cl.modulo6.ejercicios.model.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    private int id;
    private String rut;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String afp;
    private String healthcareSystem;
    private String address;
    private String commune;
    private int age;
    private User user;
}
