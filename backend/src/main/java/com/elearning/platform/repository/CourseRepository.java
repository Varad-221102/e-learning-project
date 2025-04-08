package com.elearning.platform.repository;

import com.elearning.platform.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CourseRepository extends MongoRepository<Course, String> {
    List<Course> findByApproved(boolean approved);
}
