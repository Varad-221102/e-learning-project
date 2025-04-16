package com.elearning.platform.controller;

import com.elearning.platform.entity.Payment;
import com.elearning.platform.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    //Only users can make payments
    @PreAuthorize("hasRole('USER')")
    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.savePayment(payment);
    }

    //Only admins can view all payments
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    //Users and admins can get payments by user ID
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping("/user/{userId}")
    public List<Payment> getPaymentsByUserId(@PathVariable String userId) {
        return paymentService.getPaymentsByUserId(userId);
    }
}
