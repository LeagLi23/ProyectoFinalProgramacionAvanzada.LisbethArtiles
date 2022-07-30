package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.payment;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.paymentmethod.CreatePaymentMethodCommand;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreatePaymentMethodRequest {

    private String name;
    private String description;

    public CreatePaymentMethodCommand toCommand() {
        return CreatePaymentMethodCommand.builder()
                .name(name)
                .description(description)
                .build();


    }
}
