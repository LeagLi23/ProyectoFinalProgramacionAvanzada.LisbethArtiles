package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.address;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.address.UpdateAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UpdateAddressCommand extends Command<UpdateAddressResponse> {

    private Long id;
    private String main;
    private String secondary;
    private Long telephone;

}