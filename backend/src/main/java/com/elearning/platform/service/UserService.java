package com.elearning.platform.service;

import com.elearning.platform.entity.User;
import com.elearning.platform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create or Update User
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Get All Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get User by ID
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    // Delete User by ID
    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    // Get User by Username (optional)
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
