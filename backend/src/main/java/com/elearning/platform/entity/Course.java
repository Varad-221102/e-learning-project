package com.elearning.platform.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "courses")
public class Course {
    @Id
    private String id;
    private String title;
    private String description;
    private String instructorId;
    private boolean approved = false;
    private double averageRating = 0.0;
}
