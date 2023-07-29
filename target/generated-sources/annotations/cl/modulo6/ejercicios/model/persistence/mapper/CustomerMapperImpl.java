package cl.modulo6.ejercicios.model.persistence.mapper;

import cl.modulo6.ejercicios.model.domain.dto.Customer;
import cl.modulo6.ejercicios.model.persistence.entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T23:46:12-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Customer toCustomer(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( cliente.getId() );
        customer.setRut( cliente.getRut() );
        customer.setName( cliente.getNombre() );
        customer.setLastName( cliente.getApellido() );
        customer.setEmail( cliente.getCorreo() );
        customer.setPhone( cliente.getTelefono() );
        customer.setAfp( cliente.getAfp() );
        customer.setHealthcareSystem( cliente.getSistemaSalud() );
        customer.setAddress( cliente.getDireccion() );
        customer.setCommune( cliente.getComuna() );
        customer.setAge( cliente.getEdad() );
        customer.setUser( userMapper.toUser( cliente.getUsuario() ) );

        return customer;
    }

    @Override
    public List<Customer> toCustomers(List<Cliente> clientes) {
        if ( clientes == null ) {
            return null;
        }

        List<Customer> list = new ArrayList<Customer>( clientes.size() );
        for ( Cliente cliente : clientes ) {
            list.add( toCustomer( cliente ) );
        }

        return list;
    }

    @Override
    public Cliente toCliente(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( customer.getId() );
        cliente.setRut( customer.getRut() );
        cliente.setNombre( customer.getName() );
        cliente.setApellido( customer.getLastName() );
        cliente.setCorreo( customer.getEmail() );
        cliente.setTelefono( customer.getPhone() );
        cliente.setAfp( customer.getAfp() );
        cliente.setSistemaSalud( customer.getHealthcareSystem() );
        cliente.setDireccion( customer.getAddress() );
        cliente.setComuna( customer.getCommune() );
        cliente.setEdad( customer.getAge() );
        cliente.setUsuario( userMapper.toUsuario( customer.getUser() ) );

        return cliente;
    }
}
