package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.address;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.dto.AddressDTO;
import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class UpdateAddressResponse {

    private AddressDTO address;
}
