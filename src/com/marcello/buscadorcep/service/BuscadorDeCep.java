package com.marcello.buscadorcep.service;

import com.marcello.buscadorcep.model.Endereco;

public interface BuscadorDeCep {

    public Endereco buscarCep(String cep);

}
