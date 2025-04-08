package com.elearning.service;

import com.elearning.platform.entity.Course;
import com.elearning.platform.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourse(String id) {
        return courseRepository.findById(id);
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }

    public Course approveCourse(String id) {
        Course course = courseRepository.findById(id).orElseThrow();
        course.setApproved(true);
        return courseRepository.save(course);
    }

    public List<Course> getApprovedCourses() {
        return courseRepository.findByApproved(true);
    }
}
