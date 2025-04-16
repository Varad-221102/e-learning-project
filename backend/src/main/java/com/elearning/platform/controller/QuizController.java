package com.elearning.platform.controller;

import com.elearning.platform.entity.Quiz;
import com.elearning.platform.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
@CrossOrigin("*")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PreAuthorize("hasRole('INSTRUCTOR')")
    @PostMapping("/create")
    public ResponseEntity<?> createQuiz(@RequestBody Quiz quiz) {
        return ResponseEntity.ok(quizService.createQuiz(quiz));
    }

    @PreAuthorize("hasRole('STUDENT')")
    @GetMapping("/course/{courseId}")
    public List<Quiz> getByCourse(@PathVariable String courseId) {
        return quizService.getAllByCourseId(courseId);
    }
}
