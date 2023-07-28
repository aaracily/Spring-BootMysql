package cl.modulo6.ejercicios.model.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private int id;
    private String role;
    private String username;
    private String password;
}
