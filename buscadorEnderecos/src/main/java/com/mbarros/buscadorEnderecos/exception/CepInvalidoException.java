package com.mbarros.buscadorEnderecos.exception;

import com.marcello.buscadorcep.exception.CepException;

public class CepInvalidoException extends CepException {
    public CepInvalidoException(String message) {
        super(message);
    }
}
