package com.petland.petlandapi.model.dto;

import com.petland.petlandapi.model.Endereco;
import com.petland.petlandapi.model.Perfil;

import lombok.Data;

@Data
public class CadastroResponse extends CadastroRequest {
    private Integer id;
}
