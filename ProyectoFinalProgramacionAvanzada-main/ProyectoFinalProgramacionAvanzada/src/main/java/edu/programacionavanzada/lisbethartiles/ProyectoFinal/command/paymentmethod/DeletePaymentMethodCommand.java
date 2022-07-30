package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.paymentmethod;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.payment.DeletePaymentMethodResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DeletePaymentMethodCommand extends Command<DeletePaymentMethodResponse> {

    private long id;

}