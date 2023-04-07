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
    private String postalCode;
    private String district;  // made getter and setter until here

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
}
