package com.eldorado.microservico.usuario.domain.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("user")
public class UserEntity {

    @Id
    private String document;
    @NonNull
    private String name;
    private char gender;
    @NonNull
    private LocalDate birthDate;
    @NonNull
    private String email;

    private String password;
    private AddressEntity addressEntity;

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", document='" + document + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
