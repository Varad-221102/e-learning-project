package com.elearning.platform.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "assignments")
public class Assignment {
    @Id
    private String id;
    private String courseId;
    private String title;
    private String description;
    private String submissionLink;
    private String studentId;

    // ✅ Getter for courseId
    public String getCourseId() {
        return courseId;
    }

    // ✅ Setters and other getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubmissionLink() {
        return submissionLink;
    }

    public void setSubmissionLink(String submissionLink) {
        this.submissionLink = submissionLink;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
