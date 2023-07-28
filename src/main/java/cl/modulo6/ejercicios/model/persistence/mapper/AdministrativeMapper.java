package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.domain.dto.Administrative;
import cl.modulo6.ejercicios.model.persistence.entity.Administrativo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface AdministrativeMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "run", target = "run"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "correo", target = "email"),
            @Mapping(source = "area", target = "area"),
            @Mapping(source = "usuario", target = "user")
    })
    Administrative toAdministrative(Administrativo administrativo);
    List<Administrative> toAdminis(List<Administrativo> administrativos);
    @InheritInverseConfiguration
    Administrativo toAdministrativo(Administrative administrative);
}
