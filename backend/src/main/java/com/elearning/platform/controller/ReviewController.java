package com.elearning.platform.controller;

import com.elearning.platform.entity.Review;
import com.elearning.platform.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    @GetMapping("/course/{courseId}")
    public List<Review> getReviews(@PathVariable String courseId) {
        return reviewService.getReviewsByCourseId(courseId);
    }
}
