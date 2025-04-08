package com.elearning.service;

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

        // Calculate average rating
        List<Review> reviews = reviewRepository.findByCourseId(review.getCourseId());
        double avg = reviews.stream().mapToInt(Review::getRating).average().orElse(0.0);

        Course course = courseRepository.findById(review.getCourseId()).orElseThrow();
        course.setAverageRating(avg);
        courseRepository.save(course);

        return savedReview;
    }

    public List<Review> getReviewsByCourseId(String courseId) {
        return reviewRepository.findByCourseId(courseId);
    }
}
