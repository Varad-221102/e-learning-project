package com.elearning.platform.controller;

import com.elearning.platform.entity.Review;
import com.elearning.platform.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin(origins = "*")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    //Only users can submit reviews
    @PreAuthorize("hasRole('USER')")
    @PostMapping
    public Review submitReview(@RequestBody Review review) {
        return reviewService.submitReview(review);
    }

    //Public access to read reviews
    @GetMapping("/{courseId}")
    public List<Review> getCourseReviews(@PathVariable String courseId) {
        return reviewService.getReviews(courseId);
    }
}
