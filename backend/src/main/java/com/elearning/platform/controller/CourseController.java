package com.elearning.platform.controller;

import com.elearning.platform.entity.Course;
import com.elearning.platform.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // ✅ Public - Any user can access
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // ✅ Only INSTRUCTOR or ADMIN can create a course
    @PreAuthorize("hasAnyRole('INSTRUCTOR', 'ADMIN')")
    @PostMapping
    public Course addCourse(@Valid @RequestBody Course course) {
        return courseService.addCourse(course);
    }
}
