package cl.modulo6.ejercicios.model.domain.service;

import cl.modulo6.ejercicios.model.domain.dto.Customer;
import cl.modulo6.ejercicios.model.domain.dto.Training;
import cl.modulo6.ejercicios.model.persistence.mapper.CustomerMapper;
import cl.modulo6.ejercicios.model.persistence.repository.CustomerRepository;
import cl.modulo6.ejercicios.web.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    public CustomerServiceImpl(CustomerRepository repository, CustomerMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<Customer> findById(int id) {
      /* Optional<Customer> customerOptional = repository.findById(id).map(mapper ::toCustomer);
        if(!customerOptional.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "not found customer");
        }
        Customer cust = customerOptional.get();

        return customerOptional;*/

        return repository.findById(id).map(mapper::toCustomer);
    }

    @Override
    public Optional<List<Customer>> findAll() {

        return Optional.of(mapper.toCustomers(repository.findAll()));
    }

    @Override
    public Optional<Customer> update(Customer customer) {

       /*Optional<Customer> cust = Optional.of(mapper.toCustomer(repository.save(mapper.toCliente(customer))));

       if(cust.isPresent())
            cust.get().getId() == customer.getId()){
         return   mapper.toCustomer(repository.save(mapper.toCliente(customer)));

       }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "not found");*/


         return Optional.of(mapper.toCustomer(repository.save(mapper.toCliente(customer))));

    }
    public Customer create(Customer customer){
        return mapper.toCustomer(repository.save(mapper.toCliente(customer)));
    }
}
