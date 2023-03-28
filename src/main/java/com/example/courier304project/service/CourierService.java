package com.example.courier304project.service;

import com.example.courier304project.dto.CourierDto;
import com.example.courier304project.entity.Courier;
import com.example.courier304project.repository.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourierService {

    @Autowired
    private CourierRepository courierRepository;
    public void addCourier(CourierDto courierDto) {

        Courier courier= new Courier(courierDto.getCourierPhone(),courierDto.getEndTime(),
                courierDto.getLatitude(),courierDto.getLongitude(),courierDto.getPassword(),
                courierDto.getStartTime(),courierDto.getCourierUserName(),courierDto.getVehicleNo());
        courierRepository.save(courier);

    }

    public List<Courier> getCouriers() {
        return courierRepository.findAll();

    }
}
