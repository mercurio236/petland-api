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

import com.petland.petlandapi.cadastros.repository.ProductServicoRepository;
import com.petland.petlandapi.cadastros.model.ProdutoServico;;

@RestController
@RequestMapping("/produtos")
public class ProdutoServicoController {

    @Autowired
    private ProductServicoRepository productServicoRepository;

    @GetMapping()
    public List<ProdutoServico> listar() {
        return productServicoRepository.findAll();
    }

    @PostMapping()
    public Integer gravar(@RequestBody ProdutoServico requisicao) {
        productServicoRepository.save(requisicao);

        return requisicao.getId();
    }

    @PutMapping("/{id}")
    public Integer atualizar(@PathVariable("id") Integer id, @RequestBody ProdutoServico requisicao) {
        productServicoRepository.save(requisicao);

        return requisicao.getId();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id) {
        productServicoRepository.deleteById(id);
    }

}
