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

        public Professional(int id, String run, String name, String lastname, String email, String phone) {
            this.id = id;
            this.run = run;
            this.name = name;
            this.lastname = lastname;
            this.email = email;
            this.phone = phone;
        }
    }

