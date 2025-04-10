package com.elearning.platform.controller;

import com.elearning.platform.entity.Enrollment;
import com.elearning.platform.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
@CrossOrigin(origins = "*")  // Allow frontend access
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    // Enroll a Student (Create Enrollment)
    @PostMapping
    public Enrollment createEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.saveEnrollment(enrollment);
    }

    // Get All Enrollments
    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }

    // Get Enrollments by User ID
    @GetMapping("/user/{userId}")
    public List<Enrollment> getEnrollmentsByUserId(@PathVariable String userId) {
        return enrollmentService.getEnrollmentsByUserId(userId);
    }

    // Delete Enrollment by ID
    @DeleteMapping("/{id}")
    public void deleteEnrollment(@PathVariable String id) {
        enrollmentService.deleteEnrollmentById(id);
    }
}
