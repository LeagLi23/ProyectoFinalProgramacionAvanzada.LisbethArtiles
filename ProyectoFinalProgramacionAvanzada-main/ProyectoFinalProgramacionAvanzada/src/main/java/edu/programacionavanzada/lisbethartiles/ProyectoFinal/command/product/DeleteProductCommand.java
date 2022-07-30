package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.product;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.product.DeleteProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DeleteProductCommand extends Command<DeleteProductResponse> {

    private long id;

}