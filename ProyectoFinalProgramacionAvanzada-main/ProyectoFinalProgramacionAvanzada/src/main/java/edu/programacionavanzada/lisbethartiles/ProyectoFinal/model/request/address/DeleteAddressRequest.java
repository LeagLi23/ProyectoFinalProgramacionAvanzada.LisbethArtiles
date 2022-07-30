package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.address;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.address.DeleteAddressCommand;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class DeleteAddressRequest {

    private long id;

    public DeleteAddressCommand toCommand() {
        return DeleteAddressCommand.builder()
                .id(id)
                .build();
    }

}
