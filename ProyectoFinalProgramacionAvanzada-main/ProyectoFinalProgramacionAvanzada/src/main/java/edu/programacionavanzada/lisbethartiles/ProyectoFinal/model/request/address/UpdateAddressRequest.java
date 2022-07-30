package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.address;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.address.UpdateAddressCommand;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class UpdateAddressRequest {

    private Long id;
    private String main;
    private String secondary;
    private Long telephone;

    public UpdateAddressCommand toCommand() {
        return UpdateAddressCommand.builder()
                .main(main)
                .secondary(secondary)
                .telephone(telephone)
                .build();
    }


}
