package com.example.courier304project.controller;

import com.example.courier304project.dto.ParcelDto;
import com.example.courier304project.dto.PickupDto;
import com.example.courier304project.dto.go.StaffParcelListDto;
import com.example.courier304project.dto.in.VehicleAssignDto;
import com.example.courier304project.entity.Address;
import com.example.courier304project.entity.Customer;
import com.example.courier304project.entity.Parcel;
import com.example.courier304project.service.ParcelService;
import com.example.courier304project.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class ParcelController {

    @Autowired
    private ParcelService parcelService;

    @GetMapping("/getParcel")
    public List<Parcel> getParcel() {
        return parcelService.getAllParcel();
    }


    @PostMapping("/addparcel")
    public Parcel addparcel(@RequestBody PickupDto pickupDto) {

        return parcelService.addParcel(pickupDto);

    }

   @GetMapping("/staffVehicle")
    public List<StaffParcelListDto> getNotVehicleParcels(){
        return  parcelService.getNotVehicleParcels();

}

    @PatchMapping ("/{id}")
    public String assignVehicle(
            @PathVariable Long id, @RequestBody VehicleAssignDto vehicleAssignDto){
        return parcelService.assignVehicle(id,vehicleAssignDto);

    }

}
