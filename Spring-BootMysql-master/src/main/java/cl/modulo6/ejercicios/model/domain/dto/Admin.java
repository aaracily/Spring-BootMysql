package cl.modulo6.ejercicios.model.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Admin {
    private int id;
    private String rut;
    private String name;
    private String lastName;
    private String email;
    private String area;
    private User user;
}
