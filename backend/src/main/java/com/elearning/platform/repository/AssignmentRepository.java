package com.elearning.platform.repository;

import com.elearning.platform.entity.Assignment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssignmentRepository extends MongoRepository<Assignment, String> {}
