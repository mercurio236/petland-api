package com.petland.petlandapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.petlandapi.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    
}
