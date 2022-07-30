package edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command;

public interface CommandHandler<R, C extends Command<R>> {

    R handle(C command);
}
