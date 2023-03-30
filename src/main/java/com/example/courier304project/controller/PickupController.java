package com.example.courier304project.controller;

import com.example.courier304project.dto.PickupDto;
import com.example.courier304project.entity.Pickup;
import com.example.courier304project.service.PickupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class PickupController {

    @Autowired
    private PickupService pickupService;



    @PostMapping("/addpickup")
    public String addPickup (@RequestBody PickupDto pickupDto){
       pickupService.addPickup(pickupDto);
       return "work";
   }
}
