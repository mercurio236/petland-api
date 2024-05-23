package com.petland.petlandapi.cadastros.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Endereco {
    private String logradouro;
    private String numero;
}
