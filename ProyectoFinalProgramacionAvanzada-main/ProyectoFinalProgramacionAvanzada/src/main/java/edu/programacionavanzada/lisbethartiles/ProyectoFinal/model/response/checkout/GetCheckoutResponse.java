package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.dto.CheckoutProductDTO;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetCheckoutResponse {

    private List<CheckoutProductDTO> checkouts;
}
