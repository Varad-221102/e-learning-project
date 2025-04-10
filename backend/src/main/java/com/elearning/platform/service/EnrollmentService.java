package com.elearning.platform.service;

import com.elearning.platform.entity.Enrollment;
import com.elearning.platform.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    // Add new Enrollment
    public Enrollment saveEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    // Get all Enrollments
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    // Get Enrollments by User ID
    public List<Enrollment> getEnrollmentsByUserId(String userId) {
        return enrollmentRepository.findByUserId(userId);
    }

    // Delete Enrollment by ID
    public void deleteEnrollmentById(String id) {
        enrollmentRepository.deleteById(id);
    }
}
