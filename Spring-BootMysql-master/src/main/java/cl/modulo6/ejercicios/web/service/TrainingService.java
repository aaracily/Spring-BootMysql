package cl.modulo6.ejercicios.web.service;

import cl.modulo6.ejercicios.model.domain.dto.Training;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public interface TrainingService {
    Optional<List<Training>> findAll();
     Optional<Training> findById(int id);
  Optional<Training> create(Training training);
    Optional<Training> update(Training training);
    boolean delete(int id);
}
