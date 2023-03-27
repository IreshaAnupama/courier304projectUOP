package com.example.courier304project.controller;

import com.example.courier304project.dto.ParcelDto;
import com.example.courier304project.entity.Customer;
import com.example.courier304project.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ParcelController {

    @Autowired
    private ParcelService parcelService;

    @PostMapping("addParcel")
    public void addParcel(@RequestBody ParcelDto parcelDto){
        parcelService.addParcel(parcelDto);
    }

    @GetMapping("/parcel")
    public String getAllParcel(){
        return "parcel controller";
    }

}
