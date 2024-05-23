package com.petland.petlandapi.cadastros.model.dto;

import java.time.LocalDate;

import com.petland.petlandapi.cadastros.model.Especie;

import lombok.Data;

@Data
public class AnimalRequest {
    private String nome;
    private LocalDate aniversario;
    private Especie especie;
    private Integer tutor;
}
