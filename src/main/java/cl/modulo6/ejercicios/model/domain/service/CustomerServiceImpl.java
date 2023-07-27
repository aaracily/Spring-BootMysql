package cl.modulo6.ejercicios.model.domain.service;

import cl.modulo6.ejercicios.model.domain.dto.Customer;
import cl.modulo6.ejercicios.model.persistence.mapper.CustomerMapper;
import cl.modulo6.ejercicios.model.persistence.repository.CustomerRepository;
import cl.modulo6.ejercicios.web.service.CustomerService;
import org.springframework.stereotype.Service;

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

        return repository.findById(id).map(mapper::toCustomer);
    }

    @Override
    public Optional<List<Customer>> findAll() {

        return Optional.of(mapper.toCustomers(repository.findAll()));
    }

    @Override
    public Optional<Customer> update(Customer customer) {
         return Optional.of(mapper.toCustomer(repository.save(mapper.toCliente(customer))));

    }
}
