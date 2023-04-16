package com.example.courier304project.repository;

import com.example.courier304project.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByPhoneNo(String phoneNo);
}
