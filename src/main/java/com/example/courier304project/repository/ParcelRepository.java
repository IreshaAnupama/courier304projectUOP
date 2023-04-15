package com.example.courier304project.repository;

import com.example.courier304project.entity.Address;
import com.example.courier304project.entity.Courier;
import com.example.courier304project.entity.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParcelRepository extends JpaRepository<Parcel,Long> {

 List<Parcel> findByDeliveryVehicleIsNullOrPickupVehicleIsNull();

 List<Parcel> findAllByPickupVehicle(Courier courier);

 List<Parcel> findByPickupVehicle(Courier courier);

 List<Parcel> findByPickupVehicleCourierId(Long courierId);

 List<Parcel> findByVehicleType(String bick);

 List<Parcel> findByParcelCost(float i);
}
