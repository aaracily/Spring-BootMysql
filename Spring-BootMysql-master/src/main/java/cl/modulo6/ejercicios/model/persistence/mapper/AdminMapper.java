package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.domain.dto.Admin;
import cl.modulo6.ejercicios.model.domain.dto.Customer;
import cl.modulo6.ejercicios.model.persistence.entity.Administrativo;
import cl.modulo6.ejercicios.model.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface AdminMapper {
    @Mappings({
            @Mapping(source="id",target="id"),
            @Mapping(source="rut",target="rut"),
            @Mapping(source="nombre",target="name"),
            @Mapping(source="apellido",target="lastName"),
            @Mapping(source="correo",target="email"),
            @Mapping(source="area",target="area"),
            @Mapping(source="usuario",target="user")
    })
    Admin toAdmin(Administrativo administrativo);
    List<Admin> toAdmins (List<Administrativo> administrativos);
    @InheritInverseConfiguration
    Administrativo toAdministrativo (Admin admin);
}
