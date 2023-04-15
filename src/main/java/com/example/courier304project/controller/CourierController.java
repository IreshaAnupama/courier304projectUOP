package com.example.courier304project.controller;

import com.example.courier304project.dto.CourierDto;
import com.example.courier304project.dto.receive.CourierCreateDto;
import com.example.courier304project.entity.Courier;
import com.example.courier304project.entity.Parcel;
import com.example.courier304project.service.CourierService;
import com.example.courier304project.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class CourierController {

    @Autowired
    private CourierService courierService;

    @Autowired
    private ParcelService parcelService;

    @PostMapping("/createDriver")
    public Courier createCourier(@RequestBody CourierCreateDto courierCreateDto){
        return courierService.createCourier(courierCreateDto);
    }

    @PostMapping("/addCourier")
    public  void addCourier(@RequestBody CourierDto courierDto){
        courierService.addCourier(courierDto);


    }
    @GetMapping("/getcouriers")
    public List<Courier> getAllCouriers(){

        return courierService.getCouriers();
    }


    /*@GetMapping("/forUser")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public String forUser(){
        return "for User";
    }

    @GetMapping("/forAdmin")
    @PreAuthorize("hasRole('ADMIN')")
    public String forAdmin(){
        return "for admin";
    }*/

}
