package com.mbarros.buscadorEnderecos;

import com.mbarros.buscadorEnderecos.exception.CepInvalidoException;
import com.mbarros.buscadorEnderecos.service.ViaCepBuscador;
import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AppTest {

    @Test
    void deveLancarExcecaoQuandoCepTemMenosDe8Digitos() {
        ViaCepBuscador buscador = new ViaCepBuscador(HttpClient.newHttpClient());

        assertThrows(CepInvalidoException.class, () -> buscador.buscarCep("123"));
    }
}
