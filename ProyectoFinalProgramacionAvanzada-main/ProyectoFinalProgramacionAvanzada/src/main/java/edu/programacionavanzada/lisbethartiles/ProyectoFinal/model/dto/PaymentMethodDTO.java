package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.dto;

import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class PaymentMethodDTO {

    private Long id;

    private String name;

    private String description;

}
