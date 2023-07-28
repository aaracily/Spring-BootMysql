import java.util.Date;

public class PagoDTO {
    private Double monto;
    private Date fecha;
    private Long idCliente;
    private Long idAdministrativo;

    // Constructores
    public PagoDTO() {
    }

    public PagoDTO(Double monto, Date fecha, Long idCliente, Long idAdministrativo) {
        this.monto = monto;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idAdministrativo = idAdministrativo;
    }

    // Captura y almacenamiento
    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(Long idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }
}
