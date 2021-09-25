package com.example.spring_boot_jwt_phungthanhtoan.service;


import com.example.spring_boot_jwt_phungthanhtoan.authen.UserPrincipal;
import com.example.spring_boot_jwt_phungthanhtoan.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
