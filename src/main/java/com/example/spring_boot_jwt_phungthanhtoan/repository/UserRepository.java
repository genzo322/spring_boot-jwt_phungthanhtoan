package com.example.spring_boot_jwt_phungthanhtoan.repository;


import com.example.spring_boot_jwt_phungthanhtoan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {


}

