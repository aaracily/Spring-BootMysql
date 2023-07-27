package cl.modulo6.ejercicios.model.domain.service;

import cl.modulo6.ejercicios.model.domain.dto.Training;
import cl.modulo6.ejercicios.model.persistence.mapper.TrainingMapper;
import cl.modulo6.ejercicios.model.persistence.repository.TrainingRepository;
import cl.modulo6.ejercicios.web.service.TrainingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingServiceImpl implements TrainingService {
    private final TrainingRepository repository;
    private  final TrainingMapper mapper;

    public TrainingServiceImpl(TrainingRepository repository, TrainingMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public Optional<List<Training>> findAll() {

        return Optional.of(mapper.toTrainings(repository.findAll()));
    }

    @Override
    public Optional<Training> findById(int id) {
        return repository.findById(id).map(mapper::toTraining);
                //mapper.toTraining(repository.findById(id));
    }

    @Override
    public Optional<Training> create(Training training) {

        return  Optional.of(mapper.toTraining(repository.save(mapper.toCapacitacion(training))));
    }
    @Override
    public Optional<Training> update(Training training){
        return Optional.of(mapper.toTraining(repository.save(mapper.toCapacitacion(training))));
//para cuando era boolean mapper.toTraining(repository.save(mapper.toCapacitacion(training))).getId() == training.getId()
    }
    @Override
    public boolean delete(int id){
        //adaptación ya que repo.delete() es de tipo void
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }return false;
    }
}
