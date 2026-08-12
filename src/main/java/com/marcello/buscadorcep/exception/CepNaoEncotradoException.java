package main.java.com.marcello.buscadorcep.exception;

public class CepNaoEncotradoException extends RuntimeException {
  public CepNaoEncotradoException(String message) {
    super(message);
  }
}
