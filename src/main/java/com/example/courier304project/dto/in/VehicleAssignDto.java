package com.example.courier304project.dto.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class VehicleAssignDto {

    private String pickupVehicleNo;
    private String deliveryVehicleNo;
}
