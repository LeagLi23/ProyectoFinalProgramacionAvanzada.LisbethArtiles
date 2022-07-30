package edu.programacionavanzada.lisbethartiles.ProyectoFinal.repositories;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
}
