package com.petland.petlandapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.petlandapi.model.entity.CadastroEntity;


public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer> {

}