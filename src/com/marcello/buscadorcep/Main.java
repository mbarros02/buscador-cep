package com.marcello.buscadorcep;

import com.marcello.buscadorcep.menuCli.Menu;
import com.marcello.buscadorcep.service.BuscadorDeCep;
import com.marcello.buscadorcep.service.ViaCepBuscador;

import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) {

        BuscadorDeCep buscador = new ViaCepBuscador(HttpClient.newHttpClient());
        Menu menu = new Menu(buscador);
        menu.iniciar();

    }
}
