package com.mbarros.buscadorEnderecos.persistence;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.marcello.buscadorcep.model.Endereco;

import java.io.FileWriter;
import java.io.IOException;

public class ArmazenadorArquivoJson implements ArmazenadorDeDados {

    @Override
    public Endereco salvarJson(Endereco endereco) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("dados.json")) {
            gson.toJson(endereco, writer);
            System.out.println("Arquivo JSON salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return endereco;
    }
}
