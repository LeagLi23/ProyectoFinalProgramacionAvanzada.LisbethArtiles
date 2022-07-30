package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.paymentmethod;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.payment.UpdatePaymentMethodResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UpdatePaymentMethodCommand extends Command<UpdatePaymentMethodResponse> {

    private Long id;
    private String name;
    private String description;


}