package com.petland.petlandapi.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.petlandapi.cadastros.model.ProdutoServico;

public interface ProductServicoRepository extends JpaRepository<ProdutoServico, Integer> {
    
}
