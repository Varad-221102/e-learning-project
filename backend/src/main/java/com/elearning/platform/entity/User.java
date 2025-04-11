package com.elearning.platform.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    @NotBlank(message = "Username is required")
    private String username;

    @Email(message = "Invalid email format")
    private String email;

    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @NotBlank(message = "Role is required")
    private String role;

    public void setUsername(String username) {
    }

    public void setEmail(String email) {
    }

    public void setRole(String role) {
    }

    public void setPassword(String encode) {
    }

    public String getPassword() {
        return "";
    }

    // Constructors, Getters, Setters Already Done
}
