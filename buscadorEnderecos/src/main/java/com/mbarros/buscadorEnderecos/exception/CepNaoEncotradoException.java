package com.mbarros.buscadorEnderecos.exception;

import com.marcello.buscadorcep.exception.CepException;

public class CepNaoEncotradoException extends CepException {
  public CepNaoEncotradoException(String message) {
    super(message);
  }
}
