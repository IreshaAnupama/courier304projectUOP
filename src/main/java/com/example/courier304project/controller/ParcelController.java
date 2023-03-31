package com.example.courier304project.controller;

import com.example.courier304project.dto.ParcelDto;
import com.example.courier304project.entity.Parcel;
import com.example.courier304project.service.ParcelService;
import com.example.courier304project.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class ParcelController {

    @Autowired
    private ParcelService parcelService;



    @PostMapping("/addparcel")
    public Parcel addParcel (@RequestBody ParcelDto parcelDto){
       return parcelService.addParcel(parcelDto);

   }
}
