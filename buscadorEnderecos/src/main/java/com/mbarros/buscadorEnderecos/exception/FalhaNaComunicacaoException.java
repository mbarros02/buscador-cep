package com.mbarros.buscadorEnderecos.exception;

import com.marcello.buscadorcep.exception.CepException;

public class FalhaNaComunicacaoException extends CepException {
  public FalhaNaComunicacaoException(String message) {
    super(message);
  }
}
