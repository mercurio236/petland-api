package com.petland.petlandapi.atendimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.petlandapi.atendimento.model.dto.AtendimentoRequest;
import com.petland.petlandapi.atendimento.service.AtendimentoService;

@RestController
@RequestMapping("/atendimento")
public class AtendimentoController {

    @Autowired
    private AtendimentoService atendimentoService;

    @PostMapping
    public Integer gravar(@RequestBody AtendimentoRequest requisicao) {
        return atendimentoService.gravar(requisicao);
    }
}
