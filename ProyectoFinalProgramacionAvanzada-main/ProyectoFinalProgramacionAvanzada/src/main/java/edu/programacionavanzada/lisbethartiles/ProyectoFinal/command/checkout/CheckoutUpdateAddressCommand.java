package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.checkout;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.Address;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.CheckoutProduct;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.PaymentMethod;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout.CheckoutUpdateAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;


@Builder
@AllArgsConstructor
@Getter
@Setter

public class CheckoutUpdateAddressCommand extends Command<CheckoutUpdateAddressResponse> {


    private UUID id;
    private Address address;
    private PaymentMethod paymentMethod;
    private List<CheckoutProduct> productsToBuy;


}