package com.elearning.platform.repository;

import com.elearning.platform.entity.Instructor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InstructorRepository extends MongoRepository<Instructor, String> {
}
