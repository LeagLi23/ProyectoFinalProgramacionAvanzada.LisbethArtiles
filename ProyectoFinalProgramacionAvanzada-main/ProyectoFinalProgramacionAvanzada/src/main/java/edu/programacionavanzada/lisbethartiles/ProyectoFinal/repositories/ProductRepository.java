package edu.programacionavanzada.lisbethartiles.ProyectoFinal.repositories;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
