package com.petland.petlandapi.cadastros.model.dto;

import com.petland.petlandapi.cadastros.model.Endereco;
import com.petland.petlandapi.cadastros.model.Perfil;

import lombok.Data;

@Data
public class CadastroResponse extends CadastroRequest {
    private Integer id;
}
