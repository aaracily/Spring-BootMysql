package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.domain.dto.Training;
import cl.modulo6.ejercicios.model.persistence.entity.Capacitacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CustomerMapper.class})
public interface TrainingMapper {
    @Mappings({
            @Mapping(source="id",target = "id"),
            @Mapping(source="nombre",target = "name"),
            @Mapping(source="detalle",target = "detail"),
            @Mapping(source="fecha",target = "date"),
            @Mapping(source="hora",target = "hour"),
            @Mapping(source="lugar",target = "place"),
            @Mapping(source="duracion",target = "duration"),
            @Mapping(source="cantidad",target = "amount"),
            @Mapping(source="cliente",target = "customer"),

    })
    Training toTraining(Capacitacion capacitacion);
    List<Training> toTrainings (List<Capacitacion> capacitaciones);
    @InheritInverseConfiguration
    Capacitacion toCapacitacion (Training training);
}
