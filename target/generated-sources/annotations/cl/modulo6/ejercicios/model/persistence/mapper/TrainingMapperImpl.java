package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.domain.dto.Training;
import cl.modulo6.ejercicios.model.persistence.entity.Capacitacion;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T23:46:13-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class TrainingMapperImpl implements TrainingMapper {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Training toTraining(Capacitacion capacitacion) {
        if ( capacitacion == null ) {
            return null;
        }

        Training training = new Training();

        training.setId( capacitacion.getId() );
        training.setName( capacitacion.getNombre() );
        training.setDetail( capacitacion.getDetalle() );
        if ( capacitacion.getFecha() != null ) {
            training.setDate( LocalDateTime.ofInstant( capacitacion.getFecha().toInstant(), ZoneOffset.UTC ).toLocalDate() );
        }
        training.setHour( capacitacion.getHora() );
        training.setPlace( capacitacion.getLugar() );
        training.setDuration( capacitacion.getDuracion() );
        training.setAmount( capacitacion.getCantidad() );
        training.setCustomer( customerMapper.toCustomer( capacitacion.getCliente() ) );

        return training;
    }

    @Override
    public List<Training> toTrainings(List<Capacitacion> capacitaciones) {
        if ( capacitaciones == null ) {
            return null;
        }

        List<Training> list = new ArrayList<Training>( capacitaciones.size() );
        for ( Capacitacion capacitacion : capacitaciones ) {
            list.add( toTraining( capacitacion ) );
        }

        return list;
    }

    @Override
    public Capacitacion toCapacitacion(Training training) {
        if ( training == null ) {
            return null;
        }

        Capacitacion capacitacion = new Capacitacion();

        capacitacion.setId( training.getId() );
        capacitacion.setNombre( training.getName() );
        capacitacion.setDetalle( training.getDetail() );
        if ( training.getDate() != null ) {
            capacitacion.setFecha( Date.from( training.getDate().atStartOfDay( ZoneOffset.UTC ).toInstant() ) );
        }
        capacitacion.setHora( training.getHour() );
        capacitacion.setLugar( training.getPlace() );
        capacitacion.setDuracion( training.getDuration() );
        capacitacion.setCantidad( training.getAmount() );
        capacitacion.setCliente( customerMapper.toCliente( training.getCustomer() ) );

        return capacitacion;
    }
}
