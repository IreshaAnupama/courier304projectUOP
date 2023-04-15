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
    String senderPostalCode;
    String senderDistrict;
    Double senderLatitude;
    Double senderLongitude;

    String receiverName;
    String receiverPhoneNo;
    String receiverEmail;
    String receiverAddress;
    String receiverPostalCode;
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
    float weight;
    float length;
    float width;
    float height;


}
