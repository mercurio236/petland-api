package com.petland.petlandapi.cadastros.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.petlandapi.cadastros.model.dto.CadastroRequest;
import com.petland.petlandapi.cadastros.model.dto.CadastroResponse;
import com.petland.petlandapi.cadastros.model.entity.CadastroEntity;
import com.petland.petlandapi.cadastros.repository.CadastroRepository;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository cadastroRepository;

    public Integer gravar(CadastroRequest requisicao) {
        CadastroEntity entidade = new CadastroEntity();
        BeanUtils.copyProperties(requisicao, entidade);
        return cadastroRepository.save(entidade).getId();
    }

    public Integer atualizar(Integer id, CadastroRequest requisicao) {
        CadastroEntity entidade = cadastroRepository.findById(id).orElse(null);

        if (entidade != null) {
            BeanUtils.copyProperties(requisicao, entidade);

            return cadastroRepository.save(entidade).getId();
        }

        return null;

    }

    public List<CadastroResponse> listar() {
        List<CadastroEntity> entities = cadastroRepository.findAll();
        List<CadastroResponse> response = new ArrayList<>();

        entities.forEach(cliente -> {
            CadastroResponse res = new CadastroResponse();
            BeanUtils.copyProperties(cliente, res);
            response.add(res);
        });

        return response;
    }

    public void deletar(Integer id){
        cadastroRepository.deleteById(id);
    }
}
