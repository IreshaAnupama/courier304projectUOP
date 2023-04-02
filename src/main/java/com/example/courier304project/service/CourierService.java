package com.example.courier304project.service;

import com.example.courier304project.dto.CourierDto;
import com.example.courier304project.entity.Courier;
import com.example.courier304project.repository.CourierRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CourierService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CourierRepository courierRepository;
    public void addCourier(CourierDto courierDto) {

    }

    public List<Courier> getCouriers() {
        return courierRepository.findAll();

    }
}
