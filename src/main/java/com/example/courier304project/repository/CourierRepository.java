package com.example.courier304project.repository;

import com.example.courier304project.entity.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierRepository extends JpaRepository<Courier,String> {
}
