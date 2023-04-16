package com.example.courier304project.controller;

import com.example.courier304project.dto.receive.CourierCreateDto;
import com.example.courier304project.dto.receive.LogInDto;
import com.example.courier304project.dto.send.AuthenticationResponse;
import com.example.courier304project.service.AuthenticationService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody CourierCreateDto courierCreateDto
    ) {
        return ResponseEntity.ok(service.register(courierCreateDto));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody LogInDto request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }




}