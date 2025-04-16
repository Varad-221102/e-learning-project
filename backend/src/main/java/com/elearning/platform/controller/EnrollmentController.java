package com.elearning.platform.controller;

import com.elearning.platform.entity.Enrollment;
import com.elearning.platform.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
@CrossOrigin(origins = "*")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    // ✅ Only authenticated users with ROLE_USER can enroll
    @PreAuthorize("hasRole('USER')")
    @PostMapping
    public Enrollment createEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.saveEnrollment(enrollment);
    }

    // ✅ Only admins can get all enrollments
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }

    // ✅ Users and admins can access user-specific enrollments
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping("/user/{userId}")
    public List<Enrollment> getEnrollmentsByUserId(@PathVariable String userId) {
        return enrollmentService.getEnrollmentsByUserId(userId);
    }

    // ✅ Only admins can delete enrollments
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteEnrollment(@PathVariable String id) {
        enrollmentService.deleteEnrollmentById(id);
    }
}
