package com.example.courier304project.controller;

import com.example.courier304project.dto.AuthUserDto;
import com.example.courier304project.service.JwtAuthService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/open")
public class OpenApis {

    @GetMapping("/demo")
    public String demoOpenApi(){
        return "Open api";
    }

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtAuthService jwtAuthService;

    @PostMapping("/login")
    public String authenticateUser(@RequestBody AuthUserDto dto){

        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword()));

        if(authenticate.isAuthenticated()){
            return  jwtAuthService.generateToken(dto.getUsername());

        }else{
            throw new UsernameNotFoundException
                    ("User name or password is wrong");
        }
         }

}
