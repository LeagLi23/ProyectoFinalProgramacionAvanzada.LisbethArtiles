package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.product;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GetProductCommand extends Command<GetProductResponse> {

    private Long id;

}