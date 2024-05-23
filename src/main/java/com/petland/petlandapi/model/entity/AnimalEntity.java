package com.petland.petlandapi.model.entity;

import java.time.LocalDate;

import com.petland.petlandapi.model.Especie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
@Table(name = "tab_animal")
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Setter(value = AccessLevel.NONE)
    private Integer Id;

    @Column(length = 50, nullable = false)
    private String nome;
    
    private LocalDate aniversario;

    @Enumerated(EnumType.STRING)
    private Especie especie;
}
