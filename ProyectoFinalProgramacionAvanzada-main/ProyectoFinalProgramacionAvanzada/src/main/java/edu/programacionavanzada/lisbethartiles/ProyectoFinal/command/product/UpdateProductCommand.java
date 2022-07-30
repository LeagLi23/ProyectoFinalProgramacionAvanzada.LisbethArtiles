package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.product;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.product.UpdateProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

import java.math.BigDecimal;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UpdateProductCommand extends Command<UpdateProductResponse> {

    private Long id;
    private String name;
    private String description;
    private long availableQuantity;
    private BigDecimal price;

}