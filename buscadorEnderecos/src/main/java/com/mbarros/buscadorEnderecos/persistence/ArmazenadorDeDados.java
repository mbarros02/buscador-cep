package com.mbarros.buscadorEnderecos.persistence;

import com.mbarros.buscadorEnderecos.model.Endereco;

public interface ArmazenadorDeDados {

    public Endereco salvarJson(Endereco endereco);

}
