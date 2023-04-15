package com.example.courier304project.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressDto {
    private double latitude;
    private  double longitude;
    private  String fullAddress;
    private String city;
    private String district;  // made getter and setter until here


}
