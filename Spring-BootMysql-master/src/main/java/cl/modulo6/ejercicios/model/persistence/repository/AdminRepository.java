package cl.modulo6.ejercicios.model.persistence.repository;

import cl.modulo6.ejercicios.model.persistence.entity.Administrativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminRepository extends JpaRepository<Administrativo, Integer>{
}
