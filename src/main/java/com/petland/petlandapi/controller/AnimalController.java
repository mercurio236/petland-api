package com.petland.petlandapi.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.petland.petlandapi.model.Animal;
import com.petland.petlandapi.repository.AnimalRepository;

@RestController
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/animais")
    public List<Animal> listar(){
        return animalRepository.findAll();
    }



}
