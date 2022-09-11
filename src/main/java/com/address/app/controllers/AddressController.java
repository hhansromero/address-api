package com.address.app.controllers;

import com.address.app.db.models.Address;
import com.address.app.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/addresses/by-dni/{dni}")
    public Mono<Address> findByDni(@PathVariable(value = "dni") String dni) {
        try {
            return addressService.findAddressByDni(dni);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "It does not exist.", e);
        }
    }
}
