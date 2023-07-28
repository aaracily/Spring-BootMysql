package cl.modulo6.ejercicios.model.domain.service;

import cl.modulo6.ejercicios.model.domain.dto.Administrative;
import cl.modulo6.ejercicios.model.persistence.mapper.AdministrativeMapper;
import cl.modulo6.ejercicios.model.persistence.repository.AdministrativeRepository;
import cl.modulo6.ejercicios.web.service.AdministrativeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdministrativeServiceImpl implements AdministrativeService {
    private final AdministrativeRepository repository;
    private final AdministrativeMapper mapper;

    public AdministrativeServiceImpl(AdministrativeRepository repository, AdministrativeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<Administrative> findById(int id) {
        return repository.findById(id).map(mapper::toAdministrative);
    }

    @Override
    public Optional<List<Administrative>> findAll() {
        return Optional.of(mapper.toAdminis(repository.findAll()));

    }

    @Override
    public Optional<Administrative> update(Administrative administrative) {
        return Optional.of(mapper.toAdministrative(repository.save(mapper.toAdministrativo(administrative))));
    }
}
