package cl.modulo6.ejercicios.web.service;

import cl.modulo6.ejercicios.model.domain.dto.Customer;
import cl.modulo6.ejercicios.model.domain.dto.Training;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findById(int id);
    Optional<List<Customer>> findAll();
    Optional<Customer> update(Customer customer);
}
