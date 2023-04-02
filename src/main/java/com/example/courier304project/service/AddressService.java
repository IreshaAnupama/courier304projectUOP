package com.example.courier304project.service;

import com.example.courier304project.dto.AddressDto;
import com.example.courier304project.dto.UserDto;
import com.example.courier304project.entity.Address;
import com.example.courier304project.entity.Users;
import com.example.courier304project.repository.AddressRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    public List<Address> getAllAddress() {
        return addressRepository.findAll();

    }

    public void createNewAddress(AddressDto addressDto) {
       /* Address address=new Address(
                addressDto.getLatitude(),addressDto.getLongitude(),
                addressDto.getFullAddress(),addressDto.getCity(),addressDto.getDistrict()
                );
        addressRepository.save(address); */

    }
}
