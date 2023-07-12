package com.example.meusgastos.domain.exception;

public class ResourceBadRequestException extends RuntimeException{

    public ResourceBadRequestException(String message) {
        super(message);
        //super manda a mensagem para construtor da classe pai
    }
    
}