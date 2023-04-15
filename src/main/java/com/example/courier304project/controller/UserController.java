package com.example.courier304project.controller;

import com.example.courier304project.dto.UserDto;
import com.example.courier304project.entity.Users;
import com.example.courier304project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void addUser(@RequestBody UserDto userDto){

        userService.createNewUser(userDto);
    }

    @GetMapping("/get/all")
    public List<Users> getUsers(){
        return userService.getAllUsers();

    }


}
