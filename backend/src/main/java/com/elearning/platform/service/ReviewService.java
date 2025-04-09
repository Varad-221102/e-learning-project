package com.elearning.platform.service;

import com.elearning.platform.entity.Course;
import com.elearning.platform.entity.Review;
import com.elearning.platform.repository.CourseRepository;
import com.elearning.platform.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired private ReviewRepository reviewRepo;
    @Autowired
    private CourseRepository courseRepo;

    public Review submitReview(Review review) {
        Review saved = reviewRepo.save(review);
        updateCourseRating(review.getCourseId());
        return saved;
    }

    public List<Review> getReviews(String courseId) {
        return reviewRepo.findByCourseId(courseId);
    }

    public void updateCourseRating(String courseId) {
        List<Review> reviews = reviewRepo.findByCourseId(courseId);
        double avg = reviews.stream().mapToInt(Review::getRating).average().orElse(0);
        Course course = courseRepo.findById(courseId).orElseThrow();
        course.setAverageRating(avg);
        courseRepo.save(course);
    }
}
