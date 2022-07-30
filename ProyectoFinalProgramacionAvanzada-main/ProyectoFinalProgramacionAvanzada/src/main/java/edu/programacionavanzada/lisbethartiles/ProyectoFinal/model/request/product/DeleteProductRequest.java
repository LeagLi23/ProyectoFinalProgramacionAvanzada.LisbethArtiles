package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.product;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.product.DeleteProductCommand;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class DeleteProductRequest {

    private long id;

    public DeleteProductCommand toCommand() {
        return DeleteProductCommand.builder()
                .id(id)
                .build();
    }
}
