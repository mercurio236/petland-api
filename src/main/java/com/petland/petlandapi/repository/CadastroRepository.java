package com.petland.petlandapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.petlandapi.model.Cadastro;


public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

}