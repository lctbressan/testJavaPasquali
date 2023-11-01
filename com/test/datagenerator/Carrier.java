package com.test.datagenerator;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Carrier {

    private final String userEmail = "teste@trendalytics.com";
    @JsonProperty("id")
    private Long personId;
    @JsonProperty("idConta")
    private Long accountId;
    @JsonProperty("nome")
    private String name;
    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("dataNascimento")
    private LocalDate birthDate;
    @JsonProperty("week")
    private String week;


    public String getFormattedBirthDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String localDate = birthDate.format(formatter);

        return localDate;
    }
}