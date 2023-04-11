package com.example.courier304project.dto.send;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DriverParcelListDto {
    String phoneNo;
    String senderUserName;
    String address;
    double latitude;
    double longitude;

    String timeFrom;
    String timeTo;
    Date date;
    String paymentType;
    String specialNote;
    float parcelCost;
    float deliveryCost;
}
