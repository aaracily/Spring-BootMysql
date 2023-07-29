package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.persistence.entity.Visita;
import cl.modulo6.ejercicios.model.domain.dto.Visit;
import cl.modulo6.ejercicios.model.persistence.mapper.VisitMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring")
// @Mapper(componentModel = "spring", uses = {ProfessionalMapper.class})
public interface VisitMapper {

    @Mappings({
            @Mapping(source="id",target = "id"),
            @Mapping(source="fecha",target = "fecha"),
            @Mapping(source="hora",target = "hora"),
            @Mapping(source="lugar",target = "lugar"),
            @Mapping(source="realizado",target = "realizado"),
            @Mapping(source="detalle",target = "detalle"),
            //@Mapping(source="duracion",target = "duration"),
           // @Mapping(source="profesional",target = "profesional"),

    })
    Visit toVisit(Visita visita );
    List<Visit> toVisits (List<Visita> visits);
    @InheritInverseConfiguration
    Visita toVisit (Visit visit);


}
