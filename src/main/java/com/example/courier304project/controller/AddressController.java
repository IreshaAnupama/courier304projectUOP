package com.example.courier304project.controller;

import com.example.courier304project.dto.AddressDto;
import com.example.courier304project.dto.UserDto;
import com.example.courier304project.entity.Address;
import com.example.courier304project.service.AddressService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class AddressController {
    private AddressService addressService;

    @GetMapping("/address")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @PostMapping("/add/address")
    public void addAddress(@RequestBody AddressDto addressDto){
        addressService.createNewAddress(addressDto);
    }


}
