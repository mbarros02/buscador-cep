package com.marcello.buscadorcep.model;

public class Endereco {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Endereço:" + '\n' + '\n' +
                "Bairro: " + bairro + '\n' +
                "CEP: " + cep + '\n' +
                "Logradouro: " + logradouro + '\n' +
                "Complemento: " + complemento + '\n' +
                "Localidade: " + localidade + '\n' +
                "UF: " + uf + '\n' +
                "Estado: " + estado;
    }
}
