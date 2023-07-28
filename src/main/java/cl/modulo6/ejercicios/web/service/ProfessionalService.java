package cl.modulo6.ejercicios.web.service;

import cl.modulo6.ejercicios.model.domain.dto.Professional;

import java.util.List;
import java.util.Optional;

public interface ProfessionalService {
    Optional<List<Professional>> findAll();
    Optional<Professional> findById(int id);
    Optional<Professional> create(Professional professional);
    Optional<Professional> update(Professional professional);
    boolean delete(int id);
}
