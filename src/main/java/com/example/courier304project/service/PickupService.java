package com.example.courier304project.service;

import com.example.courier304project.dto.PickupDto;
import com.example.courier304project.entity.Pickup;
import com.example.courier304project.repository.PickupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PickupService {

    @Autowired
    private PickupRepository pickupRepository;
    public Pickup addPickup(PickupDto pickupDto) {
        Pickup pickup=new Pickup(pickupDto.getSenderPhoneNo(),
                pickupDto.getSenderName(), pickupDto.getSenderEmail(),
                pickupDto.getSenderAddress(), pickupDto.getSenderCity(),
                pickupDto.getSenderDistrict(), pickupDto.getReceiverPhoneNo(),
                pickupDto.getReceiverName(), pickupDto.getReceiverAddress(), pickupDto.getReceiverDistrict(),
                pickupDto.getReceiverCity(), pickupDto.getTimeFrom(),pickupDto.getTimeTo(),pickupDto.getPickupDate(),
                pickupDto.getVehicleType(),pickupDto.getPostMethod(),pickupDto.getPaymentType(),pickupDto.getSpecialNote()
        );
        return pickupRepository.save(pickup);
    }
}
