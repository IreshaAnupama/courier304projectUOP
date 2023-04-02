package com.example.courier304project.controller;

import com.example.courier304project.dto.CustomerDto;
import com.example.courier304project.entity.Customer;
import com.example.courier304project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/customer")
    public String getAllCustomer(){
        return "Customer controller";
    }

    @PostMapping("/addCustomer")
    public Long addCustomer(@RequestBody CustomerDto customerDto){
        //return customerService.addCustomer(customerDto);
        return 200000L;
    }
}
