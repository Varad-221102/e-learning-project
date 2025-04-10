package com.elearning.platform.controller;

import com.elearning.platform.dto.LoginRequest;
import com.elearning.platform.dto.RegisterRequest;
import com.elearning.platform.entity.User;
import com.elearning.platform.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend access
public class AuthController {

    @Autowired
    private AuthService authService;

    // Register API
    @PostMapping("/register")
    public User registerUser(@Valid @RequestBody RegisterRequest request) {
        return authService.registerUser(request);
    }

    // Login API
    @PostMapping("/login")
    public User loginUser(@Valid @RequestBody LoginRequest request) {
        return authService.loginUser(request);
    }
}
