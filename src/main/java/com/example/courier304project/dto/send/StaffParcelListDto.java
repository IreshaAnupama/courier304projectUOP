package com.example.courier304project.dto.send;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StaffParcelListDto {
    private Long parcelId;
   private String senderPostalCode;
   private  String receiverPostalCode;
    private float length;
    private float width;
    private  float height;
    private float weight;
    private String vehicleType;


}
