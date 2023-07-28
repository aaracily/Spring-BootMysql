package cl.modulo6.ejercicios.model.persistence.repository;

import cl.modulo6.ejercicios.model.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario,Integer> {
}
