package cl.modulo6.ejercicios.model.domain.dto;

import lombok.*;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    public class Professional {
        private int id;
        private String run;
        private String name;
        private String lastname;
        private String email;
        private String phone;
        private User user;
        // private String userId;

    }

