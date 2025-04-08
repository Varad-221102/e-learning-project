package com.elearning.platform.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "instructors")
public class Instructor {
    @Id
    private String id;
    private String name;
    private String expertise;
}
