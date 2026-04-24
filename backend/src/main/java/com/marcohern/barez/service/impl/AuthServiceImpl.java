package com.marcohern.barez.service.impl;

import com.marcohern.barez.config.JwtService;
import com.marcohern.barez.domain.entity.User;
import com.marcohern.barez.dto.request.LoginRequest;
import com.marcohern.barez.dto.response.AuthResponse;
import com.marcohern.barez.exception.ApiException;
import com.marcohern.barez.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtService jwtService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public AuthResponse login(LoginRequest request) {
        User user = userRepository.findByEmail(request.email())
                .orElseThrow(() -> ApiException.badRequest("Invalid credentials"));

        if (!user.isActive()) throw ApiException.forbidden("Account is disabled");

        if (!passwordEncoder.matches(request.password(), user.getPassword()))
            throw ApiException.badRequest("Invalid credentials");

        String token = jwtService.generateToken(user);
        return new AuthResponse(token, user.getId(), user.getName(), user.getRole());
    }
}
