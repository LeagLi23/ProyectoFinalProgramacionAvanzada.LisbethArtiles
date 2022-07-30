package edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class AddressDTO {

    private Long id;

    private String main;

    private String secondary;

    private Long telephone;

}
