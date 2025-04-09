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
    private boolean approved;
    private double averageRating;

    public void setAverageRating(double avg) {
    }

    public Object getTitle() {
        return true;
    }

    public double getDescription() {
        return 0.0;
    }

    public void setTitle(Object title) {
    }

    public void setApproved(boolean b) {
    }
}
