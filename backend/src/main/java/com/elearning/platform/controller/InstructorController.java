package com.elearning.platform.controller;

import com.elearning.platform.entity.Instructor;
import com.elearning.platform.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")

public class InstructorController {
    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping
    public List<Instructor> getAll() {
        return instructorService.getAllInstructors();
    }

    @PostMapping
    public Instructor add(@RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }

    @PutMapping("/{id}")
    public Instructor update(@PathVariable String id, @RequestBody Instructor instructor) {
        instructor.setId(id);
        return instructorService.updateInstructor(instructor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        instructorService.deleteInstructor(id);
    }
}
