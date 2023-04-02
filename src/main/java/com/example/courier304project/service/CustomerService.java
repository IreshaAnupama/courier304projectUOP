package com.example.courier304project.service;

import com.example.courier304project.dto.CustomerDto;
import com.example.courier304project.entity.Customer;
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
    private ModelMapper modelMapper;

    public void addCustomer(CustomerDto customerDto) {

        customerRepository.save(modelMapper.map(customerDto,Customer.class));

    }
}
