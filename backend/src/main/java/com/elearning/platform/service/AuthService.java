package com.elearning.platform.service;

import com.elearning.platform.entity.Role;
import com.elearning.platform.dto.LoginRequest;
import com.elearning.platform.dto.RegisterRequest;
import com.elearning.platform.entity.User;
import com.elearning.platform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Register New User
    public User registerUser(RegisterRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setRole(Role.valueOf(request.getRole().toUpperCase()));

        user.setPassword(passwordEncoder.encode(request.getPassword()));  // Encrypt Password
        return userRepository.save(user);
    }

    // Login User
    public User loginUser(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail());
        if (user == null) {
            throw new RuntimeException("User not found with email: " + request.getEmail());
        }

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid Credentials");
        }

        return user;
    }
}
