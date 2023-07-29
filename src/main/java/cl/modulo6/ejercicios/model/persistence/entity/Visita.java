package cl.modulo6.ejercicios.model.persistence.entity;

import cl.modulo6.ejercicios.model.domain.dto.Professional;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.*;

@Entity
@Table(name="visita")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cliente_id")
    private Date fecha;
    private LocalDateTime hora;
    private String lugar;
    private String realizado;
    private String detalle;
   /* @EmbeddedId
    private VisitPK id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Date fecha;
    private LocalDate hora;
    private String lugar;
    private String realizado;
    private String detalle;
    @ManyToOne
    @MapsId("clienteId")
    private Cliente cliente;
    @ManyToOne
    @MapsId("profesionalId")
    private Profesional profesional;*/

}
