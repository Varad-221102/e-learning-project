package com.elearning.platform.service;

import com.elearning.platform.entity.Course;
import com.elearning.platform.entity.Review;
import com.elearning.platform.repository.CourseRepository;
import com.elearning.platform.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final CourseRepository courseRepository;

    public ReviewService(ReviewRepository reviewRepository, CourseRepository courseRepository) {
        this.reviewRepository = reviewRepository;
        this.courseRepository = courseRepository;
    }

    public Review addReview(Review review) {
        Review savedReview = reviewRepository.save(review);

        // Calculate average rating for the course
        List<Review> reviews = reviewRepository.findByCourseId(review.getCourseID());
        double avg = reviews.stream()
                .mapToInt(Review::getRating)
                .average()
                .orElse(0.0);

        Course course = courseRepository.findById(review.getCourseID())
                .orElseThrow(() -> new RuntimeException("Course not found with ID: " + review.getCourseID()));
        course.setAverageRating(avg);
        courseRepository.save(course);

        return savedReview;
    }

    public List<Review> getReviewsByCourseId(String courseID) {
        return reviewRepository.findByCourseId(courseID);
    }
}
