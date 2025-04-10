package com.elearning.platform.entity;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "instructors")
public class Instructor {

    @Id
    private String id;

    @NotBlank(message = "Instructor Name is required")
    private String name;

    @NotBlank(message = "Instructor Bio is required")
    private String bio;

    @NotBlank(message = "Instructor Expertise is required")
    private String expertise;

    // Constructors, Getters, Setters Already Done
}
