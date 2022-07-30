package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.address;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.dto.AddressDTO;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class GetAddressResponse {


    private List<AddressDTO> addresses;


}
