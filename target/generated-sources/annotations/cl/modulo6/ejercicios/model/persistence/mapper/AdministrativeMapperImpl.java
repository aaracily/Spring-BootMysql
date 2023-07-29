package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.domain.dto.Administrative;
import cl.modulo6.ejercicios.model.persistence.entity.Administrativo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T22:58:15-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class AdministrativeMapperImpl implements AdministrativeMapper {

    @Override
    public Administrative toAdministrative(Administrativo administrativo) {
        if ( administrativo == null ) {
            return null;
        }

        Administrative administrative = new Administrative();

        administrative.setId( administrativo.getId() );
        administrative.setRun( administrativo.getRun() );
        administrative.setName( administrativo.getNombre() );
        administrative.setLastName( administrativo.getApellido() );
        administrative.setEmail( administrativo.getCorreo() );
        administrative.setArea( administrativo.getArea() );
        administrative.setUser( administrativo.getUsuario() );

        return administrative;
    }

    @Override
    public List<Administrative> toAdminis(List<Administrativo> administrativos) {
        if ( administrativos == null ) {
            return null;
        }

        List<Administrative> list = new ArrayList<Administrative>( administrativos.size() );
        for ( Administrativo administrativo : administrativos ) {
            list.add( toAdministrative( administrativo ) );
        }

        return list;
    }

    @Override
    public Administrativo toAdministrativo(Administrative administrative) {
        if ( administrative == null ) {
            return null;
        }

        Administrativo administrativo = new Administrativo();

        administrativo.setId( administrative.getId() );
        administrativo.setRun( administrative.getRun() );
        administrativo.setNombre( administrative.getName() );
        administrativo.setApellido( administrative.getLastName() );
        administrativo.setCorreo( administrative.getEmail() );
        administrativo.setArea( administrative.getArea() );
        administrativo.setUsuario( administrative.getUser() );

        return administrativo;
    }
}
