package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.product;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter

public class GetAllProductCommand extends Command<GetProductResponse> {


}