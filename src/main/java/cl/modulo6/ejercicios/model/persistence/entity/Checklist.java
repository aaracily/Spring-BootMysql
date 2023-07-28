package cl.modulo6.ejercicios.model.persistence.entity;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "checklist")
public class Checklist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_capacitacion")
    private Long idCapacitacion;

    private boolean charla;
    private boolean asistencia;
    private boolean pago;
    private boolean cierre;

    @Column(name = "id_profesional")
    private Long idProfesional;

    @Column(name = "fecha_ultima_visita")
    private Date fechaUltimaVisita;

}
