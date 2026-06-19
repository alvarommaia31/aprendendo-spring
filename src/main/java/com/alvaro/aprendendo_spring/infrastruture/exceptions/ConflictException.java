package com.alvaro.aprendendo_spring.infrastruture.exceptions;

public class ConflictException extends RuntimeException{
    public ConflictException(String mensagem){
        super(mensagem);

    }
    public ConflictException(String mensagem, Throwable throwable){
        super(mensagem);
    }
}
