package com.example.courier304project.controller;

import com.example.courier304project.dto.CourierDto;
import com.example.courier304project.entity.Courier;
import com.example.courier304project.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CourierController {

    @Autowired
    private CourierService courierService;

    @PostMapping("addCourier")
    public  void addCourier(@RequestBody CourierDto courierDto){
        courierService.addCourier(courierDto);

    }
    @GetMapping("/courier")
    public String getAllCouriers(){
        return "work code ";
    }


}
