package edu.programacionavanzada.lisbethartiles.ProyectoFinal.controller;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkoutproduct.GetCheckoutProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.services.CheckoutProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/checkouts_products")
public class CheckoutProductController {

    private final CheckoutProductService checkoutProductService;

    @GetMapping
    public ResponseEntity<GetCheckoutProductResponse> get() {
        return ResponseEntity.ok(checkoutProductService.getAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<GetCheckoutProductResponse> get(@PathVariable Long id) {
        return ResponseEntity.ok(checkoutProductService.get(id));
    }
}
