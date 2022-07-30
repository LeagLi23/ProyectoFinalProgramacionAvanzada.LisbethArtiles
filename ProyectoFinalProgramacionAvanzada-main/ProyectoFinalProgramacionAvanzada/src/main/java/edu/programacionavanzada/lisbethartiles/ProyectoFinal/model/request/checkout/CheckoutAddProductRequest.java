package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.checkout;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.checkout.CheckoutAddProductCommand;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.CheckoutProduct;
import lombok.*;

import java.util.List;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutAddProductRequest {

    private UUID id;

    private List<CheckoutProduct> productsToBuy;

    public CheckoutAddProductCommand toCommand() {
        return CheckoutAddProductCommand.builder()
                //.productsToBuy(productsToBuy)
                .build();
    }
}
