package main.java.com.marcello.buscadorcep;

import main.java.com.marcello.buscadorcep.model.Endereco;
import main.java.com.marcello.buscadorcep.service.BuscadorDeCep;
import main.java.com.marcello.buscadorcep.service.BuscadorDeCepAbstrato;
import main.java.com.marcello.buscadorcep.service.ViaCepBuscador;

import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) {

        BuscadorDeCep buscador = new ViaCepBuscador(HttpClient.newHttpClient());
        Endereco endereco = buscador.buscarCep("04943040");
        System.out.println(endereco.toString());

    }
}
