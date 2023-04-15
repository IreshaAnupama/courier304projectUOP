package com.example.courier304project.controller;

import com.example.courier304project.dto.CustomerDto;
import com.example.courier304project.dto.receive.CreateCustomerDto;
import com.example.courier304project.entity.Customer;
import com.example.courier304project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")

public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/customer")
    public String getAllCustomer(){
        return "Customer controller";
    }

    @PostMapping("/createCustomer")
    public Customer createCustomer(@RequestBody CreateCustomerDto customerDto){
        return customerService.addCustomer(customerDto);

    }
}
