package com.petland.petlandapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.petlandapi.model.entity.AnimalEntity;

public interface AnimalRepository extends JpaRepository<AnimalEntity, Integer> {
    
}
