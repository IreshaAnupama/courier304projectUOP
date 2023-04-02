package com.example.courier304project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDto {

    private String customerPhone;
    private String email;
    private String password;
    private String customerUserName;
    private String customerFullName;
    private Time startTime;
    private Time endTime; // made getter and setter until here

}
