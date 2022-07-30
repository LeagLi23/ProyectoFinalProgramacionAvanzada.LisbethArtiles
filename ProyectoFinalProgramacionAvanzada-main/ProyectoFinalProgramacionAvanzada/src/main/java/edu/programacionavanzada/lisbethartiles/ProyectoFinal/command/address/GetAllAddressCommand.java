package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.address;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter

public class GetAllAddressCommand extends Command<GetAddressResponse> {


}