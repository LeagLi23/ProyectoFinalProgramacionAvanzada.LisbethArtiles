package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.paymentmethod;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.PaymentMethod;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.payment.CreatePaymentMethodResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CreatePaymentMethodCommand extends Command<CreatePaymentMethodResponse> {

    private String name;
    private String description;

    public PaymentMethod toPaymentMethod() {
        return PaymentMethod.builder()
                .name(name)
                .description(description)
                .build();
    }

}