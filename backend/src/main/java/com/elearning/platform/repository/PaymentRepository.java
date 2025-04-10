package com.elearning.platform.repository;

import com.elearning.platform.entity.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {

    // Custom Query: Get Payments by User ID
    List<Payment> findByUserId(String userId);

    // Custom Query: Get Payments by Course ID
    List<Payment> findByCourseId(String courseId);
}
