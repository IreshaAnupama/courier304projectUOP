package com.example.courier304project.dto.send;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DriverSendParcelList {

    String receiverPhoneNo;
    String receiverName;
    String receiverAddress;


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
