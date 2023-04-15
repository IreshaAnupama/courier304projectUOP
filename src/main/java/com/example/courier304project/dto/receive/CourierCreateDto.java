package com.example.courier304project.dto.receive;

import com.example.courier304project.entity.PostalCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Array;
import java.sql.Time;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourierCreateDto {

    private String courierPhone;
    private String email;
    private double latitude;
    private double longitude;
    private  String password;
    private String courierUserName;
    private String vehicleNo;
    private String address;
    private String district;
    private String postalCode1;
    private String postalCode2;
    private String postalCode3;
}
