package com.example.courier304project.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.List;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Courier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long courierId;


    //private Time endTime;
    private String email;
    private double latitude;
    private double longitude;
    private  String address;

   // private Time startTime;
    private String district;
    private String courierUserName;
    private String vehicleNo; // made getter and setter until here

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private PostalCode postalCodes;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private User user;





    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pickupVehicle")
    @JsonIgnore
    private List<Parcel> pickupParcels;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "deliveryVehicle")
    @JsonIgnore
    private List<Parcel> deliveryParcels;

   /* public Courier(String courierPhone, String courierUserName, double latitude, double longitude, String password, String vehicleNo) {
        this.courierPhone=courierPhone;
        this.courierUserName=courierUserName;
        this.latitude=latitude;
        this.longitude=longitude;
        this.password=password;
        this.vehicleNo=vehicleNo;
    }

    public Courier(String courierPhone, String courierUserName, double latitude, double longitude, String password, String vehicleNo, String address, String district, String email, PostalCode postalCodes) {
        this.courierPhone=courierPhone;
        this.courierUserName=courierUserName;
        this.latitude=latitude;
        this.longitude=longitude;
        this.password=password;
        this.vehicleNo=vehicleNo;
        this.email=email;
        this.postalCodes=postalCodes;
        this.address=address;
        this.district=district;}*/



}
