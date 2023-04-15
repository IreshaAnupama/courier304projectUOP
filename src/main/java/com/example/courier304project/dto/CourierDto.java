package com.example.courier304project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourierDto {

    private String courierPhone;
    private Time endTime;
    private double latitude;
    private double longitude;
    private  String password;
    private Time startTime;
    private String courierUserName;
    private String vehicleNo; // made getter and setter until here


}
