package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.product;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.product.CreateProductCommand;
import lombok.*;

import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class CreateProductRequest {


    private String name;
    private String description;
    private long availableQuantity;
    private BigDecimal price;


    public CreateProductCommand toCommand() {
        return CreateProductCommand.builder()
                .name(name)
                .description(description)
                .availableQuantity(availableQuantity)
                .price(price)
                .build();
    }
}
