package com.example.courier304project.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pickupVehicle")
    @JsonIgnore
    private List<Parcel> PickupParcels;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "deliveryVehicle")
    @JsonIgnore
    private List<Parcel> deliveryParcels;

}
