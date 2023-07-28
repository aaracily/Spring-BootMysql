@Entity
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double monto;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "administrativo_id")
    private Administrativo administrativo;

    // Constructors, getters, and setters
}

public class PagosDTO {
    private Long id;
    private double monto;
    private Date fecha;
    private Long idCliente;
    private Long idAdministrativo;

    // Constructors, getters, and setters
}
