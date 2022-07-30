package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.checkout;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout.GetCheckoutResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@AllArgsConstructor
@Getter
@Setter

public class GetAllCheckoutCommand extends Command<GetCheckoutResponse> {


}