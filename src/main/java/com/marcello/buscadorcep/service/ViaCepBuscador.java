package main.java.com.marcello.buscadorcep.service;

import main.java.com.marcello.buscadorcep.exception.FalhaNaComunicacaoException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ViaCepBuscador extends BuscadorDeCepAbstrato {

    private final HttpClient httpClient;

    public ViaCepBuscador(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    protected String consultarApi(String cep) throws FalhaNaComunicacaoException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(req, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        return json;
    }
}
