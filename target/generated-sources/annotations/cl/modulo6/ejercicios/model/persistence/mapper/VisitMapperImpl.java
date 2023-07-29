package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.domain.dto.Visit;
import cl.modulo6.ejercicios.model.persistence.entity.Visita;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T22:58:14-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class VisitMapperImpl implements VisitMapper {

    @Override
    public Visit toVisit(Visita visita) {
        if ( visita == null ) {
            return null;
        }

        Visit visit = new Visit();

        visit.setId( visita.getId() );
        visit.setFecha( visita.getFecha() );
        visit.setHora( visita.getHora() );
        visit.setLugar( visita.getLugar() );
        visit.setRealizado( visita.getRealizado() );
        visit.setDetalle( visita.getDetalle() );

        return visit;
    }

    @Override
    public List<Visit> toVisits(List<Visita> visits) {
        if ( visits == null ) {
            return null;
        }

        List<Visit> list = new ArrayList<Visit>( visits.size() );
        for ( Visita visita : visits ) {
            list.add( toVisit( visita ) );
        }

        return list;
    }

    @Override
    public Visita toVisit(Visit visit) {
        if ( visit == null ) {
            return null;
        }

        Visita visita = new Visita();

        visita.setId( visit.getId() );
        visita.setFecha( visit.getFecha() );
        visita.setHora( visit.getHora() );
        visita.setLugar( visit.getLugar() );
        visita.setRealizado( visit.getRealizado() );
        visita.setDetalle( visit.getDetalle() );

        return visita;
    }
}
