package com.elearning.platform.repository;

import com.elearning.platform.entity.Enrollment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends MongoRepository<Enrollment, String> {

    // Custom Query: Find Enrollments by User ID
    List<Enrollment> findByUserId(String userId);

    // Custom Query: Find Enrollments by Course ID
    List<Enrollment> findByCourseId(String courseId);
}
