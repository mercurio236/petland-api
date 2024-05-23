package com.petland.petlandapi.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.petlandapi.cadastros.model.entity.AnimalEntity;

public interface AnimalRepository extends JpaRepository<AnimalEntity, Integer> {
    
}
