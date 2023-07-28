package cl.modulo6.ejercicios.model.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Training {
    private int id;
    private String name;
    private String detail;
    private LocalDate date;
    private LocalTime  hour;
    private String place;
    private int duration;
    private int amount;
    private int customerId;
    private Customer customer;
    public Training(String name, String detail,String place, int duration, int amount){
        this.name = name;
        this.detail =detail;
        this.place = place;
        this.duration = duration;
        this.amount =amount;
    }
    public Training(String name, String detail,LocalDate date,LocalTime hour,String place, int duration, int amount,int cutomerId){
        this.name = name;
        this.detail =detail;
        this.place = place;
        this.duration = duration;
        this.amount =amount;
        this.customerId = cutomerId;
    }
}
