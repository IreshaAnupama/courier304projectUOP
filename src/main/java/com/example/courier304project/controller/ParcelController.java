package com.example.courier304project.controller;

import com.example.courier304project.dto.PickupDto;
import com.example.courier304project.dto.send.DriverParcelListDto;
import com.example.courier304project.dto.send.StaffParcelListDto;
import com.example.courier304project.dto.receive.VehicleAssignDto;
import com.example.courier304project.entity.Parcel;
import com.example.courier304project.service.ParcelService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class ParcelController {

    @Autowired
    private ParcelService parcelService;

    @GetMapping("/p")
    public List<Parcel> p(){
       return parcelService.p();

    }

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

    @PatchMapping ("/assign/{id}")
    public String assignVehicle(
            @PathVariable Long id, @RequestBody VehicleAssignDto vehicleAssignDto){
        parcelService.assignVehicle(id,vehicleAssignDto);
        return "hari";

    }

    @GetMapping("/{id}/driverParcelList")
    public List<DriverParcelListDto> getDriverParcelList(Long id){
        return parcelService.getDriverParcelList(id);




    }

}
