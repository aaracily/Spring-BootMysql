package cl.modulo6.ejercicios.model.domain.service;

import cl.modulo6.ejercicios.model.domain.dto.User;
import cl.modulo6.ejercicios.model.persistence.mapper.UserMapper;
import cl.modulo6.ejercicios.model.persistence.repository.UserRepository;
import cl.modulo6.ejercicios.web.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<User>> findAll() {
        return Optional.of(mapper.toUsers(repository.findAll()));

    }

    @Override
    public Optional<User> findById(int id) {

        return repository.findById(id).map(mapper ::toUser);
    }

    @Override
    public Optional<User> create(User user) {
        return Optional.of(mapper.toUser(repository.save(mapper.toUsuario(user))));
    }
}
