package com.example.courier304project.service;

import com.example.courier304project.dto.ParcelDto;
import com.example.courier304project.dto.ParcelDto;
import com.example.courier304project.dto.PickupDto;
import com.example.courier304project.entity.Address;
import com.example.courier304project.entity.Customer;
import com.example.courier304project.entity.Parcel;
import com.example.courier304project.entity.Parcel;
import com.example.courier304project.repository.AddressRepository;
import com.example.courier304project.repository.CustomerRepository;
import com.example.courier304project.repository.ParcelRepository;
import com.example.courier304project.repository.ParcelRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ParcelService {

    @Autowired
    private ParcelRepository parcelRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AddressRepository addressRepository;
    //public void addParcel(PickupDto pickupDto) {
       //Parcel parcel=new Parcel(pickupDto.)


    public List<Parcel> getAllParcel() {
        return parcelRepository.findAll();
    }

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public Parcel addParcel(PickupDto pickupDto) {

        Customer sender=new Customer(pickupDto.getSenderName(),pickupDto.getSenderPhoneNo(),
                pickupDto.getSenderEmail());
        customerRepository.save(sender);

        Customer receiver=new Customer(pickupDto.getReceiverName(),pickupDto.getReceiverPhoneNo(),
                pickupDto.getReceiverEmail());
        customerRepository.save(receiver);

        Address senderAddress=new Address(pickupDto.getSenderAddress(),
                pickupDto.getSenderCity(),pickupDto.getSenderDistrict(),sender);
        addressRepository.save(senderAddress);
        Address receiverAddress=new Address(pickupDto.getReceiverAddress(),
                pickupDto.getReceiverCity(),pickupDto.getReceiverDistrict(),sender);
        addressRepository.save(receiverAddress);


        Parcel parcel=new Parcel(pickupDto.getParcelCost(),pickupDto.getTimeFrom(),
                pickupDto.getTimeTo(),pickupDto.getVehicleType(),pickupDto.getPostMethod(),
                pickupDto.getPaymentType(),pickupDto.getSpecialNote(),pickupDto.getDeliveryCost(),pickupDto.getPickupDate(),sender,receiver);
        parcelRepository.save(parcel);

        return parcel;
        //parcelRepository.save(modelMapper.map(parcelDto,Parcel.class));


    }
}
