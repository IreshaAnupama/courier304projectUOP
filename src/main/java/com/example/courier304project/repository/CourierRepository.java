package com.example.courier304project.repository;

import com.example.courier304project.entity.Courier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourierRepository extends JpaRepository<Courier,Long> {

    Courier findByVehicleNo(String vehicleNo);
}
