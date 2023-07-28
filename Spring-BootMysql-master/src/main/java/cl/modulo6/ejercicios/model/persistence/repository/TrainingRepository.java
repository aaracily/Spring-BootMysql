package cl.modulo6.ejercicios.model.persistence.repository;

import cl.modulo6.ejercicios.model.persistence.entity.Capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends JpaRepository<Capacitacion,Integer> {
}
