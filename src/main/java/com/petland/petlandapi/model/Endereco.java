package com.petland.petlandapi.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    private String logradouro;
    private String numero;
}
