package com.elearning.platform.controller;

import com.elearning.platform.entity.Review;
import com.elearning.platform.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public Review submitReview(@RequestBody Review review) {
        return reviewService.submitReview(review);
    }

    @GetMapping("/{courseId}")
    public List<Review> getCourseReviews(@PathVariable String courseId) {
        return reviewService.getReviews(courseId);
    }
}
