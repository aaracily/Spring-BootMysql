package cl.modulo6.ejercicios.model.domain.service;
import cl.modulo6.ejercicios.model.domain.dto.Visit;
import cl.modulo6.ejercicios.model.persistence.mapper.VisitMapper;
import cl.modulo6.ejercicios.model.persistence.repository.VisitRepository;
import cl.modulo6.ejercicios.web.service.VisitService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitServiceImpl implements VisitService {

    private final VisitRepository repository;
    private final VisitMapper mapper;


    public VisitServiceImpl(VisitRepository repository, VisitMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Optional<List<Visit>> findAll() {
        return Optional.of(mapper.toVisits(repository.findAll()));
    }

    @Override
    public Optional<Visit> findById(int id) {
        return repository.findById(id).map(mapper::toVisit);
    }

    @Override
    public Optional<Visit> create(Visit visit) {
        return Optional.empty();
    }

    @Override
    public boolean delete(int id) {
        return false;
    }


}
