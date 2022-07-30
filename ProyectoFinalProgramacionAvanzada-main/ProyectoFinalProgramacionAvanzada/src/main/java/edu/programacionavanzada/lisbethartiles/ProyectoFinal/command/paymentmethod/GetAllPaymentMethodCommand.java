package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.paymentmethod;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.payment.GetPaymentMethodResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@AllArgsConstructor
@Getter
@Setter

public class GetAllPaymentMethodCommand extends Command<GetPaymentMethodResponse> {


}