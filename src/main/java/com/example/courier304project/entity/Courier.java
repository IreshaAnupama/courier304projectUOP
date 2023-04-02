package com.example.courier304project.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Courier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long courierId;

    private String courierPhone;
    private Time endTime;
    private double latitude;
    private double longitude;
    private  String password;
    private Time startTime;
    private String courierUserName;
    private String vehicleNo; // made getter and setter until here


}
