package com.petland.petlandapi.cadastros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


import com.petland.petlandapi.cadastros.model.dto.AnimalRequest;
import com.petland.petlandapi.cadastros.model.dto.AnimalResponse;
import com.petland.petlandapi.cadastros.service.AnimalService;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<AnimalResponse> get() {
        return animalService.listar();
    }

    @PostMapping
    public Integer gravar(@RequestBody AnimalRequest requisicao) {
        return animalService.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public Integer atualizar(@PathVariable("id") Integer id, @RequestBody AnimalRequest requisicao) {
        return animalService.atualizar(id, requisicao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id) {
        animalService.deletar(id);
    }

}
