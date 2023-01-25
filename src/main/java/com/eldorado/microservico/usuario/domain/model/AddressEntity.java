package com.eldorado.microservico.usuario.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class AddressEntity {
    private String zipCode;
    private String street;
    private String state;
    private String city;
    private String country;
    private String number;
}
