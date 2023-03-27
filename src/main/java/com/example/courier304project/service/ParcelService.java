package com.example.courier304project.service;

import com.example.courier304project.dto.ParcelDto;
import com.example.courier304project.entity.Address;
import com.example.courier304project.entity.Customer;
import com.example.courier304project.entity.Parcel;
import com.example.courier304project.repository.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcelService {

    @Autowired
    private ParcelRepository parcelRepository;

    public void addParcel(ParcelDto parcelDto){
        Parcel parcel= new Parcel(parcelDto.getCost(),parcelDto.getPaymentType(),
                parcelDto.getLength(),parcelDto.getWidth(),parcelDto.getHeight(),parcelDto.getStatus(),parcelDto.getCustomer());

        parcelRepository.save(parcel);
    }



}
