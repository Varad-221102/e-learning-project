package com.elearning.platform.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "reviews")
public class Review {
    @Id
    private String id;
    private String courseId;
    private String studentName;
    private String comment;
    private int rating; // 1-5

    public String getCourseId() {
        return "";
    }

    public int getRating() {
        return 0;
    }
}
