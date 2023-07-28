package cl.modulo6.ejercicios.model.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
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
