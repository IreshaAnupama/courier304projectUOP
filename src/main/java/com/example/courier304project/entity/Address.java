package com.example.courier304project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId; //make getter and setter begin here
    private double latitude;
    private  double longitude;
    private  String fullAddress;
    private String city;
    private String district;  // made getter and setter until here


    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn
    @JsonIgnore
    private Customer customer; // made getter and setter

    public Address(String senderAddress, String senderCity, String senderDistrict, Customer customer) {
        this.fullAddress=senderAddress;
        this.city=senderCity;
        this.district=senderDistrict;
        this.customer=customer;
    }
}
