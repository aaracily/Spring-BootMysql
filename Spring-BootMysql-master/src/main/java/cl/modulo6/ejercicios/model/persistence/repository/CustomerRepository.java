package cl.modulo6.ejercicios.model.persistence.repository;

import cl.modulo6.ejercicios.model.persistence.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Cliente, Integer> {
}
