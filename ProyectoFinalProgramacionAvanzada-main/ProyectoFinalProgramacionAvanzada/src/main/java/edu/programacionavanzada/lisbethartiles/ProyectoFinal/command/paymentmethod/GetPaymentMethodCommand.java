package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.paymentmethod;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.payment.GetPaymentMethodResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GetPaymentMethodCommand extends Command<GetPaymentMethodResponse> {

    private Long id;

}