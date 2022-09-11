package com.address.app.services;

import com.address.app.db.models.Address;
import com.address.app.db.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Mono<Address> findAddressByDni(String dni){
        return Mono.justOrEmpty(addressRepository.findByDni(dni));
    }
}
