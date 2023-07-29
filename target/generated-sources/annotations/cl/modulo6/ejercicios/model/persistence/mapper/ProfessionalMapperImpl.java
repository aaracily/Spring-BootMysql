package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.domain.dto.Professional;
import cl.modulo6.ejercicios.model.persistence.entity.Profesional;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T22:58:15-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class ProfessionalMapperImpl implements ProfessionalMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Professional toProfessional(Profesional profesional) {
        if ( profesional == null ) {
            return null;
        }

        Professional professional = new Professional();

        professional.setId( profesional.getId() );
        professional.setRun( profesional.getRun() );
        professional.setName( profesional.getNombre() );
        professional.setLastname( profesional.getApellido() );
        professional.setEmail( profesional.getCorreo() );
        professional.setPhone( profesional.getTelefono() );
        professional.setUser( userMapper.toUser( profesional.getUsuario() ) );

        return professional;
    }

    @Override
    public List<Professional> toProfessionals(List<Profesional> professionals) {
        if ( professionals == null ) {
            return null;
        }

        List<Professional> list = new ArrayList<Professional>( professionals.size() );
        for ( Profesional profesional : professionals ) {
            list.add( toProfessional( profesional ) );
        }

        return list;
    }

    @Override
    public Profesional toProfesional(Professional professional) {
        if ( professional == null ) {
            return null;
        }

        Profesional profesional = new Profesional();

        profesional.setId( professional.getId() );
        profesional.setRun( professional.getRun() );
        profesional.setNombre( professional.getName() );
        profesional.setApellido( professional.getLastname() );
        profesional.setCorreo( professional.getEmail() );
        profesional.setTelefono( professional.getPhone() );
        profesional.setUsuario( userMapper.toUsuario( professional.getUser() ) );

        return profesional;
    }
}
