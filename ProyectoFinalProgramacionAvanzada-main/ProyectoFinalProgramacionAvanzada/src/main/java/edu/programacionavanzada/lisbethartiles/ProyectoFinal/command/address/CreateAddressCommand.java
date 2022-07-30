package edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.address;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.Address;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.address.CreateAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CreateAddressCommand  extends Command<CreateAddressResponse> {

    private String main;
    private String secondary;
    private Long telephone;

    public Address toAddress() {
        return Address.builder()
                .main(main)
                .secondary(secondary)
                .telephone(telephone)
                .build();
    }

}