package edu.programacionavanzada.lisbethartiles.ProyectoFinal.services;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.checkout.GetAllCheckoutCommand;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.checkout.GetCheckoutCommand;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.domain.CheckoutProduct;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.checkout.CheckoutAddProductRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.checkout.CheckoutUpdateAddressRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.checkout.CheckoutUpdatePaymentMethodRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout.CheckoutAddProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout.CheckoutUpdateAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout.CheckoutUpdatePaymentMethodResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.checkout.GetCheckoutResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.CommandBus;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class CheckoutService {

    private final CheckoutRepository checkoutRepository;
    private final PaymentMethodRepository paymentMethodRepository;
    private final AddressRepository addressRepository;
    private final ProductRepository productRepository;
    private final CheckoutProductRepository checkoutProductRepository;
    private final CommandBus commandBus;

    //List<CheckoutDTO>
    public GetCheckoutResponse getAll() {
        return commandBus.sendCommand(GetAllCheckoutCommand.builder().build());
    }
    //CheckoutDTO
    public GetCheckoutResponse get(UUID id) {

        return commandBus.sendCommand(GetCheckoutCommand.builder().build());
    }

    public CheckoutUpdatePaymentMethodResponse updatePaymentMethod(CheckoutUpdatePaymentMethodRequest checkoutUpdatePaymentMethodRequest) {

        return commandBus.sendCommand(checkoutUpdatePaymentMethodRequest.toCommand());
    }

    public CheckoutUpdateAddressResponse updateAddress(CheckoutUpdateAddressRequest checkoutUpdateAddressRequest) {
        return commandBus.sendCommand(checkoutUpdateAddressRequest.toCommand());
    }

    @Transactional
    public CheckoutAddProductResponse addProducts(CheckoutAddProductRequest checkoutAddProductRequest) {
        return commandBus.sendCommand(checkoutAddProductRequest.toCommand());
       /* Checkout checkout = checkoutRepository.findById(checkoutAddProductRequest.getId()).orElseThrow();
        Product product = productRepository.findById(checkoutAddProductRequest.getProduct()).orElseThrow();
        if (checkoutAddProductRequest.getQuantity() > product.getAvailableQuantity()) {
            throw new RuntimeException("Available product if less than you need");
        }
        List<CheckoutProduct> productsToBuy = checkout.getProductsToBuy();
        if (productsToBuy == null) {
            productsToBuy = new ArrayList<>();
        }
        CheckoutProduct checkoutProduct = findProductInCheckout(productsToBuy, product.getId());
        if (checkoutProduct == null) {
            checkoutProduct = CheckoutProduct.builder()
                    .product(product)
                    .quantity(checkoutAddProductRequest.getQuantity())
                    .build();
            checkoutProductRepository.save(checkoutProduct);
            productsToBuy.add(checkoutProduct);
        } else {
            checkoutProduct.setQuantity(checkoutProduct.getQuantity() + checkoutAddProductRequest.getQuantity());
            checkoutProductRepository.save(checkoutProduct);
        }
        product.setAvailableQuantity(product.getAvailableQuantity() - checkoutAddProductRequest.getQuantity());
        productRepository.save(product);
        checkout.setProductsToBuy(productsToBuy);
        checkoutRepository.save(checkout);
        return checkout.toDTO();*/
    }

    private CheckoutProduct findProductInCheckout(List<CheckoutProduct> productsToBuy, Long productId) {
        for (CheckoutProduct checkoutProduct : productsToBuy) {
            if (checkoutProduct.getProduct().getId().equals(productId)) {
                return checkoutProduct;
            }
        }
        return null;
    }
}
