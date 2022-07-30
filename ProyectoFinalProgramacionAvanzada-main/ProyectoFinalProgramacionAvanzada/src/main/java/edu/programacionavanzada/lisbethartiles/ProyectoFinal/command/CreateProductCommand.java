package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.CreateProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateProductCommand extends Command<CreateProductResponse> {

    private boolean explote;
}
