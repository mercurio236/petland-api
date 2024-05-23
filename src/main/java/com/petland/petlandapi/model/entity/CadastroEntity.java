package com.petland.petlandapi.model.entity;

import com.petland.petlandapi.model.Endereco;
import com.petland.petlandapi.model.Perfil;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;


@Entity
@Table(name = "tab_cadastro")
@Data
public class CadastroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.NONE)
    private Integer id;
    private String nome;

    @Embedded
    private Perfil perfil;
    
    @Embedded
    private Endereco endereco;
}
