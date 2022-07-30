package edu.programacionavanzada.lisbethartiles.ProyectoFinal.repositories;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.CheckoutProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CheckoutProductRepository extends JpaRepository<CheckoutProduct, Long> {
}
