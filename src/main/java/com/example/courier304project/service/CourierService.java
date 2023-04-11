package com.example.courier304project.service;

import com.example.courier304project.dto.CourierDto;
import com.example.courier304project.entity.Courier;
import com.example.courier304project.entity.Parcel;
import com.example.courier304project.exception.ResourceNotFoundException;
import com.example.courier304project.repository.CourierRepository;
import com.example.courier304project.repository.ParcelRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CourierService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CourierRepository courierRepository;

    @Autowired
    private ParcelRepository parcelRepository;
    public void addCourier(CourierDto courierDto) {
        Courier courier=new Courier(courierDto.getCourierPhone()
                ,courierDto.getCourierUserName(),
                courierDto.getLatitude(),
                courierDto.getLongitude(),
                courierDto.getPassword(),
                courierDto.getVehicleNo());
        courierRepository.save(courier);

    }

    public List<Courier> getCouriers() {
        return courierRepository.findAll();

    }

    public List<Parcel> getParcelList(Long id) {
        Courier courier = courierRepository.findCourierByCourierId(id);
        return parcelRepository.findAll();

             /*   orElseThrow(() -> new ResourceNotFoundException
                        ("Parcel not found for this id :"+ id));

        /*if( parcels==null){
            throw new NullPointerException("null");
        }*/



    }
}
