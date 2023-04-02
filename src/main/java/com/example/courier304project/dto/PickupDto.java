package com.example.courier304project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PickupDto {
    String senderName;
    String senderPhoneNo;
    String senderEmail;
    String senderAddress;
    String senderCity;
    String senderDistrict;
    Double senderLatitude;
    Double senderLongitude;

    String receiverName;
    String receiverPhoneNo;
    String receiverEmail;
    String receiverAddress;
    String receiverCity;
    String receiverDistrict;

    Date pickupDate;
    String TimeFrom;
    String timeTo;
    String vehicleType;
    String postMethod;
    String paymentType;
    String specialNote;

    float parcelCost;
    float deliveryCost;


}
