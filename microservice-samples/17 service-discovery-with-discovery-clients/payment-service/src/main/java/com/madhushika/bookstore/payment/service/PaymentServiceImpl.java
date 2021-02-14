package com.madhushika.bookstore.payment.service;


import com.madhushika.bookstore.commons.model.fund.Fund;
import com.madhushika.bookstore.commons.model.member.Member;
import com.madhushika.bookstore.commons.model.payment.Payment;
import com.madhushika.bookstore.payment.model.DetailResponse;
import com.madhushika.bookstore.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    PaymentRepository paymentRepository;

    @LoadBalanced //wecan use @RibbonClient
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;


    @Override
    public Payment save(Payment member) {
        return paymentRepository.save(member);
    }


    @Override
    public Payment findById(int id) {
        Optional<Payment> payment = paymentRepository.findById(id);

        if (payment.isPresent())
            return payment.get();
        else
            return new Payment();

    }

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public DetailResponse findDetailResponse(int id) {

        Payment payment = findById(id);
        Fund fund = getFund(payment.getFundId());
        Member member = getMemberId(payment.getMemberId());

        return new DetailResponse(member, payment, fund);


    }

    private Member getMemberId(int memeberId) {

        Member member = restTemplate.getForObject("http://member/services/members/" + memeberId, Member.class);
        return member;

    }

    private Fund getFund(int fundId) {

        return restTemplate.getForObject("http://fund/services/funds/" + fundId, Fund.class);


    }

}