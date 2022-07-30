package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.payment;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.paymentmethod.DeletePaymentMethodCommand;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeletePaymentMethodRequest {

    private Long id;

    public DeletePaymentMethodCommand toCommand() {
        return DeletePaymentMethodCommand.builder()
                .id(id)
                .build();
    }

}
