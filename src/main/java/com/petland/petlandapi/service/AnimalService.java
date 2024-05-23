package com.petland.petlandapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.petlandapi.model.dto.AnimalRequest;
import com.petland.petlandapi.model.dto.AnimalResponse;
import com.petland.petlandapi.model.entity.AnimalEntity;
import com.petland.petlandapi.repository.AnimalRepository;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public Integer gravar(AnimalRequest requisicao) {
        AnimalEntity entidade = new AnimalEntity();
        BeanUtils.copyProperties(requisicao, entidade);
        return animalRepository.save(entidade).getId();
    }

    public Integer atualizar(Integer id, AnimalRequest requisicao) {
        AnimalEntity entidade = animalRepository.findById(id).orElse(null);

        if (entidade != null) {
            BeanUtils.copyProperties(requisicao, entidade);

            return animalRepository.save(entidade).getId();
        }

        return null;

    }

    public List<AnimalResponse> listar() {
        List<AnimalEntity> entities = animalRepository.findAll();
        List<AnimalResponse> response = new ArrayList<>();

        entities.forEach(animal -> {
            AnimalResponse res = new AnimalResponse();
            BeanUtils.copyProperties(animal, res);
            response.add(res);
        });

        return response;
    }

    public void deletar(Integer id){
        animalRepository.deleteById(id);
    }

}
