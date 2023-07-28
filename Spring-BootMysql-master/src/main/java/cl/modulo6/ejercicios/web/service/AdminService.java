package cl.modulo6.ejercicios.web.service;

import cl.modulo6.ejercicios.model.domain.dto.Admin;
import cl.modulo6.ejercicios.model.domain.dto.Training;

import java.util.List;
import java.util.Optional;
public interface AdminService {
    Optional<Admin> findById(int id);
    Optional<List<Admin>> findAll();
    Admin update(Admin admin);
}
