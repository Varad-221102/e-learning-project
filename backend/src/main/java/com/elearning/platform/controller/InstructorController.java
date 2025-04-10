package com.elearning.platform.controller;

import com.elearning.platform.entity.Instructor;
import com.elearning.platform.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/instructors")
@CrossOrigin(origins = "*")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    // Add Instructor
    @PostMapping
    public Instructor addInstructor(@Valid @RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }

    // Get All Instructors
    @GetMapping
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    // Get Instructor by ID
    @GetMapping("/{id}")
    public Optional<Instructor> getInstructorById(@PathVariable String id) {
        return instructorService.getInstructorById(id);
    }
}
