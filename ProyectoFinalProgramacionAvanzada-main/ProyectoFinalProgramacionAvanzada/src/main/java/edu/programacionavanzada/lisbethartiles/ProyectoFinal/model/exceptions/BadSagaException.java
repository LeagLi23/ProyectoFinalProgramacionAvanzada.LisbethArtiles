package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.exceptions;


public class BadSagaException extends RuntimeException {

    public BadSagaException() {
        super("Mi Saga do BUM!");
    }
}
