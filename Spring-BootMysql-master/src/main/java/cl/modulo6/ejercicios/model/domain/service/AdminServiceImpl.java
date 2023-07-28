package cl.modulo6.ejercicios.model.domain.service;

import cl.modulo6.ejercicios.model.domain.dto.Admin;
import cl.modulo6.ejercicios.model.persistence.mapper.AdminMapper;
import cl.modulo6.ejercicios.model.persistence.repository.AdminRepository;
import cl.modulo6.ejercicios.web.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {
    private final AdminRepository repository;
    private final AdminMapper mapper;

    public AdminServiceImpl(AdminRepository repository, AdminMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<Admin> findById(int id) {

        return repository.findById(id).map(mapper::toAdmin);
    }

    @Override
    public Optional<List<Admin>> findAll() {

        return Optional.of(mapper.toAdmins(repository.findAll()));
    }

    @Override
    public Admin update(Admin admin) {
        return mapper.toAdmin(repository.save(mapper.toAdministrativo(admin)));

    }
    public Admin create(Admin admin){
        return mapper.toAdmin(repository.save(mapper.toAdministrativo(admin)));
    }
}
