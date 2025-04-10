package com.elearning.platform.repository;

import com.elearning.platform.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // Optional: add custom queries if needed
    User findByUsername(String username);
    User findByEmail(String email);
}
