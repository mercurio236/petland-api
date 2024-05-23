package com.petland.petlandapi.atendimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.petlandapi.atendimento.model.entity.AtendimentoEntity;

public interface AtendimentoRepository extends JpaRepository<AtendimentoEntity, Integer>{
    
}
