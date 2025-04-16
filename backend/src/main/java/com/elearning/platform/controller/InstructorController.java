package com.elearning.platform.controller;

import com.elearning.platform.entity.Instructor;
import com.elearning.platform.service.InstructorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/instructors")
@CrossOrigin(origins = "*")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    // Only admins can add instructors
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Instructor addInstructor(@Valid @RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }

    // Public access (or restrict as needed)
    @GetMapping
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    // Public access (or restrict as needed)
    @GetMapping("/{id}")
    public Optional<Instructor> getInstructorById(@PathVariable String id) {
        return instructorService.getInstructorById(id);
    }
}
