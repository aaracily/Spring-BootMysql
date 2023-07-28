package cl.modulo6.ejercicios.web.secutiry;

import cl.modulo6.ejercicios.model.persistence.entity.Usuario;
import cl.modulo6.ejercicios.model.persistence.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserDetailsServiceImpl implements UserDetailsService {

   private final UserRepository repository;

   public UserDetailsServiceImpl(UserRepository repository) {
      this.repository = repository;
   }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> user = repository.findByUsername(username);
        if (user.isPresent()) {
            return new MyUserDetails(user.get());
        }

        throw new UsernameNotFoundException("El usuario no existe!");
    }

}
