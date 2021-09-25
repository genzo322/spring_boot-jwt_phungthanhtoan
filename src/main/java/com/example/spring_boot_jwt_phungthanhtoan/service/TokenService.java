package com.example.spring_boot_jwt_phungthanhtoan.service;


import com.example.spring_boot_jwt_phungthanhtoan.entity.Token;



public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
