package com.madhushika.bookstore.payment.service;

import com.madhushika.bookstore.commons.model.payment.Payment;
import com.madhushika.bookstore.payment.model.DetailResponse;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface PaymentService {


    Payment save(Payment member);

    List<Payment> findAll();

    Payment findById(int id);

    DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException;
}