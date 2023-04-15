package com.example.courier304project.service;

import com.example.courier304project.dto.UserDto;
import com.example.courier304project.entity.Users;
import com.example.courier304project.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PasswordEncoder encoder;
    public void createNewUser(UserDto userDto){
        Users user=new Users(
                userDto.getName(),
                userDto.getEmail(),
                encoder.encode(userDto.getPassword()),
                userDto.getPassword());
        userRepository.save(user);
        //userRepository.save(modelMapper.map(userDto,Users.class));


    }

    @Autowired
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}
