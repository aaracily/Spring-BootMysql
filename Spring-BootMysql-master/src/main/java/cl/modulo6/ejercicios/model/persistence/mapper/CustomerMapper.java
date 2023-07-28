package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.domain.dto.Customer;
import cl.modulo6.ejercicios.model.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface CustomerMapper {
   @Mappings({
           @Mapping(source="id",target="id"),
           @Mapping(source="rut",target="rut"),
           @Mapping(source="nombre",target="name"),
           @Mapping(source="apellido",target="lastName"),
           @Mapping(source="correo",target="email"),
           @Mapping(source="telefono",target="phone"),
           @Mapping(source="afp",target="afp"),
           @Mapping(source="sistemaSalud",target="healthcareSystem"),
           @Mapping(source="direccion",target="address"),
           @Mapping(source="comuna",target="commune"),
           @Mapping(source="edad",target="age"),
           @Mapping(source="usuario",target="user")
   })
    Customer toCustomer(Cliente cliente);
    List<Customer> toCustomers (List<Cliente> clientes);
    @InheritInverseConfiguration
    Cliente toCliente (Customer customer);
}
