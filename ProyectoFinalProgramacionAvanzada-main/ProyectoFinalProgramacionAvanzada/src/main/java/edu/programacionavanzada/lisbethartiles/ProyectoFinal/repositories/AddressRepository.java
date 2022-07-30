package edu.programacionavanzada.lisbethartiles.ProyectoFinal.repositories;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
