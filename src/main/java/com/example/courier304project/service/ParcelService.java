package com.example.courier304project.service;

import com.example.courier304project.dto.ParcelDto;
import com.example.courier304project.dto.ParcelDto;
import com.example.courier304project.entity.Parcel;
import com.example.courier304project.entity.Parcel;
import com.example.courier304project.repository.ParcelRepository;
import com.example.courier304project.repository.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParcelService {

    @Autowired
    private ParcelRepository parcelRepository;
    public Parcel addParcel(ParcelDto parcelDto) {
        Parcel pickup=new Parcel(parcelDto.getSenderPhoneNo(),
                parcelDto.getSenderName(), parcelDto.getSenderEmail(),
                parcelDto.getSenderAddress(), parcelDto.getSenderCity(),
                parcelDto.getSenderDistrict(), parcelDto.getReceiverPhoneNo(),
                parcelDto.getReceiverName(), parcelDto.getReceiverAddress(), parcelDto.getReceiverDistrict(),
                parcelDto.getReceiverCity(), parcelDto.getTimeFrom(),parcelDto.getTimeTo(),parcelDto.getPickupDate(),
                parcelDto.getVehicleType(),parcelDto.getPostMethod(),parcelDto.getPaymentType(),parcelDto.getSpecialNote()
        ,parcelDto.getCost());
        return parcelRepository.save(pickup);
    }
}
