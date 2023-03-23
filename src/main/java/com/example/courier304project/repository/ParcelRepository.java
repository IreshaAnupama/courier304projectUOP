package com.example.courier304project.repository;

import com.example.courier304project.entity.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelRepository extends JpaRepository<Parcel,Integer> {
}
