package com.marcello.buscadorcep.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.marcello.buscadorcep.exception.CepInvalidoException;
import com.marcello.buscadorcep.exception.CepNaoEncotradoException;
import com.marcello.buscadorcep.exception.FalhaNaComunicacaoException;
import com.marcello.buscadorcep.model.Endereco;

public abstract class BuscadorDeCepAbstrato implements BuscadorDeCep {

    @Override
    public final Endereco buscarCep(String cep) {
    validarCep(cep);
    String resposta = consultarApi(cep);
    return montarEndereco(resposta);
    }

    public void validarCep(String cep) throws CepInvalidoException {
        if (cep.length() > 8) {
            throw new CepInvalidoException("CEP Inválido! Mais de 8 carecteres!");
        } else if (cep.length() < 8) {
            throw new CepInvalidoException("CEP Inválido! Menos de 8 caracteres!");
        }
    }

    public Endereco montarEndereco(String resposta) throws CepNaoEncotradoException {
        JsonObject json = JsonParser.parseString(resposta).getAsJsonObject();

        if (json.has("erro")) {
            throw new CepNaoEncotradoException("CEP não encontrado!");
        }

        Endereco endereco = new Gson().fromJson(json, Endereco.class);
        return endereco;
    }

    protected abstract String consultarApi(String cep) throws FalhaNaComunicacaoException;
}
