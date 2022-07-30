package edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model;

public interface SagaStep<T> {

    String getName();

    SagaStepHandler<T> getHandler();

    SagaStepCompensator<T> getCompensator();
}
