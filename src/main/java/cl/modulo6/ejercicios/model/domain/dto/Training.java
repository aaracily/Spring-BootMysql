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
    private Customer customer;
}
