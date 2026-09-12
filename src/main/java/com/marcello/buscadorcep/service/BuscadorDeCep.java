package main.java.com.marcello.buscadorcep.service;

import main.java.com.marcello.buscadorcep.model.Endereco;

public interface BuscadorDeCep {

    public Endereco buscarCep(String cep);

    public void validarCep(String cep);

}
