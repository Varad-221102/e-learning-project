package com.elearning.platform.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payments")
public class Payment {

    @Id
    private String id;

    private String userId;         // Who made the payment
    private String courseId;       // For which course
    private String paymentId;      // Razorpay Payment ID
    private String status;         // SUCCESS / FAILED
    private String paymentDate;    // Payment date

    // Constructors
    public Payment() {
    }

    public Payment(String id, String userId, String courseId, String paymentId, String status, String paymentDate) {
        this.id = id;
        this.userId = userId;
        this.courseId = courseId;
        this.paymentId = paymentId;
        this.status = status;
        this.paymentDate = paymentDate;
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}
