package cl.modulo6.ejercicios.web.secutiry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
@Bean // le indico a sprintboot que lo gestione
    public InMemoryUserDetailsManager userDetailsManager(PasswordEncoder encoder){
        //crea un usuario con contraseña y rol
        UserDetails user = User.withUsername("user").password(encoder.encode("1234"))
                .roles("USER")
                .build();
        UserDetails admin = User.withUsername("admin").password(encoder.encode("1234"))
                .roles("USER","ADMIN")
                .build();
        //maneja en memoria estos usuarios
        return new InMemoryUserDetailsManager(user,admin);

    }
@Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http         //para indicar a que path tiene acceso que rol
                .authorizeRequests()
                .requestMatchers("/**").permitAll();
               // .requestMatchers("").hasAnyRole("ADMIN")
                //.requestMatchers("").hasAnyRole("USER","ADMIN")
               //.and()
                /*.httpBasic(Customizer.withDefaults())
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/",true)//a un index
                .permitAll()
                .and()
                .logout().permitAll();*/
                //indica que cualquier request debe estar autenticado
        return http.build();
    }
@Bean
    public PasswordEncoder encoder(){
    return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
