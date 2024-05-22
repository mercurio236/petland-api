package com.petland.petlandapi.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Perfil {
    private boolean cliente;
    private boolean fornecedor;
    private boolean prestador;
}
