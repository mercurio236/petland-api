package com.petland.petlandapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.petlandapi.model.ProdutoServico;

public interface ProductServicoRepository extends JpaRepository<ProdutoServico, Integer> {
    
}
