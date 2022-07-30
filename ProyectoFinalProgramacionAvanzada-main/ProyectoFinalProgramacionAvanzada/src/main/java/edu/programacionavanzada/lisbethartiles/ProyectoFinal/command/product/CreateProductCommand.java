package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.product;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.Product;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.product.CreateProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

import java.math.BigDecimal;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CreateProductCommand extends Command<CreateProductResponse> {

    private String name;
    private String description;
    private long availableQuantity;
    private BigDecimal price;


    public Product toProduct() {
        return Product.builder()
                .name(name)
                .description(description)
                .availableQuantity(availableQuantity)
                .price(price)
                .build();
    }


}