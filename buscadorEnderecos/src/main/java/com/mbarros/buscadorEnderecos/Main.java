package com.mbarros.buscadorEnderecos;

import com.mbarros.buscadorEnderecos.service.BuscadorDeCep;
import com.mbarros.buscadorEnderecos.service.ViaCepBuscador;
import com.mbarros.buscadorEnderecos.view.Menu;

import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) {

        BuscadorDeCep buscador = new ViaCepBuscador(HttpClient.newHttpClient());
        Menu menu = new Menu(buscador);
        menu.iniciar();

    }
}
