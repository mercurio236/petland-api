package com.petland.petlandapi.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.petlandapi.cadastros.model.entity.CadastroEntity;


public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer> {

}