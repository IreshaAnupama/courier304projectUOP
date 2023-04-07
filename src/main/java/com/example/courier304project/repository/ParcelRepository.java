package com.example.courier304project.repository;

import com.example.courier304project.entity.Address;
import com.example.courier304project.entity.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParcelRepository extends JpaRepository<Parcel,Long> {

 List<Parcel> findByDeliveryVehicleIsNullOrPickupVehicleIsNull();


}
