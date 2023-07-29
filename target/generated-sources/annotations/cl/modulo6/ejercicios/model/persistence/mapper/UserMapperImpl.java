package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.domain.dto.User;
import cl.modulo6.ejercicios.model.persistence.entity.Usuario;
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
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        User user = new User();

        user.setId( usuario.getId() );
        user.setRole( usuario.getRol() );
        user.setUsername( usuario.getUsername() );
        user.setPassword( usuario.getPassword() );

        return user;
    }

    @Override
    public List<User> toUsers(List<Usuario> usuarios) {
        if ( usuarios == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( usuarios.size() );
        for ( Usuario usuario : usuarios ) {
            list.add( toUser( usuario ) );
        }

        return list;
    }

    @Override
    public Usuario toUsuario(User user) {
        if ( user == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setId( user.getId() );
        usuario.setRol( user.getRole() );
        usuario.setUsername( user.getUsername() );
        usuario.setPassword( user.getPassword() );

        return usuario;
    }
}
