package com.elearning.platform.service;

import com.elearning.platform.entity.Course;
import com.elearning.platform.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

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
        Course course = courseRepo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Course not found with id: " + id));
        course.setTitle(updatedCourse.getTitle());           // Set new title
        course.setDescription(updatedCourse.getDescription()); // Set new description
        course.setAverageRating(updatedCourse.getAverageRating()); // Set new average rating, if needed
        return courseRepo.save(course);
    }

    public void deleteCourse(String id) {
        courseRepo.deleteById(id);
    }

    public Course approveCourse(String id) {
        Course course = courseRepo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Course not found with id: " + id));
        course.setApproved(true);
        return courseRepo.save(course);
    }
}
