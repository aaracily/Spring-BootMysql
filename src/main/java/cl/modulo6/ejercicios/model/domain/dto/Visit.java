package cl.modulo6.ejercicios.model.domain.dto;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@ToString
public class Visit {
    private int id;
    private Date fecha;
    private LocalDateTime hora;
    private String lugar;
    private String realizado;
    private String detalle;

    public Visit(int id, Date fecha, LocalDateTime hora, String lugar, String realizado, String detalle) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.realizado = realizado;
        this.detalle = detalle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getRealizado() {
        return realizado;
    }

    public void setRealizado(String realizado) {
        this.realizado = realizado;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

}
