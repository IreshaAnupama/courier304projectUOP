package com.example.courier304project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

public class AddressCotroller {

    @GetMapping("/address")
    public String getAllAddress(){
        return " address controller work";
    }
}
