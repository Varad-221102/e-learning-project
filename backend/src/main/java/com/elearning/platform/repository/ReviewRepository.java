package com.elearning.platform.repository;

import com.elearning.platform.entity.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewRepository extends MongoRepository<Review, String> {
    List<Review> findByCourseId(String courseId);
}
