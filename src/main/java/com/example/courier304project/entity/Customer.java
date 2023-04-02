package com.example.courier304project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Time;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int customerId;
    private String customerPhone;
    private String email;
    private String password;
    private String customerUserName;
    private String customerFullName;
    private Time startTime;
    private Time endTime; // made getter and setter until here

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    @JsonIgnore
    private List<Address> address; //  made getter and setter



    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sender")
    @JsonIgnore
    private List<Parcel> senderParcels;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sender")
    @JsonIgnore
    private List<Parcel> receiverParcels;


    public Customer(String senderName, String senderPhoneNo, String senderEmail) {

        this.customerUserName=senderName;
        this.customerPhone=senderPhoneNo;
        this.email=senderEmail;

    }
}
