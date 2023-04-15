package com.example.courier304project.dto.receive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateCustomerDto {
    private String customerPhone;
    private String email;
    private String password;
    private String customerUserName;
    private double latitude;
    private  double longitude;
    private  String address;
    private String postalCode;
    private String district;
}
