package edu.programacionavanzada.lisbethartiles.ProyectoFinal.controller;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.product.CreateProductRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.product.DeleteProductRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.product.UpdateProductRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.product.CreateProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.product.DeleteProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.product.UpdateProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<GetProductResponse> get() {
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetProductResponse> get(@PathVariable Long id) {
        return ResponseEntity.ok(productService.get(id));
    }

    @PostMapping
    public ResponseEntity<CreateProductResponse> create(@RequestBody CreateProductRequest createProductRequest) {
        return ResponseEntity.ok(productService.create(createProductRequest));
    }

    @PutMapping
    public ResponseEntity<UpdateProductResponse> update(@RequestBody UpdateProductRequest updateProductRequest) {
        return ResponseEntity.ok(productService.update(updateProductRequest));
    }

    @DeleteMapping
    public ResponseEntity<DeleteProductResponse> delete(@RequestBody DeleteProductRequest deleteProductRequest) {
        return ResponseEntity.ok(productService.delete(deleteProductRequest));
    }
}
