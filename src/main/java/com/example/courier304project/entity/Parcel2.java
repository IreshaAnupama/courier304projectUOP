package com.example.courier304project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Parcel2{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ParcelID;

    String senderPhoneNo;
    String senderName;
    String senderEmail;
    String senderAddress;
    String senderCity;
    String senderDistrict;

    String receiverPhoneNo;
    String receiverName;
    String receiverAddress;
    String receiverDistrict;
    String receiverCity;

    //"12:12 AM" 'Date("11/24/2021")'
    String timeFrom;
    String timeTo;
    String pickupDate;
    String vehicleType;
    String postMethod;
    String paymentType;
    String specialNote; //spetial

    int cost;

}
