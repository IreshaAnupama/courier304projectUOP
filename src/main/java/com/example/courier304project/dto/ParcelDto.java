package com.example.courier304project.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ParcelDto {

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

    float parcelCost;
    float deliveryCost;

}
