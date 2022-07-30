package edu.programacionavanzada.lisbethartiles.ProyectoFinal.services;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.checkoutproduct.GetAllCheckoutProductCommand;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.checkoutproduct.GetCheckoutProductCommand;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkoutproduct.GetCheckoutProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.CommandBus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CheckoutProductService {

    private final CommandBus commandBus;

    public GetCheckoutProductResponse getAll() {

        return commandBus.sendCommand(GetAllCheckoutProductCommand.builder().build());
    }

    public GetCheckoutProductResponse get(Long id) {
        return commandBus.sendCommand(GetCheckoutProductCommand.builder().id(id).build());
    }

}