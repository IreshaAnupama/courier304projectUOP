package com.example.courier304project.service;

import com.example.courier304project.config.JwtService;
import com.example.courier304project.dto.receive.CourierCreateDto;
import com.example.courier304project.dto.receive.LogInDto;
import com.example.courier304project.dto.send.AuthenticationResponse;
import com.example.courier304project.entity.*;
import com.example.courier304project.repository.CourierRepository;
import com.example.courier304project.repository.PostalCodeRepository;
import com.example.courier304project.repository.UserRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final PostalCodeRepository postalCodeRepository;
    private  final CourierRepository courierRepository;

    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(CourierCreateDto request) {

        PostalCode postalCode= PostalCode.builder()
                .postalCode1(request.getPostalCode1())
                .postalCode2(request.getPostalCode2())
                .postalCode3(request.getPostalCode3())
                .build();
        postalCodeRepository.save(postalCode);

        Courier courier= Courier.builder()
                .courierUserName(request.getCourierUserName())
                .email(request.getEmail()).vehicleNo(request.getVehicleNo())
                .address(request.getAddress())
                .longitude(request.getLongitude())
                .latitude(request.getLatitude())
                .vehicleNo(request.getVehicleNo())
                .postalCodes(postalCode)
                .district(request.getDistrict())
                .build();
        courierRepository.save(courier);

        User user = User.builder()
                .phoneNo(request.getCourierPhone())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.COURIER)
                .courier(courier)
                .build();
         userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);

        return AuthenticationResponse.builder().token(jwtToken).build();
    }

    public AuthenticationResponse authenticate(LogInDto request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getPhoneNo(),
                        request.getPassword()
                )
        );
        User user = userRepository.findByPhoneNo(request.getPhoneNo())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }


}
