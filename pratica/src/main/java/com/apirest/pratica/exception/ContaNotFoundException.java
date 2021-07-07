package com.apirest.pratica.exception;

public class ContaNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    ContaNotFoundException(String message) {
        super(message);
    }

    public ContaNotFoundException(long id) {
        this(String.format("Conta com o código %s não foi encontrado!", id));
    }
}