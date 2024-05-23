package com.petland.petlandapi.cadastros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.petlandapi.cadastros.model.dto.CadastroRequest;
import com.petland.petlandapi.cadastros.model.dto.CadastroResponse;
import com.petland.petlandapi.cadastros.service.CadastroService;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    @GetMapping
    public List<CadastroResponse> get() {
        return cadastroService.listar();
    }

    @PostMapping
    public Integer gravar(@RequestBody CadastroRequest requisicao) {
        return cadastroService.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public Integer atualizar(@PathVariable("id") Integer id, @RequestBody CadastroRequest requisicao) {
        return cadastroService.atualizar(id, requisicao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id) {
        cadastroService.deletar(id);
    }
    
}
