package com.elearning.platform.service;

import com.elearning.platform.entity.Assignment;
import com.elearning.platform.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    public Assignment submitAssignment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }

    public List<Assignment> getAssignmentsByCourse(String courseId) {
        return assignmentRepository.findAll().stream()
                .filter(a -> a.getCourseId().equals(courseId)).toList();
    }
}
