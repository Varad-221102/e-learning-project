package com.elearning.platform.entity;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
public class Course {

    @Id
    private String id;

    @NotBlank(message = "Course Title is required")
    private String title;

    @NotBlank(message = "Course Description is required")
    private String description;

    @NotBlank(message = "Instructor Name is required")
    private String instructor;

    @NotBlank(message = "Duration is required")
    private String duration;

    public long getTitle() {
        return 0;
    }

    public Object getDescription() {
        return null;
    }

    public void setAverageRating(Object description) {
    }

    public void setApproved(boolean b) {
    }

    // Constructors, Getters, Setters Already Done
}
