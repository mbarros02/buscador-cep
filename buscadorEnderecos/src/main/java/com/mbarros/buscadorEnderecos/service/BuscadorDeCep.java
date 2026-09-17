package com.mbarros.buscadorEnderecos.service;

import com.mbarros.buscadorEnderecos.model.Endereco;

public interface BuscadorDeCep {

    public Endereco buscarCep(String cep);

}
