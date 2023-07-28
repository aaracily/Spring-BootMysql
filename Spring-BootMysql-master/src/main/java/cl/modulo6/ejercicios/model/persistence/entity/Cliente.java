package cl.modulo6.ejercicios.model.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cliente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    private String rut;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String afp;
    @Column(name="sistema_salud")
    private String sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="usuario_id",insertable = false, updatable = false)
    private Usuario usuario;

}
