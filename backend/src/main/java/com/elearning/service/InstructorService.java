package com.elearning.platform.service;

import com.elearning.platform.entity.Instructor;
import com.elearning.platform.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorService {
    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public void deleteInstructor(String id) {
        instructorRepository.deleteById(id);
    }
}
