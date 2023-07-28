package cl.modulo6.ejercicios.model.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name="capacitacion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Capacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    private String nombre;
    private String detalle;
    private Date fecha;
    private LocalTime hora;
    private String lugar;
    private int duracion;
    private int cantidad;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cliente_id", insertable =false, updatable=false)
    private Cliente cliente;
}
