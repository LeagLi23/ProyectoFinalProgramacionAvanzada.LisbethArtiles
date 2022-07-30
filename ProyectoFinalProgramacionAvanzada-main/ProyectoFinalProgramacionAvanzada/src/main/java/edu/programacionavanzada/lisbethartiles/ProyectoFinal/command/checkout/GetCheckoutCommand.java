package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.checkout;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GetCheckoutCommand extends Command<GetAddressResponse> {

    private Long id;

}