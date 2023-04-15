package com.example.courier304project.repository;

import com.example.courier304project.entity.Courier;
import com.example.courier304project.entity.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourierRepository extends JpaRepository<Courier,Long> {

    Courier findByVehicleNo(String vehicleNo);



    Courier findCourierByCourierId(Long id);
}
