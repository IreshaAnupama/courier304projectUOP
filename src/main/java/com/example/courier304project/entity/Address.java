package com.example.courier304project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private double latitude;
    private  double longitude;
    private  String fullAddress;
    private String postalCode;
    private String district;

    @OneToOne(mappedBy = "senderAddress")
    private Parcel sendingParcel;

    @OneToOne(mappedBy = "receiverAddress")
    private Parcel ReceivingParcel;

    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn
    @JsonIgnore
    private Customer customer; // made getter and setter

    public Address(String fullAddress, String postalCode, String district, Customer customer) {
        this.fullAddress=fullAddress;
        this.postalCode=postalCode;
        this.district=district;
        this.customer=customer;
    }

    public Address(String address, String postalCode, String district,  double latitude, double longitude,Customer customer) {
        this.fullAddress=address;
        this.postalCode=postalCode;
        this.district=district;
        this.latitude=latitude;
        this.longitude=longitude;
        this.customer=customer;
    }
    }

