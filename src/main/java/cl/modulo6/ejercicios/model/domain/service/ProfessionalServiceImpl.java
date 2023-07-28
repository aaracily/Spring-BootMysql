package cl.modulo6.ejercicios.model.domain.service;

import cl.modulo6.ejercicios.model.domain.dto.Professional;
import cl.modulo6.ejercicios.model.persistence.mapper.ProfessionalMapper;
import cl.modulo6.ejercicios.model.persistence.repository.ProfessionalRepository;
import cl.modulo6.ejercicios.web.service.ProfessionalService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProfessionalServiceImpl implements ProfessionalService {
    private final ProfessionalRepository repository;
    private final ProfessionalMapper mapper;

    public ProfessionalServiceImpl(ProfessionalRepository repository, ProfessionalMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;


    }

    @Override
    public Optional<List<Professional>> findAll() {
        return Optional.of(mapper.toProfessionals(repository.findAll()));
    }

    @Override
    public Optional<Professional> findById(int id) {
        return repository.findById(id).map(mapper::toProfessional);
    }

    @Override
    public Optional<Professional> create(Professional professional) {
        return  Optional.of(mapper.toProfessional(repository.save(mapper.toProfesional(professional))));
    }

    @Override
    public Optional<Professional> update(Professional professional) {
        return Optional.of(mapper.toProfessional(repository.save(mapper.toProfesional(professional))));
    }

    @Override
    public boolean delete(int id) {
        //adaptación ya que repo.delete() es de tipo void
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }return false;
    }
}
