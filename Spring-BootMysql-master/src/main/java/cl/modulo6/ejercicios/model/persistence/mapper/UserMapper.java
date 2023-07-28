package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.domain.dto.User;
import cl.modulo6.ejercicios.model.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    //interface en la que se declara los métodos que hacen el mapeo de dto a entidad
    @Mappings({
            @Mapping(source="id",target="id"),
            @Mapping(source = "nombre",target="name"),
            @Mapping(source = "username",target="username"),
            @Mapping(source = "password",target="password")
    })
    User toUser(Usuario usuario);
    List<User> toUsers(List<Usuario> usuarios);
    @InheritInverseConfiguration
    Usuario toUsuario(User user);
}
