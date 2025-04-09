package com.elearning.platform.service;

import com.elearning.platform.entity.Course;
import com.elearning.platform.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepo;

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    public Course updateCourse(String id, Course updatedCourse) {
        Course course = courseRepo.findById(id).orElseThrow();
        course.setTitle(updatedCourse.getTitle());
        course.setAverageRating(updatedCourse.getDescription());
        return courseRepo.save(course);
    }

    public void deleteCourse(String id) {
        courseRepo.deleteById(id);
    }

    public Course approveCourse(String id) {
        Course course = courseRepo.findById(id).orElseThrow();
        course.setApproved(true);
        return courseRepo.save(course);
    }
}
