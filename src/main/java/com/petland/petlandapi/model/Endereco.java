package com.petland.petlandapi.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Endereco {
    private String logradouro;
    private String numero;
}
