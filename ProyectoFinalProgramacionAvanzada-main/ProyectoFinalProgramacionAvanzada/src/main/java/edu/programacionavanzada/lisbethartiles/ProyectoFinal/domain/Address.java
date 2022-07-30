package edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.dto.AddressDTO;
import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String main;

    @Column
    private String secondary;

    @Column
    private Long telephone;

    /**
     * Patrón más integrado y adecuado en la lógica, cada objeto se hace responsable de sus conversiones
     *
     * @return Modelo DTO del Address
     */
    public AddressDTO toDTO() {
        return AddressDTO.builder()
                .id(id)
                .main(main)
                .secondary(secondary)
                .telephone(telephone)
                .build();
    }

}
