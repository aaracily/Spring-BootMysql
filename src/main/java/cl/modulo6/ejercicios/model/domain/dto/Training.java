package cl.modulo6.ejercicios.model.domain.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Training {
    private int id;
    private String name;
    private String detail;
    private LocalDate date;
    private LocalTime  hour;
    private String place;
    private int duration;
    private int amount;
    private Customer customer;
    public Training(String name, String detail,String place, int duration, int amount){
        this.name = name;
        this.detail =detail;
        this.place = place;
        this.duration = duration;
        this.amount =amount;
    }
    public Training(String name, String detail,LocalDate date,LocalTime hour,String place, int duration, int amount){
        this.name = name;
        this.detail =detail;
        this.place = place;
        this.duration = duration;
        this.amount =amount;
    }
}
