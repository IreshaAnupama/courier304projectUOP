package com.example.courier304project.service;

import com.example.courier304project.dto.CustomerDto;
import com.example.courier304project.dto.receive.CreateCustomerDto;
import com.example.courier304project.entity.Address;
import com.example.courier304project.entity.Customer;
import com.example.courier304project.repository.AddressRepository;
import com.example.courier304project.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private  CustomerRepository customerRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Customer addCustomer(CreateCustomerDto customerDto) {

        Customer customer= new Customer(customerDto.getCustomerPhone(),customerDto.getCustomerUserName(),customerDto.getEmail(),customerDto.getPassword());
        customerRepository.save(customer);

        Address address= new Address(customerDto.getAddress(),customerDto.getPostalCode(),customerDto.getDistrict(),customerDto.getLatitude(),customerDto.getLongitude(),customer);
        addressRepository.save(address);

                return customer;
    }
}
