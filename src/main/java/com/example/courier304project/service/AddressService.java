package com.example.courier304project.service;

import com.example.courier304project.dto.AddressDto;
import com.example.courier304project.dto.UserDto;
import com.example.courier304project.entity.Address;
import com.example.courier304project.entity.Users;
import com.example.courier304project.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    public List<Address> getAllAddress() {
        return addressRepository.findAll();

    }

    public void createNewAddress(AddressDto addressDto) {
        Address address=new Address(
                addressDto.getLatitude(),addressDto.getLongitude(),
                addressDto.getLine1(),addressDto.getLine2(),addressDto.getLine3(),addressDto.getCity(),addressDto.getDistrict()
                );
        addressRepository.save(address);

    }
}
