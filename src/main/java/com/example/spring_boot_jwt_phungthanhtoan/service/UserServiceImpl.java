package com.example.spring_boot_jwt_phungthanhtoan.service;


import com.example.spring_boot_jwt_phungthanhtoan.entity.User;
import com.example.spring_boot_jwt_phungthanhtoan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }

}