package edu.programacionavanzada.lisbethartiles.ProyectoFinal.controller;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.checkout.CheckoutAddProductRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.checkout.CheckoutUpdateAddressRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.checkout.CheckoutUpdatePaymentMethodRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout.CheckoutAddProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout.CheckoutUpdateAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout.CheckoutUpdatePaymentMethodResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout.GetCheckoutResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.services.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequiredArgsConstructor
@RequestMapping("/checkouts")
public class CheckoutController {

    private final CheckoutService checkoutService;

    @GetMapping
    public ResponseEntity<GetCheckoutResponse> get() {
        return ResponseEntity.ok(checkoutService.getAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<GetCheckoutResponse> get(@PathVariable UUID id) {
        return ResponseEntity.ok(checkoutService.get(id));
    }

    @PostMapping("/update/address")
    public ResponseEntity<CheckoutUpdateAddressResponse> updateAddress(@RequestBody CheckoutUpdateAddressRequest checkoutUpdateAddressRequest) {
        return ResponseEntity.ok(checkoutService.updateAddress(checkoutUpdateAddressRequest));
    }

    @PostMapping("/update/payment/method")
    public ResponseEntity<CheckoutUpdatePaymentMethodResponse> updatePaymentMethod(@RequestBody CheckoutUpdatePaymentMethodRequest checkoutUpdatePaymentMethodRequest) {
        return ResponseEntity.ok(checkoutService.updatePaymentMethod(checkoutUpdatePaymentMethodRequest));
    }

    @PostMapping("/add/product")
    public ResponseEntity<CheckoutAddProductResponse> addProduct(@RequestBody CheckoutAddProductRequest checkoutAddProductRequest) {
        return ResponseEntity.ok(checkoutService.addProducts(checkoutAddProductRequest));
    }
}
