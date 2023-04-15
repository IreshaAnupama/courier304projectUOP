package com.example.courier304project.service;

import com.example.courier304project.repository.PostalCodeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PostalCodeService {

    @Autowired
    private PostalCodeRepository postalCodeRepository;
}
