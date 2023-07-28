package cl.modulo6.ejercicios.web.service;

import cl.modulo6.ejercicios.model.domain.dto.Administrative;

import java.util.List;
import java.util.Optional;

public interface AdministrativeService {
    Optional<Administrative> findById(int id);
    Optional<List<Administrative>>findAll();
    Optional<Administrative>update(Administrative administrative);
}
