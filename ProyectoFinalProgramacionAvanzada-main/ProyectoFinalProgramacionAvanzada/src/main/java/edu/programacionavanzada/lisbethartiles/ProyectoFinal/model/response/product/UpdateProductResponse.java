package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.product;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class UpdateProductResponse {

    private ProductDTO product;
}
