package com.example.courier304project.service;

import com.example.courier304project.dto.UserDto;
import com.example.courier304project.entity.Users;
import com.example.courier304project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public void createNewUser(UserDto userDto){
        Users user = new Users(
                    userDto.getName(),
                    userDto.getEmail(),
                    encoder.encode(userDto.getPassword()),
                    userDto.getRole()
        );
        userRepository.save(user);

    }

    @Autowired
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}
