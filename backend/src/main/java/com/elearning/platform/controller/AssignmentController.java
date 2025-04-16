package com.elearning.platform.controller;

import com.elearning.platform.entity.Assignment;
import com.elearning.platform.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assignments")
@CrossOrigin("*")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @PreAuthorize("hasRole('STUDENT')")
    @PostMapping("/submit")
    public ResponseEntity<?> submitAssignment(@RequestBody Assignment assignment) {
        return ResponseEntity.ok(assignmentService.submitAssignment(assignment));
    }

    @PreAuthorize("hasRole('INSTRUCTOR')")
    @GetMapping("/course/{courseId}")
    public List<Assignment> getByCourse(@PathVariable String courseId) {
        return assignmentService.getAssignmentsByCourse(courseId);
    }
}
