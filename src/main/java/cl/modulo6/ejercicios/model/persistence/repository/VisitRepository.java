package cl.modulo6.ejercicios.model.persistence.repository;

import cl.modulo6.ejercicios.model.persistence.entity.Capacitacion;
import cl.modulo6.ejercicios.model.persistence.entity.Visita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface VisitRepository extends JpaRepository<Visita,Integer> {
}