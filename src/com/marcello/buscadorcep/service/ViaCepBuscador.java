package com.marcello.buscadorcep.service;

import com.marcello.buscadorcep.exception.FalhaNaComunicacaoException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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
        } catch (IOException | InterruptedException e) {
            throw new FalhaNaComunicacaoException("Falha ao comunicar com a API.");
        }
        String json = response.body();
        return json;
    }
}
