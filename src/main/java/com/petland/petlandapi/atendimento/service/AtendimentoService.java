package com.petland.petlandapi.atendimento.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.petlandapi.atendimento.model.dto.AtendimentoRequest;
import com.petland.petlandapi.atendimento.model.entity.AtendimentoEntity;
import com.petland.petlandapi.atendimento.repository.AtendimentoRepository;


@Service
public class AtendimentoService {
    @Autowired
    private AtendimentoRepository atendimentoService;

    public Integer gravar(AtendimentoRequest requisicao) {
        AtendimentoEntity entidade = new AtendimentoEntity();
        BeanUtils.copyProperties(requisicao, entidade);
        return atendimentoService.save(entidade).getId();
    }
}
