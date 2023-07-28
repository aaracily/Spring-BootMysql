package cl.modulo6.ejercicios.model.persistence.mapper;


import cl.modulo6.ejercicios.model.domain.dto.Professional;
import cl.modulo6.ejercicios.model.persistence.entity.Profesional;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ProfessionalMapper {

    @Mappings({
            @Mapping(source= "id", target= "id"),
            @Mapping(source= "run", target= "run"),
            @Mapping(source = "nombre", target= "name"),
            @Mapping(source = "apellido", target= "lastname"),
            @Mapping(source = "correo", target= "email"),
            @Mapping(source = "telefono", target= "phone"),
            @Mapping(source = "usuario", target= "user"),

    })
    Professional toProfessional(Profesional profesional);
    List<Professional> toProfessionals(List<Profesional> professionals);
    @InheritInverseConfiguration
    Profesional toProfesional(Professional professional);
}
