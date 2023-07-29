package cl.modulo6.ejercicios.web.service;

import cl.modulo6.ejercicios.model.domain.dto.User;

import java.util.List;
import java.util.Optional;



import cl.modulo6.ejercicios.model.domain.dto.Training;
import cl.modulo6.ejercicios.model.domain.dto.User;
import cl.modulo6.ejercicios.model.domain.dto.Visit;

import java.util.List;
import java.util.Optional;
public interface VisitService {
    public Optional<List<Visit>> findAll();
    public Optional<Visit> findById(int id);
    Optional<Visit> create(Visit visit);
    boolean delete(int id);
}
