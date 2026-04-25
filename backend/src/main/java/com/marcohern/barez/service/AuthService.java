package com.marcohern.barez.service;

import com.marcohern.barez.dto.request.LoginRequest;
import com.marcohern.barez.dto.response.AuthResponse;

public interface AuthService {
    AuthResponse login(LoginRequest request);
}
