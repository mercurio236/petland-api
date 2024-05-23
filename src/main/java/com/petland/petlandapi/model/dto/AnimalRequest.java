package com.petland.petlandapi.model.dto;

import java.time.LocalDate;

import com.petland.petlandapi.model.Especie;

import lombok.Data;

@Data
public class AnimalRequest {
    private String nome;
    private LocalDate aniversario;
    private Especie especie;
}
