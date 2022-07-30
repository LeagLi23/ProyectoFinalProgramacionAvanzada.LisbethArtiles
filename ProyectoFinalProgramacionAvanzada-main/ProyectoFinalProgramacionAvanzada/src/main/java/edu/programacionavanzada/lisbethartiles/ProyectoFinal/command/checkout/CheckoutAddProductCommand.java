package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.checkout;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.dto.CheckoutProductDTO;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout.CheckoutAddProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

import java.util.List;
import java.util.UUID;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CheckoutAddProductCommand extends Command<CheckoutAddProductResponse> {

    private UUID id;
    private List<CheckoutProductDTO> productsToBuy;

// esta parte esta conectada a checkoutproduct, verificar para hacerla funcionar

    public CheckoutAddProductCommand toCommand() {
        return CheckoutAddProductCommand.builder()
                .id(id)
                .productsToBuy(productsToBuy)
                .build();
    }

}