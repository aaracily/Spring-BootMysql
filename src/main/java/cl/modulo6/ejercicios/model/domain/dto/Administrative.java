package cl.modulo6.ejercicios.model.domain.dto;

import cl.modulo6.ejercicios.model.persistence.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Administrative {
    private int id;
    private String run;
    private String name;
    private String lastName;
    private String email;
    private String area;
    private Usuario user;

public Administrative(int id, String name, String lastName, String area){
    this.id =id;
    this.name =name;
    this.lastName = lastName;
    this.area = area;
}
}
