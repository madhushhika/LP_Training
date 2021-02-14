package com.madhushika.bookstore.payment.repository;

import com.madhushika.bookstore.commons.model.payment.Payment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentRepository extends JpaRepository<Payment,Integer> {


}
