package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.address;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.address.DeleteAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DeleteAddressCommand extends Command<DeleteAddressResponse> {

    private long id;

}