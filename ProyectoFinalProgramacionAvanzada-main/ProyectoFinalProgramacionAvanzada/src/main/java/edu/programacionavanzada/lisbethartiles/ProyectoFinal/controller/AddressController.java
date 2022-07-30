package edu.programacionavanzada.lisbethartiles.ProyectoFinal.controller;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.address.CreateAddressRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.address.DeleteAddressRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.address.UpdateAddressRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.address.CreateAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.address.DeleteAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.address.UpdateAddressResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/addresses")
public class AddressController {

    private final AddressService addressService;

    @GetMapping
    public ResponseEntity<GetAddressResponse> get() {
        return ResponseEntity.ok(addressService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetAddressResponse> get(@PathVariable Long id) {
        return ResponseEntity.ok(addressService.get(id));
    }

    @PostMapping
    public ResponseEntity<CreateAddressResponse> create(@RequestBody CreateAddressRequest createAddressRequest) {
        return ResponseEntity.ok(addressService.create(createAddressRequest));
    }

    @PutMapping
    public ResponseEntity<UpdateAddressResponse> update(@RequestBody UpdateAddressRequest updateAddressRequest) {
        return ResponseEntity.ok(addressService.update(updateAddressRequest));
    }

    @DeleteMapping
    public ResponseEntity<DeleteAddressResponse> delete(@RequestBody DeleteAddressRequest deleteAddressRequest) {
        return ResponseEntity.ok(addressService.delete(deleteAddressRequest));
    }
}
