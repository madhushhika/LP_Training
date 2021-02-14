package com.madhushika.bookstore.payment.controller;
import com.madhushika.bookstore.commons.model.member.Member;
import com.madhushika.bookstore.commons.model.payment.Payment;
import com.madhushika.bookstore.payment.model.Response;
import com.madhushika.bookstore.payment.model.SimpleResponse;
import com.madhushika.bookstore.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping
    public Payment save(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }

    @GetMapping(value = "/{id}")
    public Response getPayment(@PathVariable int id, @RequestParam(required = false) String type) {
        if(type==null){
            return  new SimpleResponse(paymentService.findById(id));
        }else{
            return    paymentService.findDetailResponse(id);
        }



    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.findAll();
    }
}
