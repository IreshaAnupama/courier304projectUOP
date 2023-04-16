package com.example.courier304project.service;

import com.example.courier304project.dto.PickupDto;
import com.example.courier304project.dto.send.DriverParcelListDto;
import com.example.courier304project.dto.send.StaffParcelListDto;
import com.example.courier304project.dto.receive.VehicleAssignDto;
import com.example.courier304project.entity.*;
import com.example.courier304project.entity.Parcel;
import com.example.courier304project.exception.ResourceNotFoundException;
import com.example.courier304project.repository.*;
import com.example.courier304project.repository.ParcelRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ParcelService {

    @Autowired
    private ParcelRepository parcelRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CourierRepository courierRepository;

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
    public long addParcel(PickupDto pickupDto) {

        Customer sender=new Customer(pickupDto.getSenderName(),pickupDto.getSenderPhoneNo(),
                pickupDto.getSenderEmail());
        customerRepository.save(sender);

        Customer receiver=new Customer(pickupDto.getReceiverName(),pickupDto.getReceiverPhoneNo(),
                pickupDto.getReceiverEmail());
        customerRepository.save(receiver);

        Address senderAddress=new Address(pickupDto.getSenderAddress(),
                pickupDto.getSenderPostalCode(),pickupDto.getSenderDistrict(),sender);
        addressRepository.save(senderAddress);
        Address receiverAddress=new Address(pickupDto.getReceiverAddress(),
                pickupDto.getReceiverPostalCode(),pickupDto.getReceiverDistrict(),receiver);
        addressRepository.save(receiverAddress);


        Parcel parcel=new Parcel(pickupDto.getParcelCost(),pickupDto.getTimeFrom(),
                pickupDto.getTimeTo(),pickupDto.getVehicleType(),pickupDto.getPostMethod(),
                pickupDto.getPaymentType(),pickupDto.getSpecialNote(),pickupDto.getDeliveryCost(),pickupDto.getPickupDate(),pickupDto.getWeight()
                ,pickupDto.getLength(),pickupDto.getWidth(),pickupDto.getHeight(),
                senderAddress,receiverAddress,sender,receiver);
        parcelRepository.save(parcel);



        return parcel.getId();
        //parcelRepository.save(modelMapper.map(parcelDto,Parcel.class));


    }

    public List<StaffParcelListDto> getNotVehicleParcels() {
        List<Parcel> newParcels= parcelRepository.findByDeliveryVehicleIsNullOrPickupVehicleIsNull();
        List<StaffParcelListDto> newParcelList = new ArrayList<>();
       for(Parcel element: newParcels){

           StaffParcelListDto newp=new StaffParcelListDto(
                   element.getId(),
                   element.getSenderAddress().getPostalCode(),
                   element.getReceiverAddress().getPostalCode(),
                   element.getLength(),
                   element.getWidth(),
                   element.getHeight(),
                   element.getWeight(),
                   element.getVehicleType());

              newParcelList.add(newp);

       }
        return newParcelList;
    }

    public List<DriverParcelListDto> getDriverParcelList(Long id) {
        Courier courier=courierRepository.findCourierByCourierId(id);
        List<Parcel> parcels=parcelRepository.findByPickupVehicle(courier);
        List<DriverParcelListDto> driverParcelListDtos=new ArrayList<>();
        for(Parcel element:parcels){
            DriverParcelListDto oneParcel= new DriverParcelListDto(
                    element.getSender().getCustomerPhone(),
                    element.getSender().getCustomerUserName(),
                    element.getSenderAddress().getFullAddress(),
                    element.getSenderAddress().getLatitude(),
                    element.getSenderAddress().getLongitude(),
                    element.getTimeFrom(),
                    element.getTimeTo(),
                    element.getPickupDate(),
                    element.getPaymentType(),
                    element.getSpecialNote(),
                    element.getParcelCost(),
                    element.getDeliveryCost()
            ); driverParcelListDtos.add(oneParcel);
        }
        return driverParcelListDtos;
    }
    public String assignVehicle(Long id, VehicleAssignDto vehicleAssignDto) {

        Courier delivery= courierRepository.findByVehicleNo(vehicleAssignDto.getDeliveryVehicleNo());
        Courier pickup= courierRepository.findByVehicleNo(vehicleAssignDto.getPickupVehicleNo());

        Parcel parcel= parcelRepository.findById(id).
               orElseThrow(() -> new ResourceNotFoundException
                       ("Parcel not found for this id :"+ id));
       parcel.setPickupVehicle(pickup);
       parcel.setDeliveryVehicle(delivery);

       final Parcel updatedParcel=parcelRepository.save(parcel);

       return "vehicle assigned";
    }

    public List<Parcel> p() {
        return parcelRepository.findAll();
    }

}
